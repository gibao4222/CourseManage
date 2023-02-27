/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class connect {
    
    protected Connection con;
    private Statement s;
    //private PreparedStatement p;
    
    public void openConnection() {
        try {
            String dbUrl="jdbc:mysql://localhost:3306/school?useUnicode=yes&characterEncoding=UTF-8";
            String username="root";String password="";
            con = DriverManager.getConnection(dbUrl,username,password);
            s = (Statement) con.createStatement();
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet doReadQuery(String sql){
        ResultSet rs = null;
        try {
            rs = s.executeQuery(sql);
        } catch (Exception e) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE,null,e);
        }
        return rs;
    }
}
