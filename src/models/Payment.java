/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */
//Payment class define 
public class Payment {
    private int paymentId;
    private Appointment appointment;
    private String paydate;
    private boolean isPayed;

    // create Constructor
    public Payment(int paymentId, Appointment appointment, String paydate, boolean isPayed) {
        this.paymentId = paymentId;
        this.appointment = appointment;
        this.paydate = paydate;
        this.isPayed = isPayed;
    }

    public Payment() {
    }

    //Encaptulations
    // create getter and setter
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public boolean isIsPayed() {
        return isPayed;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }
}
