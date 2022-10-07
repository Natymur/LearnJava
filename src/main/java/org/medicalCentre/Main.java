package org.medicalCentre;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println(patient.getName());
        patient.setListOfAppointments();
        patient.printListOfAppointments();
    }
}
