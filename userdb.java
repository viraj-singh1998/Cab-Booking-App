/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author viraj
 */
public class userdb {
    
    public static Connection dbconnect() {
        Connection conn = null;
        
        try {
            String url = "jdbc:sqlite:C:\\Users\\viraj\\Desktop\\OOP Database\\userf.sqlite";
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
        public static Connection dbconnect1() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:\\Users\\viraj\\Desktop\\OOP Database\\userf.sqlite";
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
        public static Connection dbconnect2() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:\\Users\\viraj\\Desktop\\OOP Database\\userf.sqlite";
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}