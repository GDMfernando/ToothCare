/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
/**
 *
 * @author acer
 */
//Employee class define 
public class Employee {
    private int emp_id;
    private String fullname;
    private String designation;
    private String joinDate; 

    // create Constructor for veriables
    public Employee(int emp_id, String fullname, String designation, String joinDate) {
        this.emp_id = emp_id;
        this.fullname = fullname;
        this.designation = designation;
        this.joinDate = joinDate;
    }

    public Employee() {
    }
    
    //Encaptulations
    //create getter and setter
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}
