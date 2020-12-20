package com.library.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

    private JPanel contentPane;
    private JProgressBar progressBar;
    Connection conn;
    int s;
    Thread th;

    public Loading() {

        super("Loading");
        th = new Thread(this);

        setBounds(360, 150, 600, 400);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label1 = new JLabel("Smart Library v1.1");
        label1.setForeground(new Color(74, 30, 177));
        label1.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        label1.setBounds(130, 46, 500, 35);
        contentPane.add(label1);

        progressBar = new JProgressBar();
        progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
        progressBar.setStringPainted(true);
        progressBar.setBounds(130, 135, 300, 25);
        contentPane.add(progressBar);

        JLabel label2 = new JLabel("Please Wait....");
        label2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
        label2.setForeground(new Color(182, 77, 26));
        label2.setBounds(200, 165, 150, 20);
        contentPane.add(label2);


//        JPanel panel = new JPanel();
//        panel.setBackground(Color.WHITE);
//        panel.setBounds(0, 0, 590, 390);
//        contentPane.add(panel);

        setUploading();
    }

    public void setUploading() {
        th.start();//Calls the Run Method ,you can use th.run();
    }
    public void run() {
        try {
            for (int i = 0; i < 200; i++) {
                s = s + 1;
                int m = progressBar.getMaximum();
                int v = progressBar.getValue();
                if (v < m) {
                    progressBar.setValue(progressBar.getValue() + 1);
                } else {
                    i = 201;
                    setVisible(false);
                    new Home().setVisible(true);
                    this.dispose();
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Loading().setVisible(true);
    }
}
