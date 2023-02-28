/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Admin
 * departmentID: id khoa
 * name: ten khoa
 * budget: hoc phi
 * startDate: ngay bat dau
 */
public class DepartmentDTO {
    private int departmentID, adminstrator;
    private String name;
    private double budget;
    private Date startDate;

    public DepartmentDTO() {
    }

    public DepartmentDTO(int departmentID, int adminstrator, String name, double budget, Date startDate) {
        this.departmentID = departmentID;
        this.adminstrator = adminstrator;
        this.name = name;
        this.budget = budget;
        this.startDate = startDate;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getAdminstrator() {
        return adminstrator;
    }

    public void setAdminstrator(int adminstrator) {
        this.adminstrator = adminstrator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void getStartDate(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
