/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.CourseDAL;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class CourseBLL {
    CourseDAL s = new CourseDAL();
    public ArrayList readCourse() throws SQLException{
        return s.readCourse();
    }
    
    public ArrayList getCourseAndOnsiteCourseById(int id) throws SQLException{
        return s.getCourseAndOnsiteCourseById(id);
    }
    
    public ArrayList getCourseAndOnlinesiteCourseById(int id) throws SQLException{
        return s.getCourseAndOnlinesiteCourseById(id);
    }
}
