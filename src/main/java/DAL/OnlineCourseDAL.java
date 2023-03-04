/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.OnlineCourseDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class OnlineCourseDAL extends connect{
    public OnlineCourseDAL(){
        super();
        this.openConnection();
    }
    public ArrayList readOnlineCourse1() throws SQLException{
        String query = "SELECT onlinecourse.CourseID, Title, Credits, Name FROM `onlinecourse`, `course`, `department`  WHERE  onlinecourse.CourseID = course.CourseID AND Department.DepartmentID = course.DepartmentID";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                Object[] s = new Object[4];
                s[0]=(rs.getInt("CourseID"));
                s[1]=(rs.getString("Title"));
                s[2]=(rs.getString("Credits"));
                s[3]=(rs.getString("Name"));
                List.add(s);
            }
        }
        return List;
    }
    public ArrayList readOnlineCourse() throws SQLException{
        String query = "SELECT onlinecourse.CourseID, Title, url FROM `onlinecourse`, `course` WHERE onlinecourse.CourseID = course.CourseID";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                OnlineCourseDTO s = new OnlineCourseDTO();
                s.setCourseID(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setUrl(rs.getString("url"));
                List.add(s);
            }
        }
        return List;
    }
    public int updateOnlineCourse(int courseIDOld, OnlineCourseDTO sNew) throws SQLException{
        String query ="Update onlinecourse SET url=? WHERE CourseID = ?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setInt(1, sNew.getCourseID());
        p.setString(2,sNew.getUrl());
        p.setInt(3, courseIDOld);
        int rs = p.executeUpdate();
        return rs;
    }
    public int insertCourseInstructor(OnlineCourseDTO s) throws SQLException{
        String query = "Insert onlinecourse (CourseID,url) VALUES(?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, s.getCourseID());
        p.setString(2, s.getUrl());
        int rs = p.executeUpdate();
        return rs;
    }
    public int deleteOnlineCourse(OnlineCourseDTO s) throws SQLException{
        String query = "DELETE FROM onlinecourse WHERE CourseID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, s.getCourseID());
        int rs = p.executeUpdate();
        return rs;
    }
    public ArrayList findOnlineCourse (int courseaID,String title) throws SQLException{
        String query="";
        PreparedStatement p = null;
        if(courseaID!=0){
            query = "SELECT onlinecourse.CourseID, Title, url FROM `course`, `onlinecourse` WHERE course.CourseID=onlinecourse.CourseID AND course.CourseID=?";
            p=con.prepareStatement(query); 
            p.setInt(1, courseaID);
        }
        else if(courseaID==0 && !title.equals("")){
            query = "SELECT onlinecourse.CourseID, Title, url FROM `course`, `onlinecourse` WHERE course.CourseID=onlinecourse.CourseID AND course.Title LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+title+"%");
        }
         ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null){
            while(rs.next()){
                OnlineCourseDTO s = new OnlineCourseDTO();
                s.setCourseID(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setUrl(rs.getString("url"));
                List.add(s);
            }
        }
        return List;
    }
}
