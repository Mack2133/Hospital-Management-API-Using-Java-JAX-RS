/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;
/**
 *
 * @author ayyoobajward
 */
import com.example.model.Billing;
import java.util.List;

public interface BillingDAO {
    List<Billing> getAllBillings();
    Billing getBillingById(int id);
    void addBilling(Billing billing);
    void updateBilling(Billing updatedBilling);
    void deleteBilling(int id);
    int getNextBillingId(); 
}
