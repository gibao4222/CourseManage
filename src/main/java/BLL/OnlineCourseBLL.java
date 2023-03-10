/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OnlineCourseDAL;
import DTO.OnlineCourseDTO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class OnlineCourseBLL {
    OnlineCourseDAL s = new OnlineCourseDAL();
    public ArrayList readOnlineCourse() throws SQLException{
        return s.readOnlineCourse();
    }
    public ArrayList readStudentOnlineCourse(int courseID) throws SQLException{
        return s.readStudentOnlineCourse(courseID);
    }   
    public int insertOnlineCourse(OnlineCourseDTO oc) throws SQLException{
        return s.insertOnlineCourse(oc);
    }
    public int deleteOnlineCourse(int id) throws SQLException{
        return s.deleteOnlineCourse(id);
    }
    public int updateOnlineCourse(OnlineCourseDTO sNew) throws SQLException{
        return s.updateOnlineCourse(sNew);
    }
    public ArrayList findOnlineCourse (String str, String value) throws SQLException{
        return s.findOnlineCourse(str, value);
    }
}
