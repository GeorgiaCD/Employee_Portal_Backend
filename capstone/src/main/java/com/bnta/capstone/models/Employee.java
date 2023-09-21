package com.bnta.capstone.models;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;

    private String name;

    private String contactNumber;

    private String password;

    private String jobTitle;

    private int departmentId;

    private int hourlyWage;

    private List<Shift> shifts;

    public Employee(String name, String contactNumber, String password, String jobTitle, int departmentId, int hourlyWage){
        this.name = name;
        this.contactNumber = contactNumber;
        this.password = password;
        this.jobTitle = jobTitle;
        this.departmentId = departmentId;
        this.hourlyWage = hourlyWage;
        this.shifts = new ArrayList<>();
    }

//    Getters & Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
}
