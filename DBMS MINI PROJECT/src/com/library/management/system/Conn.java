package com.library.management.system;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            String url="jdbc:mysql://localhost:3306/library";
            String userName="root";
            String password="";

            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection(url,userName,password);
            s=c.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
