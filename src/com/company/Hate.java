package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hate extends JFrame {


    private JPanel panel1;
    private JButton button1;
    private JButton сButton;
    private JButton a7Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a9Button;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton a3Button;
    private JButton a6Button;
    private JLabel label;
    String turn;
    int a, b;
    int marker=0;
    int celoe;

    public Hate(String str){
        this.setTitle(str);
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);


        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turn = "+";
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turn = "-";
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turn = "*";
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turn = ":";
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(1);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(2);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(3);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(4);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(5);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(6);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(7);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(8);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number(9);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (turn.equals("+")){label.setText(a+b + "");}
                if (turn.equals("-")){label.setText(a-b + "");}
                if (turn.equals("*")){label.setText(a*b + "");}
                if (turn.equals(":")){if (a/b!=0){
                    celoe = a/b;
                    label.setText(celoe + " " + "(" + "ост. " + (a-(celoe*b)) + ")");
                }else {label.setText(a/b + "");}}
            }
        });
        сButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("");
                a = 0;
                b = 0;
            }
        });
    }
    public void number(int n){
        if (marker==0){
            a = n;
            label.setText(n + "");
            marker=1;
        }else{
            b = n;
            label.setText(n + "");
            marker=0;
        }
    }
}
