/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import java.sql.*;
import DTO.TeacherDTO;
import DTO.StudentDTO;
import java.util.ArrayList;

/**
 *
 * @author duy
 */
public class PersonDAL extends connect{
    
    public PersonDAL(){
        super();
        this.openConnection();
    }
//    public void readStudents() throws SQLException{
//        String query = "SELECT * FROM Person WHERE EnrollmentDate>0";
//        ResultSet rs = this.doReadQuery(query);
//        if(rs!=null)
//        {
//            int i = 1;
//            while(rs.next()){
//                System.out.printf("%-20s%-20s%-20s%s\n",i,rs.getString("PersonID"),rs.getString("Firstname"),rs.getString("Lastname"));
//                i++;
//            }
//        }}
    
    public ArrayList readStudents() throws SQLException{
        String query = "SELECT * FROM Person WHERE EnrollmentDate>0";
        ResultSet rs = this.doReadQuery(query);
        ArrayList List = new ArrayList();
        if(rs!=null)
        {
            while(rs.next()){
                StudentDTO s = new StudentDTO();
                s.setPersonID(rs.getInt("PersonID"));
                s.setFirstName(rs.getString("FirstName"));
                s.setLastName(rs.getString("LastName"));
                List.add(s);
            }
        }
        return List;
    }
    public int updateStudent(TeacherDTO s) throws SQLException{
        String query ="Update Person SET FirstName=?, LastName=? WHERE PersonID = ?";
        PreparedStatement p = this.con.prepareStatement(query);
        p.setString(1, s.getFirstName());
        p.setString(2,s.getLastName());
        p.setInt(3, s.getPersonID());
        int rs = p.executeUpdate();
        return rs;
    }
//    public int insertStudent(TeacherDTO s) throws SQLException{
//        String query = "Insert Person (FirstName,LastName,EnrollmentDate) VALUES(?,?,?)";
//        PreparedStatement p = con.prepareStatement(query);
//        p.setString(1, s.getFirstName());
//        p.setString(2, s.getLastName());
//        p.setString(3, s.getEnrollmentDate().toString());
//        int rs = p.executeUpdate();
//        return rs;
//    }
    public ArrayList findStudent (String fullName) throws SQLException{
        String query ="SELECT * FROM Person WHERE concat(FirstName,' ',LastName) LIKE ?";
        PreparedStatement p = con.prepareStatement(query);
        p.setString(1, "%"+fullName+"%");
        ResultSet rs = p.executeQuery();
        ArrayList List = new ArrayList();
        if(rs!=null){
            int i=1;
            while(rs.next()){
                StudentDTO s = new StudentDTO();
                s.setPersonID(rs.getInt("PersonID"));
                s.setFirstName(rs.getString("FirstName"));
                s.setLastName(rs.getString("LastName"));
                List.add(s);
            }
        }
        return List;
    }
    public int deleteStudent(int personID) throws SQLException{
        String query = "DELETE FROM Person WHERE PersonID=?";
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, personID);
        int rs = p.executeUpdate();
        return rs;
    }
}
