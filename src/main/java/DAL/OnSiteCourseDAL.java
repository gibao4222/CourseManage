/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.OnSiteCourseDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Time;

/**
 *
 * @author Admin
 */
public class OnSiteCourseDAL extends connect{
    public OnSiteCourseDAL(){
        super();
        this.openConnection();
    }
    public ArrayList readOnSiteCourse() throws SQLException{
        String query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `onsitecourse`, `course` WHERE onsitecourse.CourseID = course.CourseID";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                OnSiteCourseDTO s = new OnSiteCourseDTO();
                s.setCourseID(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setLocation(rs.getString("Location"));
                s.setDays(rs.getString("Days"));
                s.setTime(rs.getTime("Time"));
                List.add(s);
            }
        }
        return List;
    }
    public int updateOnlineCourse(int courseIDOld, OnSiteCourseDTO sNew) throws SQLException{
        String query ="Update oncourse SET CourseID=?,url=? WHERE CourseID = ?";
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
