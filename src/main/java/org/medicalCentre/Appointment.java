package org.medicalCentre;

public class Appointment {
    private Doctor doctor;
    private String result;

    public Appointment(org.medicalCentre.Doctor doctor, String result) {
        this.doctor = doctor;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Doctor=" + doctor.toString()
                + ", result=" + result;
    }
}

