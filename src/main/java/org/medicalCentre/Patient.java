package org.medicalCentre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Patient {
    private String name;
    private int age;

    public Patient() {
        this.name = "Nikolai";
        this.age = 80;
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

    public void setListOfAppointments() {
        listOfAppointments = new ArrayList<>();
         listOfAppointments.add(new Appointment(new Doctor("Aibolit", "therapist"), "flue"));
         listOfAppointments.add(new Appointment(new Doctor("Hause", "therapist"), "cancer"));
       }

       public void printListOfAppointments(){
        setListOfAppointments();
        for (int i = 0; i < listOfAppointments.size(); i++){
            System.out.println(listOfAppointments.get(i).toString());
        }
       }
    }

