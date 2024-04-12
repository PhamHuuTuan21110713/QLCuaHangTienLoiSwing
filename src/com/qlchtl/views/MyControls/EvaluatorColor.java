/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.views.MyControls;
import java.awt.Color;
/**
 *
 * @author Dell
 */
public class EvaluatorColor {
    public static Color evaluate(Color color, Color colorTarget, float fraction) {
        int r = color.getRed()
                + (int) ((colorTarget.getRed() - color.getRed()) * fraction + 0.5f);
        int g = color.getGreen()
                + (int) ((colorTarget.getGreen() - color.getGreen()) * fraction + 0.5f);
        int b = color.getBlue()
                + (int) ((colorTarget.getBlue() - color.getBlue()) * fraction + 0.5f);
        int a = color.getAlpha()
                + (int) ((colorTarget.getAlpha() - color.getAlpha()) * fraction + 0.5f);
        Color value = new Color(r, g, b, a);
        return value;
    }
}
