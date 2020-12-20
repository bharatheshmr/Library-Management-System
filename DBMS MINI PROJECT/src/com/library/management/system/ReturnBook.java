package com.library.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReturnBook extends JFrame implements ActionListener{


    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JTextField textField4;
    private final JTextField textField5;
    private final JTextField textField6;
    private final JTextField textField7;
    private final JButton b1;
    private final JButton b2;
    private final JButton b3;
    private final JDateChooser dateChooser;

    public ReturnBook() {

        setBounds(290, 170, 617, 363);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Book_id");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(52, 52, 87, 24);
        contentPane.add(lblNewLabel);

        JLabel studentID = new JLabel("Student_id");
        studentID.setForeground(Color.BLACK);
        studentID.setFont(new Font("Tahoma", Font.BOLD, 14));
        studentID.setBounds(243, 52, 87, 24);
        contentPane.add(studentID);

        JLabel lblBook = new JLabel("Book");
        lblBook.setForeground(Color.BLACK);
        lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBook.setBounds(52, 98, 71, 24);
        contentPane.add(lblBook);

        JLabel lblName = new JLabel("Name");
        lblName.setForeground(Color.BLACK);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblName.setBounds(300, 98, 71, 24);
        contentPane.add(lblName);

        JLabel lblCourse = new JLabel("Course");
        lblCourse.setForeground(Color.BLACK);
        lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCourse.setBounds(52, 143, 87, 24);
        contentPane.add(lblCourse);

        JLabel lblBranch = new JLabel("Branch");
        lblBranch.setForeground(Color.BLACK);
        lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblBranch.setBounds(303, 144, 68, 24);
        contentPane.add(lblBranch);

        JLabel lblDateOfIssue = new JLabel("Date of Issue");
        lblDateOfIssue.setForeground(Color.BLACK);
        lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDateOfIssue.setBounds(52, 188, 105, 29);
        contentPane.add(lblDateOfIssue);

        JLabel lblDateOfReturn = new JLabel("Date of Return");
        lblDateOfReturn.setForeground(Color.BLACK);
        lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblDateOfReturn.setBounds(52, 234, 118, 29);
        contentPane.add(lblDateOfReturn);

        textField1 = new JTextField();
        textField1.setForeground(new Color(105, 105, 105));
        textField1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        textField1.setBounds(128, 56, 105, 20);
        contentPane.add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        textField2.setForeground(new Color(105, 105, 105));
        textField2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        textField2.setBounds(340, 56, 93, 20);
        contentPane.add(textField2);
        textField2.setColumns(10);

        b1 = new JButton("Search");
        b1.addActionListener(this);
        b1.setBounds(443, 52, 105, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        contentPane.add(b1);

        textField3 = new JTextField();
        textField3.setEditable(false);
        textField3.setForeground(new Color(0, 100, 0));
        textField3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField3.setBounds(128, 102, 162, 20);
        contentPane.add(textField3);
        textField3.setColumns(10);

        textField4 = new JTextField();
        textField4.setEditable(false);
        textField4.setForeground(new Color(0, 100, 0));
        textField4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField4.setColumns(10);
        textField4.setBounds(369, 102, 179, 20);
        contentPane.add(textField4);

        textField5 = new JTextField();
        textField5.setEditable(false);
        textField5.setForeground(new Color(0, 100, 0));
        textField5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField5.setColumns(10);
        textField5.setBounds(128, 147, 162, 20);
        contentPane.add(textField5);

        textField6 = new JTextField();
        textField6.setForeground(new Color(0, 100, 0));
        textField6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField6.setEditable(false);
        textField6.setColumns(10);
        textField6.setBounds(369, 147, 179, 20);
        contentPane.add(textField6);

        textField7 = new JTextField();
        textField7.setForeground(new Color(0, 100, 0));
        textField7.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
        textField7.setEditable(false);
        textField7.setColumns(10);
        textField7.setBounds(167, 194, 162, 20);
        contentPane.add(textField7);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        dateChooser.setBounds(167, 234, 172, 29);
        contentPane.add(dateChooser);

        b2 = new JButton("Return");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        b2.setBounds(369, 179, 149, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        contentPane.add(b2);

        b3 = new JButton("Back");
        b3.addActionListener(this);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        b3.setBounds(369, 231, 149, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFocusable(false);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 69, 0), 2, true), "Return-Panel",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(10, 24, 569, 269);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }

    public void delete() {
        try {
            Conn con = new Conn();
            String sql = "delete from issueBook where book_id=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, textField1.getText());
            int i = st.executeUpdate();
            if (i > 0)
                JOptionPane.showMessageDialog(null, "Book Returned");
            else
                JOptionPane.showMessageDialog(null, "ERROR");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }


    public void actionPerformed(ActionEvent ae){
        try{
            Conn con = new Conn();
            if(ae.getSource() == b1){

                String sql = "select * from issueBook where student_id = ? and book_id =?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, textField2.getText());
                st.setString(2, textField1.getText());

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    textField3.setText(rs.getString("bname"));
                    textField4.setText(rs.getString("sname"));
                    textField5.setText(rs.getString("course"));
                    textField6.setText(rs.getString("branch"));
                    textField7.setText(rs.getString("dateOfIssue"));
                }
                st.close();
                rs.close();

            }
            if(ae.getSource() == b2){
                String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, textField1.getText());
                st.setString(2, textField2.getText());
                st.setString(3, textField3.getText());
                st.setString(4, textField4.getText());
                st.setString(5, textField5.getText());
                st.setString(6, textField6.getText());
                st.setString(7, textField7.getText());

                st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                int i = st.executeUpdate();
                if (i > 0) {
                    Thread.sleep(2000);
                    JOptionPane.showMessageDialog(null, "Processing.....");
                    Thread.sleep(1000);
                    delete();
                } else
                    JOptionPane.showMessageDialog(null, "ERROR");

                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new Home().setVisible(true);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) { new ReturnBook().setVisible(true); }
}
