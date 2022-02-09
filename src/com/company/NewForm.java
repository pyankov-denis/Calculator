package com.company;

import javax.swing.*;

public class NewForm extends JFrame{
    private JPanel panel1;
    private JLabel label;

    public NewForm(String str){
        this.setTitle(str);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }
}
