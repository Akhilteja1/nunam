package com.example.player.model;

public class Battery {


    private int uniqueId;
    private String batteryId;
    private float batteryCurrent;
    private float batteryVoltage;
    private float batteryTemperature;
    private Timestamp  time;


    public Battery(int uniqueId,String batteryId, float batteryCurrent, float batteryVoltage, float batteryTemperature, Timestamp time) {
        this.batteryId = batteryId;
        this.batteryCurrent = batteryCurrent;
        this.batteryVoltage= batteryVoltage;
        this.batteryTemperature = batteryTemperature;
        this.timeStamp = timeStamp;
        this.uniqueId = uniqueId;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(String batteryId) {
        this.batteryId=batteryId;
    }

    public int getUniqueId(){
        return uniqueId
    }
    public void setUniqueId(int uniqueId){
        this.uniqueId = uniqueId
    }

    public float getBatteryCurrent() {
        return batteryCurrent;
    }

    public void setBatteryCurrent(float batteryCurrent) {
        this.batteryCurrent=batteryCurrent;
    }

    public float getBatteryVoltage() {
        return batteryVoltage;
    }

    public void setBatteryVoltage(float batteryVoltage) {
        this.batteryVoltage=batteryVoltage;
    }

    public float getBatteryTemperature() {
        return batteryTemperature;
    }

    public void setBatteryTemperature(float batteryTemperature) {
        this.batteryTemperature=batteryTemperature;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time=time;
    }


     
 
}
