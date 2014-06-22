// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.repository.ui.wizards.metadata.connection.files.xml;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.talend.datatools.xml.utils.ATreeNode;
import org.talend.repository.ui.wizards.metadata.connection.files.xml.treeNode.FOXTreeNode;

/**
 * DOC ycbai class global comment. Detailled comment
 */
public class FoxNodeComboViewProvider extends ArrayContentProvider implements ILabelProvider {

    public void addListener(ILabelProviderListener listener) {
    }

    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    public void removeListener(ILabelProviderListener listener) {
    }

    public Image getImage(Object element) {
        return null;
    }

    public String getText(Object element) {
        String text = "";
        if (element instanceof ATreeNode) {
            text = String.valueOf(((ATreeNode) element).getValue());
        } else if (element instanceof FOXTreeNode) {
            text = ((FOXTreeNode) element).getLabel();
        }

        return text;
    }

}