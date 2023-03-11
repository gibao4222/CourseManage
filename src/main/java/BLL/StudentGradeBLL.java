/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.StudentGradeDAL;
import DTO.StudentDTO;
import DTO.StudentGradeDTO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class StudentGradeBLL {
    StudentGradeDAL s = new StudentGradeDAL();
    public ArrayList reaadStudentGrade() throws SQLException{
        return s.readStudentGrade();
    }
    public ArrayList readNameStudentGrade() throws SQLException{
        return s.readNameStudentGrade();
    }
    
    public int insertStudent(StudentGradeDTO sDTO) throws SQLException{
        return s.insertStudent(sDTO);
    }
    
    public int getIdStudentFromFullname(String name) throws SQLException{
        return s.getIdStudentFromFullname(name);
    }
    public ArrayList readNameCourseGrade() throws SQLException{
        return s.readNameCourseGrade();
    }
    public int getIdCourseGrade(String name) throws SQLException{
        return s.getIdCourseGrade(name);
    }
    public int deleteStudent(int EnrollmentID) throws SQLException{
        return s.deleteStudent(EnrollmentID);
    }
     public int updateStudent(StudentGradeDTO sDTO) throws SQLException{
         return s.updateStudent(sDTO);
     }

    public ArrayList findStudentGrade (String str, String value) throws SQLException{
        return s.findStudentGrade(str, value);
    }
}
