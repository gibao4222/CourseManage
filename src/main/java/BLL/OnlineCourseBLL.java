/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OnlineCourseDAL;
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
    public ArrayList readOnlineCourse1() throws SQLException{
        return s.readOnlineCourse1();
    }       
}
