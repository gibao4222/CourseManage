/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.OnSiteCourseDTO;
import DTO.OnlineCourseDTO;
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
    public ArrayList readOnSiteCourse1() throws SQLException{
        String query = "SELECT onsitecourse.CourseID, Title, Credits, Name FROM `onsitecourse`, `course`, `department`  WHERE  onsitecourse.CourseID = course.CourseID AND Department.DepartmentID = course.DepartmentID";
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
    public int updateOnSiteCourse(OnSiteCourseDTO sNew) throws SQLException{
        String query ="Update onsitecourse SET Location=?, Days=?, Time=? WHERE CourseID = ?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setString(1, sNew.getLocation());
        p.setString(2,sNew.getDays());
        p.setTime(3, sNew.getTime());
        p.setInt(4, sNew.getCourseID());
        int rs = p.executeUpdate();
        return rs;
    }
    public int insertOnSiteCourse(OnSiteCourseDTO s) throws SQLException{
        String query = "Insert onSitecourse (CourseID, Location, Days, Time) VALUES(?,?,?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, s.getCourseID());
        p.setString(2, s.getLocation());
        p.setString(3, s.getDays());
        p.setTime(4, s.getTime());
        
        int rs = p.executeUpdate();
        return rs;
    }
    public int deleteOnlineCourse(OnSiteCourseDTO s) throws SQLException{
        String query = "DELETE FROM onsitecourse WHERE CourseID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, s.getCourseID());
        int rs = p.executeUpdate();
        return rs;
    }
    public ArrayList findOnlineCourse (int courseaID,String title, String location) throws SQLException{
        String query="";
        PreparedStatement p = null;
        if(courseaID!=0){
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse` WHERE course.CourseID=onsitecourse.CourseID AND course.CourseID=?";
            p=con.prepareStatement(query); 
            p.setInt(1, courseaID);
        }
        else if(!title.equals("") && location.equals("")){
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse` WHERE course.CourseID=onsitecourse.CourseID AND course.Title LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+title+"%");
        }
        else if(title.equals("") && !location.equals("")){
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse` WHERE course.CourseID=onsitecourse.CourseID AND Location LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+location+"%");
        }
        else{
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse` WHERE course.CourseID=onsitecourse.CourseID AND onsitecourse.Location LIKE ? AND course.Title LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+location+"%");
            p.setString(2, "%"+title+"%");
        }
         ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null){
            while(rs.next()){
                OnSiteCourseDTO s = new OnSiteCourseDTO();
                s.setCourseID(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setLocation(rs.getString("Location"));
                s.setDays(rs.getString("Days"));
                s.setTime(rs.getTime(title));
                List.add(s);
            }
        }
        return List;
        
    }
}
