package com.library.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystem extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1;

    public LibraryManagementSystem() {

        setSize(1100,390);
        setLayout(null);
        setLocation(50,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        l1 = new JLabel("");

        b1 = new JButton();
        b1.setText("Login/Sign Up");
        b1.setFont(new Font("Sans ",Font.ITALIC,20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.GRAY);
        b1.setFocusable(false);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("com/library/management/system/icons/first.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1100, 390,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);//Converting the Whole Image as A BackGround!

        b1.setBounds(820,250,190,40);
        l1.setBounds(0, 0, 1100, 390);
        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        new Login_User().setVisible(true);
        this.setVisible(false);

    }

    public static void main(String[] args) {
        LibraryManagementSystem window = new LibraryManagementSystem();
        window.setVisible(true);
    }
}