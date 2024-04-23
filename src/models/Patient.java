/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */

//Patient class define 
public class Patient{
    private String fullname; 
    private String mobileno;
    private String address;

    // create Constructor
    public Patient(String fullname, String dob, String mobileno, String address) {
        this.fullname = fullname;
        this.mobileno = mobileno;
        this.address = address;
    }
    
    //Encaptulations
    // create getter and setter
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
      
}
