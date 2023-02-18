/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 * courseID: ma mon hoc
 * personID: ma giang vien
 */
public class CourseInstructorDTO {
    private int courseID, personID;

    public CourseInstructorDTO() {
    }

    public CourseInstructorDTO(int courseID, int personID) {
        this.courseID = courseID;
        this.personID = personID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
}
