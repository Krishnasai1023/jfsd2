package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Tablet extends Device {
    private String screenSize;
    private String batteryLife;

    // Getters and setters
    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }
}
