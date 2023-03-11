/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.StudentGradeDTO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StudentGradeDAL extends connect {
    public StudentGradeDAL(){
        super();
        this.openConnection();
    }
    public ArrayList readStudentGrade() throws SQLException{
        String query = "SELECT EnrollmentID,studentgrade.CourseID,StudentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID ORDER BY EnrollmentID ASC";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                StudentGradeDTO s = new StudentGradeDTO();
                s.setEnrollmentID(rs.getInt("EnrollmentID"));
                s.setCourseID(rs.getInt("CourseID"));
                s.setStudentID(rs.getInt("StudentID"));
                s.setCourseName(rs.getString("Title"));
                s.setFullNameStudent(rs.getString("FullName"));
                s.setGrade(rs.getDouble("Grade"));
                List.add(s);
            }
        }
        return List;
        }
    public ArrayList readNameStudentGrade() throws SQLException{
        String query = "SELECT DISTINCT concat(person.Firstname,' ',person.Lastname) as FullName FROM person,studentgrade WHERE person.PersonID = studentgrade.StudentID";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
//                CourseInstructorDTO s = new CourseInstructorDTO();
//                s.setFullName(rs.getString("FullName"));
                List.add(rs.getString(1));
            }
        }
        return List;
    }
    
    public int getIdStudentFromFullname(String name) throws SQLException{
        String query = String.format("SELECT person.PersonID FROM person WHERE person.Firstname IN (SELECT\n" +
"    SUBSTRING_INDEX(SUBSTRING_INDEX('%s' , ' ', 1), ' ', -1) AS first_name)\n" +
"    AND person.Lastname IN (SELECT TRIM( SUBSTR('%s ', LOCATE(' ', '%s' )) ) AS last_name)",name,name,name );
        ResultSet rs = this.doReadQuery(query);
        if(rs.next()){
            return rs.getInt(1);
        }
        else
            return 0;
    }
        
    public ArrayList readNameCourseGrade() throws SQLException{
        String query = "SELECT course.Title from course";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
//                CourseInstructorDTO s = new CourseInstructorDTO();
//                s.setFullName(rs.getString("FullName"));
                List.add(rs.getString(1));
            }
        }
        return List;
    }
    public int getIdCourseGrade(String name) throws SQLException{
        String query = String.format("SELECT course.CourseID from course WHERE course.Title = '%s' ",name);
        ResultSet rs = this.doReadQuery(query);
        if(rs.next()){
            return rs.getInt(1);
        }
        else
            return 0;
    }
    public int updateStudent(StudentGradeDTO s) throws SQLException{
        String query ="UPDATE studentgrade SET CourseID = (SELECT CourseID FROM course WHERE Title = ?), StudentID = (SELECT PersonID FROM person WHERE CONCAT(FirstName,' ',LastName) = ?), Grade = ? WHERE EnrollmentID=?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setString(1, s.getCourseName());
        p.setString(2,s.getFullNameStudent());
        p.setDouble(3, s.getGrade());
        p.setInt(4, s.getEnrollmentID());
        int rs = p.executeUpdate();
        return rs;
    }
    public int insertStudent(StudentGradeDTO s) throws SQLException{
        String query = "INSERT studentgrade (CourseID,StudentID,Grade) VALUES ((SELECT CourseID FROM course WHERE Title = ?),(SELECT PersonID FROM person WHERE CONCAT(FirstName,' ',LastName) = ?),?)";
        PreparedStatement p = con.prepareStatement(query);
        p.setString(1, s.getCourseName());
        p.setString(2,s.getFullNameStudent());
        p.setDouble(3,s.getGrade());
        int rs = p.executeUpdate();
        return rs;
    }
    public ArrayList findStudentGrade (String str, String value) throws SQLException{
        String query="";
        PreparedStatement p;
        if(str.equals("Mã sinh viên")){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND studentgrade.StudentID LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+value+"%");
        }
        else if(str.equals("Mã khóa học")){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND studentgrade.CourseID LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+value+"%");
        }
        else if(str.equals("Tên sinh viên")){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND CONCAT(FirstName,' ',LastName) LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+value+"%");
        }
        else{
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND Title LIKE ?";
            p = con.prepareStatement(query);
            p.setString(4,"%"+value+"%");
        }
        ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null){
            while(rs.next()){
                StudentGradeDTO s = new StudentGradeDTO();
                s.setEnrollmentID(rs.getInt("EnrollmentID"));
                s.setFullNameStudent(rs.getString("FullName"));
                s.setCourseName(rs.getString("Title"));
                s.setGrade(rs.getDouble("Grade"));
                List.add(s);
            }
        }
        return List;
    }
    public int deleteStudent(int EnrollmentID) throws SQLException{
        String query = "DELETE FROM studentgrade WHERE EnrollmentID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, EnrollmentID);
        int rs = p.executeUpdate();
        return rs;
    }

}
