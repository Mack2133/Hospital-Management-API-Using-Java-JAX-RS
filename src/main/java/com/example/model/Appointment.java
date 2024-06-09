/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

/**
 *
 * @author ayyoobajward
 */

public class Appointment {
    private int id;
    private String date;
    private String time;
    private Doctor doctor;
    private Patient patient;
    
    public Appointment(){}

    public Appointment(int id,String date, String time, Patient patient, Doctor doctor) {
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patient = patient;
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public Patient getPatient(){
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Appointment{" + "id=" + id + ", date=" + date + ", time=" + time + ", doctor=" + doctor + ", patient=" + patient + '}';
    }
    
}
