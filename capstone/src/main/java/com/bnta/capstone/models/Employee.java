package com.bnta.capstone.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column(name = "contact_number")
    private String contactNumber;


    @Column(name = "job_title")
    private String jobTitle;

//    manyToOne
    @Column(name = "department_id")
    private int departmentId;

    @Column(name = "hourly_wage")
    private int hourlyWage;

// One to many
//    @OneToMany(mappedBy = (“employeeId”))
//    @JsonIgnore
    private List<Shift> shifts;

    public Employee(String name, String email, String password, String contactNumber, String jobTitle, int departmentId, int hourlyWage){
        this.name = name;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
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
