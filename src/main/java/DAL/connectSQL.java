/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author duy
 */
public class connectSQL {
    private Connection con;
    private Statement s;
    public void openConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String dbUrl="jdbc:mysql://localhost:3306/school?useUnicode=yes&characterEncoding=UTF-8";
            String username="root";String password="";
            con = DriverManager.getConnection(dbUrl,username,password);
            s=(Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            System.out.println("Connected");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public Connection getConnection(){
        return con;
    }
}
