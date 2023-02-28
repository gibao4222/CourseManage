/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DTO.StudentDTO;
import DAL.PersonDAL;
import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class StudentBLL {
    PersonDAL stdDal = new PersonDAL();
    public List LoadStudent(int page) throws SQLException{
        int numofrecords = 30;
        ArrayList list = stdDal.readStudents();
        int size = list.size();
        int from, to;
        from = (page-1) * numofrecords;
        to = page * numofrecords;
        return (List) list.subList(from, Math.min(to,size));
    }
}
