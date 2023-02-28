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
    private String title, fullName;

    public CourseInstructorDTO() {
    }

    public CourseInstructorDTO(int courseID, int personID, String title, String fullName) {
        this.courseID = courseID;
        this.personID = personID;
        this.title = title;
        this.fullName = fullName;
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
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
