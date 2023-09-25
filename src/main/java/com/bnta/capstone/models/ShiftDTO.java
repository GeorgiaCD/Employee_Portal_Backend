package com.bnta.capstone.models;

import java.time.LocalDate;

public class ShiftDTO {

    private LocalDate date;
    private Type type;
    private Employee employee;

    public ShiftDTO(LocalDate date, Type type, Employee employee) {
        this.date = date;
        this.type = type;
        this.employee = employee;
    }

    public ShiftDTO() {
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
