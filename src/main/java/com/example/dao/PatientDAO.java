/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

/**
 *
 * @author ayyoobajward
 */
import com.example.model.Patient;
import java.util.List;

public interface PatientDAO {
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    void addPatient(Patient patient);
    void updatePatient(Patient updatedPatient);
    void deletePatient(int id);
    int getNextPatientId();
}
