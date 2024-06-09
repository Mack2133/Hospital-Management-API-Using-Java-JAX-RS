/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

import com.example.model.Appointment;
import java.util.List;

/**
 *
 * @author ayyoobajward
 */
public interface AppointmentDAO {
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(int id);
    void addAppointment(Appointment appointment);
    void updateAppointment(Appointment updatedAppointment);
    void deleteAppointment(int id);
    int getNextAppointmentId(); 
}
