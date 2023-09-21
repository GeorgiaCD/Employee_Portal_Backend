package com.bnta.capstone.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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

    @OneToOne
    @JsonIgnoreProperties({"ledDepartment"})
    @JoinColumn(name = "lead_employee_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Employee leadEmployee;

    @OneToMany(mappedBy = "department")
    @JsonIgnoreProperties({"department"})
    private List<Employee> employees;

    public Department() {
    }

    public Department(int id, String name, Employee leadEmployee) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>(); //not sure if this is correct
        this.leadEmployee = leadEmployee;
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
