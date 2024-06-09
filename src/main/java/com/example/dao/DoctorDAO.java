/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

/**
 *
 * @author ayyoobajward
 */
import com.example.model.Doctor;
import java.util.List;

public interface DoctorDAO {
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(int id);
    void addDoctor(Doctor doctor);
    void updateDoctor(Doctor updatedDoctor);
    void deleteDoctor(int id);
    int getNextDoctorId();
}
