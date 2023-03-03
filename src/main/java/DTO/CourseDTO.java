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
    private int courseID, creadits;
    private String title,departmant;

    public CourseDTO() {
    }

    public CourseDTO(int courseID, int creadits, String departmant, String title) {
        this.courseID = courseID;
        this.creadits = creadits;
        this.departmant = departmant;
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

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmantID(String departmant) {
        this.departmant = departmant;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
