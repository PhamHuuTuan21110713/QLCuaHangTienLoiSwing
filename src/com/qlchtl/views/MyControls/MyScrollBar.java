/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.views.MyControls;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import java.awt.Color;

/**
 *
 * @author Dell
 */
public class MyScrollBar extends JScrollBar{
    public MyScrollBar() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.WHITE);
    }
}
