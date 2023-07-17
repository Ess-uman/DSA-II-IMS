package com.caessuman3020.inventorysystemmanagement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class database {
    public static Connection connectionDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8111/inventory", "root","");
            return connect;
        }catch (Exception e){e.printStackTrace();}
        return null;
    }
}
