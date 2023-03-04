/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OnSiteCourseDAL;
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
    public ArrayList readOnSiteCourse1() throws SQLException{
        return s.readOnSiteCourse1();
    }
}
