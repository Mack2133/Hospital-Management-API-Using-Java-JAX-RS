/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

/**
 *
 * @author ayyoobajward
 */
import com.example.model.MedicalRecord;
import java.util.List;

public interface MedicalRecordDAO {
    List<MedicalRecord> getAllMedicalRecords();
    MedicalRecord getMedicalRecordById(int id);
    void addMedicalRecord(MedicalRecord medicalRecord);
    void updateMedicalRecord(MedicalRecord updatedMedicalRecord);
    void deleteMedicalRecord(int id);
    int getNextMedicalRecordId();
}
