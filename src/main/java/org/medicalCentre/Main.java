package org.medicalCentre;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Nikolai", 80);
        System.out.println(patient.getName() + ", " + patient.getAge() + " years.");

        List<Appointment> listOfAppointments = new ArrayList<>();
        listOfAppointments.add(new Appointment(new Doctor("Aibolit", "therapist"), "flue"));
        listOfAppointments.add(new Appointment(new Doctor("Hause", "therapist"), "cancer"));

        patient.setListOfAppointments(listOfAppointments);
        patient.gettListOfAppointments();
    }
}
