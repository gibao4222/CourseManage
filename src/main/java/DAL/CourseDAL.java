/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.CourseDTO;
import DTO.StudentDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CourseDAL extends connect{
    public CourseDAL(){
        super();
        this.openConnection();
    }
    public ArrayList readCourse() throws SQLException{
        String query = "SELECT * FROM Course";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                CourseDTO s = new CourseDTO();
                s.setCourseID(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setCreadits(rs.getInt("Creadits"));
                s.setDepartmantID(rs.getInt("DepartmentID"));
                List.add(s);
            }
        }
        return List;
    }
    public int updateCourse(CourseDTO s) throws SQLException{
        String query ="Update Course SET Title=?, Credits=?, DepartmentID=? WHERE CourseID = ?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setString(1, s.getTitle());
        p.setInt(2,s.getCreadits());
        p.setInt(3, s.getDepartmantID());
        p.setInt(4, s.getCourseID());
        int rs = p.executeUpdate();
        return rs;
    }
    public int insertCourse(CourseDTO s) throws SQLException{
        String query = "Insert Course (Title,Credits,DepartmentID) VALUES(?,?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setString(1, s.getTitle());
        p.setInt(2, s.getCreadits());
        p.setInt(3, s.getDepartmantID());
        int rs = p.executeUpdate();
        return rs;
    }
    public ArrayList findCourse (CourseDTO s) throws SQLException{
        String query="";
        PreparedStatement p = null;
        if(s.getCourseID()!=0){
            query="SELECT * FROM course WHERE CourseID=?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getCourseID()+"%");
        }
        else{
            if(!s.getTitle().equals("") && s.getCreadits()==0 && s.getDepartmantID()==0){
                query="SELECT * FROM course WHERE Title LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getTitle()+"%");
            }
            else if(s.getTitle().equals("") && s.getCreadits()!=0 && s.getDepartmantID()==0){
                query="SELECT * FROM course WHERE Credits = ?";
            p = con.prepareStatement(query);
            p.setInt(1, s.getCreadits());
            }
            else if(s.getTitle().equals("") && s.getCreadits()==0 && s.getDepartmantID()!=0){
                query="SELECT * FROM course WHERE DepartmentID = ?";
            p = con.prepareStatement(query);
            p.setInt(1, s.getDepartmantID());
            }
            else if(!s.getTitle().equals("") && s.getCreadits()!=0 && s.getDepartmantID()==0){
                query="SELECT * FROM course WHERE Title LIKE ? AND Credits = ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getTitle()+"%");
            p.setInt(2, s.getCreadits());
            }
            else if(!s.getTitle().equals("") && s.getCreadits()==0 && s.getDepartmantID()!=0){
                query="SELECT * FROM course WHERE Title LIKE ? AND DepartmentID = ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getTitle()+"%");
            p.setInt(2, s.getDepartmantID());
            }
            else if(s.getTitle().equals("") && s.getCreadits()!=0 && s.getDepartmantID()!=0){
                query="SELECT * FROM course WHERE Credits = ? AND DepartmentID =?";
            p = con.prepareStatement(query);
            p.setInt(1, s.getCreadits());
            p.setInt(2, s.getDepartmantID());
            }
            else if(!s.getTitle().equals("") && s.getCreadits()!=0 && s.getDepartmantID()!=0){
                query="SELECT * FROM course WHERE Title LIKE ? AND Credits = ? AND DepartmentID = ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getTitle()+"%");
            p.setInt(2, s.getCreadits());
            p.setInt(3, s.getDepartmantID());
            }
        }
        ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null){
            while(rs.next()){
                CourseDTO s1 = new CourseDTO();
                s1.setCourseID(rs.getInt("CourseID"));
                s1.setTitle(rs.getString("Title"));
                s1.setCreadits(rs.getInt("Creadits"));
                s1.setDepartmantID(rs.getInt("DepartmentID"));
                List.add(s);
            }
        }
        return List;
    }
    public int deleteCourse(int CourseID) throws SQLException{
        String query = "DELETE FROM Course WHERE CourseID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, CourseID);
        int rs = p.executeUpdate();
        return rs;
    }
}
