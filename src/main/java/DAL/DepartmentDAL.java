/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.DepartmentDTO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DepartmentDAL extends connect{
    public DepartmentDAL(){
        super();
        this.openConnection();
    }
    public ArrayList readDepartment() throws SQLException{
        String query = "SELECT * FROM Department";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                DepartmentDTO s = new DepartmentDTO();
                s.setDepartmentID(rs.getInt("DepartmentID"));
                s.setName(rs.getString("Name"));
                s.setBudget(rs.getDouble("Budget"));
                s.setStartDate(rs.getDate("StartDate"));
                s.setAdminstrator(rs.getInt("Administrator"));
                List.add(s);
            }
        }
        return List;
    }
    public int updateStudent(DepartmentDTO s) throws SQLException{
        String query ="Update Department SET Name=?, Budget=?, StartDate=?, Administrator=? WHERE DepartmentID = ?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setString(1, s.getName());
        p.setDouble(2,s.getBudget());
        p.setDate(3, (Date) s.getStartDate());
        p.setInt(4, s.getAdminstrator());
        p.setInt(5, s.getDepartmentID());
        int rs = p.executeUpdate();
        return rs;
    }
    public int insertStudent(DepartmentDTO s) throws SQLException{
        String query = "Insert Department (Name,Budget,StartDate,Administrator) VALUES(?,?,?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setString(1, s.getName());
        p.setDouble(2,s.getBudget());
        p.setDate(3, (Date) s.getStartDate());
        p.setInt(4, s.getAdminstrator());
        int rs = p.executeUpdate();
        return rs;
    }
    public ArrayList findStudent (String Name) throws SQLException{
        String query ="SELECT * FROM Department WHERE Name LIKE ?";
        PreparedStatement p = con.prepareStatement(query);
        p.setString(1, "%"+Name+"%");
        ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null){
            while(rs.next()){
                DepartmentDTO s = new DepartmentDTO();
                s.setDepartmentID(rs.getInt("DepartmentID"));
                s.setName(rs.getString("Name"));
                s.setBudget(rs.getDouble("Budget"));
                s.setStartDate(rs.getDate("StartDate"));
                s.setAdminstrator(rs.getInt("Administrator"));
                List.add(s);
            }
        }
        return List;
    }
    public int deleteStudent(int DepartmentID) throws SQLException{
        String query = "DELETE FROM Department WHERE DepartmentID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, DepartmentID);
        int rs = p.executeUpdate();
        return rs;
    }

}
