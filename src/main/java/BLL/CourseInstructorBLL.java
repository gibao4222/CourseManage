/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.CourseInstructorDAL;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class CourseInstructorBLL {
    CourseInstructorDAL s = new CourseInstructorDAL();
    public ArrayList readCourseInstructor() throws SQLException{
        return s.readCourseInStructor();
    }
}
