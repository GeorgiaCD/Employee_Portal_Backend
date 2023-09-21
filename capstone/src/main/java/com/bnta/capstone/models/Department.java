package com.bnta.capstone.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "employee")
    @JsonIgnoreProperties({"employee"})
    @Column(name = "lead_employee")
    private Employee leadEmployee;

    @OneToMany(mappedBy = "employee")
    @JsonIgnoreProperties({"employee"})
    private List<Employee> employees;

    public Department() {
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.leadEmployee = null;
        this.employees = new ArrayList<>(); //not sure if this is correct
    }

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

    public Employee getLeadEmployee() {
        return leadEmployee;
    }

    public void setLeadEmployee(Employee leadEmployee) {
        this.leadEmployee = leadEmployee;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
