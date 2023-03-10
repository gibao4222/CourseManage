/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OnSiteCourseDAL;
import DTO.OnSiteCourseDTO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class OnSiteCourseBLL {
    OnSiteCourseDAL s = new OnSiteCourseDAL();
    public ArrayList readOnSiteCourse() throws SQLException{
        return s.readOnSiteCourse();
    }
    public ArrayList readStudentOnSiteCourse(int courseID) throws SQLException{
        return s.readStudentOnSiteCourse(courseID);
    }
    public int insertOnSiteCourse(OnSiteCourseDTO osc) throws SQLException{
        return s.insertOnSiteCourse(osc);
    }
    public int deleteOnSiteCourse(int id) throws SQLException{
        return s.deleteOnSiteCourse(id);
    }
    public int updateOnSiteCourse(OnSiteCourseDTO sNew) throws SQLException{
        return s.updateOnSiteCourse(sNew);
    }
    public ArrayList findOnSiteCourse (String str,String value) throws SQLException{
        return s.findOnSiteCourse(str, value);
    }
}
