package com.bnta.capstone.models;

public enum Type {

    MORNING_9AM("9am"),
    MORNING_11AM ("11am"),
    AFTERNOON_1PM ("1pm"),
    AFTERNOON_4PM ("4pm"),
    EVENING_6PM ("6pm"),
    EVENING_9PM("9pm");

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
