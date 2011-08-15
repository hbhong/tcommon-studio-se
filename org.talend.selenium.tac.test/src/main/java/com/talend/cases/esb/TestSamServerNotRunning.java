package com.talend.cases.esb;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.talend.tac.base.Base;



public class TestSamServerNotRunning extends Esb {
	public String locatorOfAllInputTags = other.getString("commandline.conf.all.input");
	
	
	
	/**
	 * this method is mainly to test in case of samserver is not running
	 * @param zookeeperServer
	 * @param serviceActivityMonitorServer
	 * @param monitorStop
	 */
	@Test
	@Parameters ({"esb.conf.zookeeperServer","esb.conf.serviceActivityMonitorServer.remote.available","esb.conf.serviceActivityMonitorServer.remote.stop"})
	public void testSamServerNotRunning(String zookeeperServer,String serviceActivityMonitorServer,String monitorStop){
		  this.clickWaitForElementPresent("idMenuConfigElement");
		  this.MouseDownWaitForElementPresent("//div[contains(text(),'ESB')]");
		
		  //change sam server to remote stoped
	      this.typeWordsInConfigurationMenu(other.getString("esb.conf.serviceActivityMonitorServer.editButton"), locatorOfAllInputTags, monitorStop);
	      this.typeWordsInConfigurationMenu(other.getString("esb.conf.ZookeeperServer.editButton"), locatorOfAllInputTags, zookeeperServer);
	      this.AssertEqualsInConfigurationMenu(other.getString("esb.conf.serviceActivityMonitorServer.editButton"), locatorOfAllInputTags,
				  monitorStop, other.getString("esb.conf.ServiceActivityMonitorServerStatusIconLocator.wrongURL"));
		  this.waitForTextPresent("SAM Server for this url is unavailable", WAIT_TIME);
		  //open service activity monitor page
		  this.openServiceActivityMonitor();
		  this.clickWaitForElementPresent("//div[@class='header-title' and text()='Service Activity Monitoring']//ancestor::div[@class='x-panel-body x-panel-body-noheader x-panel-body-noborder x-border-layout-ct']//b[text()='Refresh']");
		  this.waitForTextPresent("Can not connect to SAM Server. The server is unavailable or connection...", WAIT_TIME);
	}
	public void AssertEqualsInConfigurationMenu(String locatorOfEditButton,String locatorOfInput,String value,String statusIconLocator){
		this.AssertEqualsInConfigurationMenu(locatorOfEditButton, locatorOfInput, value);
		this.waitForElementPresent(statusIconLocator, WAIT_TIME);//wait and check the icon status.
	}
	public void typeWordsInConfigurationMenu(String locatorOfEditButton,String locatorOfInput,String value){
		 this.clickWaitForElementPresent(locatorOfEditButton);//click the edit button to make the input tag shown.
		 this.typeWaitForElementPresent(locatorOfInput, value);
		
	}
	public void typeWaitForElementPresent(String locator,String value) {
		this.waitForElementPresent(locator, Base.WAIT_TIME);
		selenium.type(locator,value);
		selenium.keyDown(locator, "\\13");
	}
	public void AssertEqualsInConfigurationMenu(String locatorOfEditButton,String locatorOfInput,String value){
		this.clickWaitForElementPresent(locatorOfEditButton);//click the edit button to make the input tag shown.
		this.waitForElementPresent(locatorOfInput, Base.WAIT_TIME);
		assertEquals(selenium.getValue(locatorOfInput), value);
		selenium.fireEvent(locatorOfInput, "blur");
	}
	@AfterMethod
	@Parameters ({"esb.conf.zookeeperServer","esb.conf.serviceActivityMonitorServer.remote.available","esb.conf.serviceActivityMonitorServer.remote.stop"})
	public void logout(String zookeeperServer,String serviceActivityMonitorServer,String monitorStop) {
		  this.clickWaitForElementPresent("idMenuConfigElement");
		  
		  selenium.setSpeed(MAX_SPEED);
		  
		  if(!selenium.isVisible("//div[text()='Zookeeper Server']")) {
			  
			  this.MouseDownWaitForElementPresent("//div[contains(text(),'ESB')]");
			  
		  }
		  selenium.setSpeed(MIN_SPEED);
		  this.typeWordsInConfigurationMenu(other.getString("esb.conf.serviceActivityMonitorServer.editButton"), locatorOfAllInputTags, serviceActivityMonitorServer);
		  this.AssertEqualsInConfigurationMenu(other.getString("esb.conf.serviceActivityMonitorServer.editButton"), locatorOfAllInputTags,
				  serviceActivityMonitorServer, other.getString("esb.conf.ServiceActivityMonitorServerStatusIconLocator"));
//		selenium.click("idLeftMenuTreeLogoutButton");
//		selenium.stop();
	}
	
	
}
