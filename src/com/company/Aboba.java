package com.company;

import javax.swing.*;

public class Aboba extends JFrame{
    private JPanel panel1;
    private JPanel panel;

    public Aboba(String str){
        this.setTitle(str);
        this.setContentPane(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
