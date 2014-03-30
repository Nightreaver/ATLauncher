/**
 * Copyright 2013-2014 by ATLauncher and Contributors
 *
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */
package com.atlauncher.gui;

import com.atlauncher.data.Account;

import javax.swing.*;
import java.awt.*;

public class AccountsDropDownRenderer extends JLabel implements ListCellRenderer {

    public AccountsDropDownRenderer() {
        setOpaque(true);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setPreferredSize(new Dimension(200, 40));
        setIconTextGap(10);
    }

    /*
     * This method finds the assets.image and text corresponding to the selected value and returns the
     * label, set up to display the text and assets.image.
     */
    public Component getListCellRendererComponent(JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        Account account = (Account) value;

        if (value == null) {
            return this;
        }

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        ImageIcon icon = account.getMinecraftHead();
        String username = account.getMinecraftUsername();
        setIcon(icon);
        setText(username);
        setFont(list.getFont());

        return this;
    }
}