package org.medicalCentre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    private List<Appointment> listOfAppointments;

    public List<org.medicalCentre.Appointment> getListOfAppointments() {
        return listOfAppointments;
    }

    public void setListOfAppointments(List<Appointment> listOfAppointments) {
        this.listOfAppointments = listOfAppointments;
    }

    public void gettListOfAppointments() {
        System.out.println("Appointments:");
        for (int i = 0; i < listOfAppointments.size(); i++) {
            System.out.println(listOfAppointments.get(i).toString());
        }
    }
}

