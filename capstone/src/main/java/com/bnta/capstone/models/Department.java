package com.bnta.capstone.models;

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

    @Column(name = "lead_employee")
    private Employee leadEmployee;

    private List<Employee> employees;

    public Department() {
    }

    public Department(int id, String name, Employee leadEmployee) {
        this.id = id;
        this.name = name;
        this.leadEmployee = leadEmployee;
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
