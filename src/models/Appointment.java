/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */
//Appointment class define 
public class Appointment {
    private int appoid;
    private String date;
    private Doctor doc;
    private Patient patient;
    private Treatment treatment;

    // create Constructor
    public Appointment(int appoid, String date, Doctor doc, Patient patient, Treatment treatment) {
        this.appoid = appoid;
        this.date = date;
        this.doc = doc;
        this.patient = patient;      
        this.treatment = treatment;
    }
    
     public Appointment() {
    }
    
    public Appointment(int appoid, String date, Doctor doc, Patient patient) {
        this.appoid = appoid;
        this.date = date;
        this.doc = doc;
        this.patient = patient;
    }
    
// create getter and setter
    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
    
    //Encaptulations
    public int getAppoid() {
        return appoid;
    }

    public void setAppoid(int appoid) {
        this.appoid = appoid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
}

