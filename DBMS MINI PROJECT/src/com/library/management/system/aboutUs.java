package com.library.management.system;

import javax.swing.*;
import java.awt.*;

public class aboutUs extends JFrame{

    public aboutUs() {


        setBackground(new Color(173, 216, 230));
        setBounds(300, 140, 540, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);




        JLabel l3 = new JLabel("Library");
        l3.setForeground(new Color(0, 250, 154));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(180, 40, 150, 55);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Management System");
        l4.setForeground(new Color(127, 255, 0));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(90, 90, 405, 40);
        contentPane.add(l4);

        JLabel l5 = new JLabel("v1.1");
        l5.setForeground(new Color(30, 144, 255));
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        l5.setBounds(205, 140, 100, 21);
        contentPane.add(l5);


        JLabel l6 = new JLabel("Developed By :Bharath Kalyan S &");
        l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l6.setBounds(40, 198, 500, 35);
        contentPane.add(l6);


        JLabel l7 = new JLabel(" Bharathesh M R ");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l7.setBounds(38, 228, 600, 35);
        contentPane.add(l7);

        /*JLabel l7 = new JLabel("Mail - ID's : sbharath35@gmail.com , \n bharatheshmr2000@gmail.com ");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l7.setBounds(70, 260, 600, 34);
        contentPane.add(l7);

        JLabel l10 = new JLabel(" BRANCH : CSE ");
        l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
        l10.setBounds(70, 350, 600, 34);
        contentPane.add(l10);

        JLabel l8 = new JLabel("SEM : V");
        l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l8.setBounds(70, 290, 600, 34);
        contentPane.add(l8);

        JLabel l9 = new JLabel(" YEAR : 3 ");
        l9.setForeground(new Color(47, 79, 79));
        l9.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
        l9.setBounds(70, 400, 600, 34);
          contentPane.add(l9);
        */


        contentPane.setBackground(Color.WHITE);
    }

    public static void main(String[] args) { new aboutUs().setVisible(true); }
}
