/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Custom.Model_Card;
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
    public ArrayList readStudentOnSiteCourse(int courseID) throws SQLException{
        String query = "SELECT PersonID, CONCAT(Lastname,' ',Firstname) AS FullName, Grade FROM course, studentgrade, person WHERE course.CourseID = studentgrade.CourseID AND person.PersonID =studentgrade.StudentID AND studentgrade.CourseID=?";
        PreparedStatement p=con.prepareStatement(query); 
        p.setInt(1, courseID);
        ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                Model_Card s = new Model_Card();
                s.setId((rs.getInt("PersonID")));
                s.setPersonName(rs.getString("FullName"));
                s.setGrade(rs.getDouble("Grade"));
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
    public int deleteOnSiteCourse(int id) throws SQLException{
        String query = "DELETE FROM onsitecourse WHERE CourseID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, id);
        int rs = p.executeUpdate();
        return rs;
    }
    public ArrayList findOnSiteCourse (String str,String value) throws SQLException{
        String query="";
        PreparedStatement p = null;
        if(str.equals("Mã khóa học")){
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse` "
                    + "WHERE course.CourseID=onsitecourse.CourseID AND onsitecourse.CourseID LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+value+"%");
        }
        else if(str.equals("Tên khóa học")){
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse` "
                    + "WHERE course.CourseID=onsitecourse.CourseID AND course.Title LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+value+"%");
        }
        else if(str.equals("Số tín chỉ")){
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse` "
                    + "WHERE course.CourseID=onsitecourse.CourseID AND Credits=?";
            p=con.prepareStatement(query); 
            p.setInt(1, Integer.parseInt(value));
        }
        else{
            query = "SELECT onsitecourse.CourseID, Title, Location, Days, Time FROM `course`, `onsitecourse`, `department`  "
                    + "WHERE course.CourseID=onsitecourse.CourseID AND course.DepartmentID = department.DepartmentID AND department.Name LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+value+"%");
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
                s.setTime(rs.getTime("Time"));
                List.add(s);
            }
        }
        return List;
        
    }
}
