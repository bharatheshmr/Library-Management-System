package com.library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login_User extends JFrame implements ActionListener {

    private final JTextField textField;
    private final JPasswordField passwordField;
    private final JButton b1;
    private final JButton b2;
    private final JButton b3;

    public  Login_User(){

        setTitle("Login Window");
        setBackground(new Color(169, 169, 169));
        setLayout(null);
        setBounds(360, 150, 600, 400);//Making the JFrame appear in the middle (depends on the Screen Ratio!)
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(new Color(176, 224, 230));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(124, 89, 95, 24);
        panel.add(l1);

        JLabel l2 = new JLabel("Password : ");
        l2.setBounds(124, 124, 95, 24);
        panel.add(l2);

        textField = new JTextField();
        textField.setBounds(210, 93, 157, 20);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(210, 128, 157, 20);
        passwordField.setEchoChar('*');
        panel.add(passwordField);



        b1 = new JButton("Login");
        b1.addActionListener(this);

        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(250, 250, 210));
        b1.setBounds(149, 181, 113, 39);
        b1.setFocusable(false);
        panel.add(b1);

        b2 = new JButton("SignUp");
        b2.addActionListener(this);

        b2.setForeground(new Color(139, 69, 19));
        b2.setBackground(new Color(255, 235, 205));
        b2.setBounds(289, 181, 113, 39);
        b2.setFocusable(false);
        panel.add(b2);

        b3 = new JButton("Forgot Password");
        b3.addActionListener(this);

        b3.setForeground(new Color(205, 92, 92));
        b3.setBackground(new Color(253, 245, 230));
        b3.setBounds(199, 231, 179, 39);
        b3.setFocusable(false);
        panel.add(b3);

        JLabel l3 = new JLabel("Trouble Logging IN??");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setForeground(new Color(255, 0, 0));
        l3.setBounds(50, 240, 160, 20);
        panel.add(l3);

    }


    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == b1){
            try {
                Conn con = new Conn();


                String sql = "select * from account where username=? and password=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    this.dispose();//Closes the Window!(Disposes)
                    new Loading().setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Login!!",
                                             "Invalid Entry",JOptionPane.ERROR_MESSAGE);

                /*if(textField.getText().equals("") || passwordField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Required Credentials!","",JOptionPane.ERROR_MESSAGE);
                }*/

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        if(ae.getSource() == b2){
            setVisible(false);
            this.dispose();//Closes the Window!(Disposes)
            Signup su = new Signup();
            su.setVisible(true);
        }

        if(ae.getSource() == b3){
            setVisible(false);
            Forgot forgot = new Forgot();
            forgot.setVisible(true);
            this.dispose();//Closes the Window!(Disposes)
        }

    }

    public static void main(String[] args) {
        new Login_User().setVisible(true);
    }

}
