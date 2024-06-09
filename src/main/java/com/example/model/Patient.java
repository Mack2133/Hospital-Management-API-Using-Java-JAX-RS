/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

/**
 *
 * @author ayyoobajward
 */
public class Patient extends Person{
    private String medicalHistory;
    private String healthStatus;

    public Patient(){}
    
    public Patient(int id, String name, String contactInformation, String address, String medicalHistory, String healthStatus){
        super(id,name, contactInformation, address);
        this.medicalHistory = medicalHistory;
        this.healthStatus = healthStatus;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
            return "Patient{" +
            super.toString() + 
            ", medicalHistory='" + medicalHistory + '\'' +
            ", healthStatus='" + healthStatus + '\'' +
            '}';
}
    
    
}
