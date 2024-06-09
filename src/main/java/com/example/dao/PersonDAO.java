/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

/**
 *
 * @author ayyoobajward
 */
import com.example.model.Person;
import java.util.List;

public interface PersonDAO {
    List<Person> getAllPersons();
    Person getPersonById(int id);
    void addPerson(Person person);
    void updatePerson(Person updatedPerson);
    void deletePerson(int id);
    int getNextPersonId();
}
