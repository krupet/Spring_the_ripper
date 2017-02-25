package com.krupet.screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.util.Random;

//@org.springframework.stereotype.Component
public abstract class ColorFrame extends JFrame {

    @Autowired
    private Color color;

    public ColorFrame() {
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(800), random.nextInt(600));
        getContentPane().setBackground(getColor());
        repaint();
    }

    public abstract Color getColor();
}
