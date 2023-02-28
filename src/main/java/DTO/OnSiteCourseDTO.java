/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Time;

/**
 *
 * @author Admin
 */
public class OnSiteCourseDTO {
    private int courseID;
    private String title,location,days;
    private Time time;

    public OnSiteCourseDTO() {
    }

    public OnSiteCourseDTO(int courseID, String title, String location, String days, Time time) {
        this.courseID = courseID;
        this.title = title;
        this.location = location;
        this.days = days;
        this.time = time;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
}
