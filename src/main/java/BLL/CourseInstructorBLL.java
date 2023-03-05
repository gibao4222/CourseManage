/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.CourseInstructorDAL;
import DTO.CourseInstructorDTO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class CourseInstructorBLL {
    CourseInstructorDAL s = new CourseInstructorDAL();
    CourseInstructorDTO ciDTO = new CourseInstructorDTO();
    public ArrayList readCourseInstructor() throws SQLException{
        return s.readCourseInStructor();
    }
    public ArrayList findCourseInstructor(CourseInstructorDTO ci) throws SQLException{
        return s.findCourseInstructor(ci);
    }
    
    public void deleteCourseInstructor(CourseInstructorDTO ci) throws SQLException{
        s.deleteCourseInstructor(ci);
    }
    
    public ArrayList readNameCourseInstructor() throws SQLException{
        return s.readNameCourseInstructor();
    }
    
}
