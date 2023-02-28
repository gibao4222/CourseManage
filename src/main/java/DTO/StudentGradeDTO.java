/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Admin
 */
public class StudentGradeDTO {
    private int enrollmentID;
    private String courseName,fullNameStudent;
    private double grade;

    public StudentGradeDTO() {
    }

    public StudentGradeDTO(int enrollmentID, String fullNameStudent, String courseName, double grade) {
        this.enrollmentID = enrollmentID;
        this.courseName = courseName;
        this.fullNameStudent = fullNameStudent;
        this.grade = grade;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getFullNameStudent() {
        return fullNameStudent;
    }

    public void setFullNameStudent(String fullNameStudent) {
        this.fullNameStudent = fullNameStudent;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
}
