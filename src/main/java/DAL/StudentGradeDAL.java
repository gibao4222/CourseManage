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
        String query = "SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                StudentGradeDTO s = new StudentGradeDTO();
                s.setEnrollmentID(rs.getInt("EnrollmentID"));
                s.setCourseName(rs.getString("Title"));
                s.setFullNameStudent(rs.getString("FullName"));
                s.setGrade(rs.getDouble("Grade"));
                List.add(s);
            }
        }
        return List;
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
    public ArrayList findStudent (int enrollmentID, String fullName, String title, double gradeTo, double gradeCome) throws SQLException{
        String query="";
        PreparedStatement p;
        if(enrollmentID != 0){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND EnrollmentID=?";
            p = con.prepareStatement(query);
            p.setInt(1, enrollmentID);
        }
        else if(!fullName.equals("") && title.equals("") && gradeCome==-1){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND CONCAT(FirstName,' ',LastName) LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+fullName+"%");
        }
        else if(fullName.equals("") && !title.equals("") && gradeCome==-1){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND Title LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+title+"%");
        }
        else if(fullName.equals("") && title.equals("") && gradeCome!=-1){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND ?<= Grade <=?";
            p = con.prepareStatement(query);
            p.setDouble(1, gradeTo);
            p.setDouble(2, gradeCome);
        }
        else if(!fullName.equals("") && !title.equals("") && gradeCome==-1){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND CONCAT(FirstName,' ',LastName) LIKE ? AND Title LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+fullName+"%");
            p.setString(2,"%"+title+"%");
        }
        else if(!fullName.equals("") && title.equals("") && gradeCome!=-1){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND CONCAT(FirstName,' ',LastName) LIKE ? AND ? <= Grade <=?";
            p = con.prepareStatement(query);
            p.setString(1, "%"+fullName+"%");
            p.setDouble(2,gradeTo);
            p.setDouble(3, gradeCome);
        }
        else if(fullName.equals("") && !title.equals("") && gradeCome!=-1){
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND ? <= Grade <=? AND Title LIKE ?";
            p = con.prepareStatement(query);
            p.setDouble(1,gradeTo );
            p.setDouble(2,gradeCome );
            p.setString(2,"%"+title+"%");
        }
        else{
            query ="SELECT EnrollmentID, CONCAT(FirstName,' ',LastName) AS FullName, Title, Grade FROM `studentgrade`, `course`, `person` WHERE course.CourseID = studentgrade.CourseID AND person.PersonID = studentgrade.StudentID AND CONCAT(FirstName,' ',LastName) LIKE ? AND ?<= Grade <=? AND Title LIKE ?";
            p = con.prepareStatement(query);
            p.setString(1, fullName);
            p.setDouble(2,gradeTo );
            p.setDouble(3,gradeCome );
            p.setString(4,"%"+title+"%");
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
