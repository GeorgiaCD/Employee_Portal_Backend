package com.bnta.capstone.models;

public enum Type {

    MORNING ("9am", "5pm"),
    AFTERNOON ("12pm", "8pm"),
    EVENING ("4pm", "12am");


    private String startTime;

    private String endTime;

    Type(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
