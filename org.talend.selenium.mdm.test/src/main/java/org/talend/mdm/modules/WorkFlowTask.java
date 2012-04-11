package org.talend.mdm.modules;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.talend.mdm.Base;
import org.talend.mdm.impl.LogonImpl;
import org.testng.Assert;


public class WorkFlowTask extends Base{
	


	public void switchDriver(WebDriver dri){
		
		this.driver=dri;
		
	}
	

	
	public void openMenuGoven() {
		
		this.waitfor(By.xpath(locator.getString("xpath.menu.goven")), WAIT_TIME_MIN);
		this.clickElementByXpath(locator.getString("xpath.menu.goven"));
		
	}

	public void openMenuWorkFlowTask() {
		
		this.waitfor(By.id(locator.getString("id.menu.workflowtask")), WAIT_TIME_MIN);
		this.clickElementById(locator.getString("id.menu.workflowtask"));
		
	}
	
	public void sortWorkFlowTaskBydate(){
		
		this.moveToElement(driver.findElement(By.xpath("//div[text()='Ready Date']")));
		this.clickElementByXpath("//div[contains(@class,'x-grid3-hd-inner x-grid3-hd-3')]//a[@class='x-grid3-hd-btn']");
		
	}
	
	public void openAWorkTask(){
		this.clickElementByXpath("//span[contains(@class,'x-panel-header-text') and text()='Workflow Tasks']//ancestor::div[contains(@id,'WorkflowTasksPanel')]//div[contains(@class,'x-grid3-body')]//div[contains(@class,'x-grid3-row ')][1]");
	    this.doubleClick(this.getElementByXpath("//span[contains(@class,'x-panel-header-text') and text()='Workflow Tasks']//ancestor::div[contains(@id,'WorkflowTasksPanel')]//div[contains(@class,'x-grid3-body')]//div[contains(@class,'x-grid3-row ')][1]"));
	}
	
	public void openRelatedRecord(){
		this.clickElementByXpath("//button[contains(@class,'wftask_bt_openRecord') and text()='Open Record']");
	}
	
	public void approveBoxChecked(){
		Assert.assertTrue(this.waitfor(By.xpath("//label[text()='approuve:']//ancestor::div[contains(@class,'x-form-item')]//div[contains(@class,'x-form-check-wrap-inner')]//input"), WAIT_TIME_MID)!=null);
		this.sleepCertainTime(5000);
		this.driver.findElement(By.xpath("//label[text()='approuve:']//ancestor::div[contains(@class,'x-form-item')]//img")).click();
	}
	
	public void clickSearch(){
		
		this.clickElementByXpath("//span[contains(@class,'x-panel-header-text') and text()='Workflow Tasks']//ancestor::div[contains(@id,'WorkflowTasksPanel')]//button[text()='Search']");
		
	}
	
	public void clickSubmit(){
		this.clickElementByXpath("//button[text()='Submit']");
	}
	
}