/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.CourseInstructorDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CourseInstructorDAL extends connect{
    public CourseInstructorDAL(){
        super();
        this.openConnection();
    }
    public ArrayList readCourseInStructor() throws SQLException{
        String query = "SELECT courseinstructor.CourseID, Title,courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                CourseInstructorDTO s = new CourseInstructorDTO();
                s.setCourseID(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setPersonID(rs.getInt("PersonID"));
                s.setFullName(rs.getString("FullName"));
                List.add(s);
            }
        }
        return List;
    }
    
    public ArrayList readNameCourseInstructor() throws SQLException{
        String query = "SELECT concat(person.Firstname,' ',person.Lastname) as FullName FROM person,courseinstructor WHERE person.PersonID = courseinstructor.PersonID";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                CourseInstructorDTO s = new CourseInstructorDTO();
                s.setFullName(rs.getString("FullName"));
                List.add(s);
            }
        }
        return List;
    }
    public int updateCourseInstructor(CourseInstructorDTO sOld, CourseInstructorDTO sNew) throws SQLException{
        String query ="Update courseinstructor SET CourseID=?,PersonID=? WHERE CourseID = ? AND PersonID = ?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setInt(1, sNew.getCourseID());
        p.setInt(2,sNew.getPersonID());
        p.setInt(3, sOld.getCourseID());
        p.setInt(4, sOld.getPersonID());
        int rs = p.executeUpdate();
        return rs;
    }
    public int insertCourseInstructor(CourseInstructorDTO s) throws SQLException{
        String query = "Insert courseinstructor (CourseID,PersonID) VALUES(?,?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, s.getCourseID());
        p.setInt(2, s.getPersonID());
        int rs = p.executeUpdate();
        return rs;
    }
    public void deleteCourseInstructor(CourseInstructorDTO s) throws SQLException{
        String query = String.format("DELETE from courseinstructor WHERE courseinstructor.PersonID = %d AND courseinstructor.CourseID = %d",s.getCourseID(),s.getPersonID());
        PreparedStatement p = con.prepareStatement(query);
//        p.setString(1, Integer.toString(s.getCourseID()));
//        p.setString(2, Integer.toString(s.getPersonID()));
        int rs = p.executeUpdate(query);
    }
    public ArrayList findCourseInstructor (CourseInstructorDTO s) throws SQLException{
        String query="";
        PreparedStatement p = null;
        if(s.getCourseID()!=0 && s.getPersonID()==0 && s.getTitle().equals("") && s.getFullName().equals("")){
            query = "SELECT courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName,courseinstructor.CourseID, course.Title  FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID AND courseinstructor.CourseID LIKE ?";
//query="SELECT courseinstructor.CourseID, Title,courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID AND courseinstructor.CourseID=?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getCourseID()+"%");
        }
        else if(s.getCourseID()==0 && s.getPersonID()!=0 && s.getTitle().equals("") && s.getFullName().equals("")){
            query = "SELECT courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName,courseinstructor.CourseID, course.Title  FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID AND courseinstructor.PersonID=?";
//query="SELECT courseinstructor.CourseID, Title,courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID AND courseinstructor.PersonID=?";
            p = con.prepareStatement(query);
            p.setInt(1, s.getPersonID());
        }
        else if(s.getCourseID()!=0 && s.getPersonID()!=0 && s.getTitle().equals("") && s.getFullName().equals("")){
            query="SELECT courseinstructor.CourseID, Title,courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID AND courseinstructor.CourseID=? AND courseinstructor.PersonID=?";
            p = con.prepareStatement(query);
            p.setInt(1, s.getCourseID());
            p.setInt(2, s.getPersonID());

        }
        else if(!s.getTitle().equals("") && s.getFullName().equals("")){
            query = "SELECT courseinstructor.PersonID,CONCAT(FirstName,' ',LastName) AS FullName,courseinstructor.CourseID,course.Title  FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID AND course.Title like ?";
//query="SELECT courseinstructor.CourseID, Title,courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND Title LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getTitle()+"%");
        }
        else if(s.getTitle().equals("") && !s.getFullName().equals("")){
            query = "SELECT courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName, courseinstructor.CourseID, course.Title  FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND courseinstructor.PersonID = person.PersonID AND CONCAT(FirstName,' ',LastName) LIKE ?";
//            query="SELECT courseinstructor.CourseID, Title,courseinstructor.PersonID, CONCAT(FirstName,' ',LastName) AS FullName FROM `courseinstructor`, `course`,`person` WHERE courseinstructor.CourseID = course.CourseID AND CONCAT(FirstName,' ',LastName) LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+s.getFullName()+"%");
        }
        ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null){
            while(rs.next()){
                CourseInstructorDTO c = new CourseInstructorDTO();
                c.setCourseID(rs.getInt("CourseID"));
                c.setPersonID(rs.getInt("PersonID"));
                c.setTitle(rs.getString("Title"));
                c.setFullName(rs.getString("FullName"));
                List.add(c);
            }
        }
        return List;
    }
}
