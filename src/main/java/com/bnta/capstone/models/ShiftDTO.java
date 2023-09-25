package com.bnta.capstone.models;

import java.time.LocalDate;

public class ShiftDTO {

    private LocalDate date;
    private Type type;
    private int employeeId;

    public ShiftDTO(LocalDate date, Type type, int employeeId) {
        this.date = date;
        this.type = type;
        this.employeeId = employeeId;
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

    public int getEmployee() {
        return employeeId;
    }

    public void setEmployee(int employeeId) {
        this.employeeId = employeeId;
    }
}
