/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Custom.Model_Card;
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
    public ArrayList readStudentOnlineCourse(int courseID) throws SQLException{
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
    public int updateOnlineCourse(OnlineCourseDTO sNew) throws SQLException{
        String query ="Update onlinecourse SET url=? WHERE CourseID = ?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setString(1,sNew.getUrl());
        p.setInt(2, sNew.getCourseID());
        int rs = p.executeUpdate();
        return rs;
    }
    public int insertOnlineCourse(OnlineCourseDTO s) throws SQLException{
        String query = "Insert onlinecourse (CourseID,url) VALUES(?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, s.getCourseID());
        p.setString(2, s.getUrl());
        int rs = p.executeUpdate();
        return rs;
    }
    public int deleteOnlineCourse(int id) throws SQLException{
        String query = "DELETE FROM onlinecourse WHERE CourseID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, id);
        int rs = p.executeUpdate();
        return rs;
    }
    public ArrayList findOnlineCourse (String str, String value) throws SQLException{
        String query="";
        PreparedStatement p = null;
        if(str.equals("Mã khóa học")){
            query = "SELECT onlinecourse.CourseID, Title, url FROM `course`, `onlinecourse` WHERE course.CourseID=onlinecourse.CourseID AND onlinecourse.CourseID LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+value+"%");
        }
        else if(str.equals("Tên khóa học")){
            query = "SELECT onlinecourse.CourseID, Title, url FROM `course`, `onlinecourse` WHERE course.CourseID=onlinecourse.CourseID AND course.Title LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+value+"%");
        }
        else if(str.equals("Số tín chỉ")){
            query = "SELECT onlinecourse.CourseID, Title, url FROM `course`, `onlinecourse` WHERE course.CourseID=onlinecourse.CourseID AND Credits=?";
            p=con.prepareStatement(query); 
            p.setInt(1, Integer.parseInt(value));
        }
        else{
            query = "SELECT onlinecourse.CourseID, Title, url FROM `course`, `onlinecourse`, `department`  WHERE course.CourseID=onlinecourse.CourseID AND course.DepartmentID = department.DepartmentID AND department.Name LIKE ?";
            p=con.prepareStatement(query); 
            p.setString(1, "%"+value+"%");
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
