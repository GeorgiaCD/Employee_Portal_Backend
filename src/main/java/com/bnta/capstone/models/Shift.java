package com.bnta.capstone.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity(name = "shifts")
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private LocalDate date;

    @Column
    private Type type;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Shift(LocalDate date, Type type, Employee employee) {
        this.date = date;
        this.type = type;
        this.employee = employee;
    }

    public Shift() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
