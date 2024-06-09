/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

/**
 *
 * @author ayyoobajward
 */
import com.example.model.Prescription;
import java.util.List;

public interface PrescriptionDAO {
    List<Prescription> getAllPrescriptions();
    Prescription getPrescriptionById(int id);
    void addPrescription(Prescription prescription);
    void updatePrescription(Prescription updatedPrescription);
    void deletePrescription(int id);
    int getNextPrescriptionId();
}
