/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class CourseDTO {
    /*
    CourseID: Id khoa hoc
    Title: Ten khoa hoc
    Creadits: so tin chi
    DepartmentID: id khoa
    */
    private int courseID, creadits, departmantID;
    private String title;

    public CourseDTO() {
    }

    public CourseDTO(int courseID, int creadits, int departmantID, String title) {
        this.courseID = courseID;
        this.creadits = creadits;
        this.departmantID = departmantID;
        this.title = title;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCreadits() {
        return creadits;
    }

    public void setCreadits(int creadits) {
        this.creadits = creadits;
    }

    public int getDepartmantID() {
        return departmantID;
    }

    public void setDepartmantID(int departmantID) {
        this.departmantID = departmantID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
