/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.StudentGradeDAL;
import DTO.StudentDTO;
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
}
