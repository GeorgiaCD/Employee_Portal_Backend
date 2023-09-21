package com.bnta.capstone.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "employees")
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
    private JobTitle jobTitle;

    @ManyToOne
    @JsonIgnoreProperties({"employees"})
    @Column(name = "department")
    private Department department;

    @Column(name = "hourly_wage")
    private int hourlyWage;

// One to many
//    @OneToMany(mappedBy = (“employeeId”))
//    @JsonIgnore
    private List<Shift> shifts;

    public Employee(String name, String email, String password, String contactNumber, JobTitle jobTitle, Department department, int hourlyWage){
        this.name = name;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.jobTitle = jobTitle;
        this.department = department;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
