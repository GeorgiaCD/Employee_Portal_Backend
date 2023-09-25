package com.bnta.capstone.models;

public enum Type {

    MORNING ("9am"),
    AFTERNOON ("1pm"),
    EVENING ("6pm"),


    private String startTime;

    Type(String startTime) {
        this.startTime = startTime;
    }
    
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
