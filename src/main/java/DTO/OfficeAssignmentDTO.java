/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Timestamp;

/**
 *
 * @author Admin
 * instuctorID: ma giang vien
 * location: dia diem
 * timeStamp: thoi diem bat dau
 */
public class OfficeAssignmentDTO {
    private int instructorID;
    private String location;
    private Timestamp timeStamp;

    public OfficeAssignmentDTO() {
    }

    public OfficeAssignmentDTO(int instructorID, String location, Timestamp timestamp) {
        this.instructorID = instructorID;
        this.location = location;
        this.timeStamp = timestamp;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getTimestamp() {
        return timeStamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timeStamp = timestamp;
    }
    
    
    
}
