/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */
// Doctor clas extends from employee class
public class Doctor extends Employee{
    private String Acadamics;
    
    public Doctor(String Acadamics) {
        this.Acadamics = Acadamics;
    }
    
    // create Constructor for veriables
     public Doctor(String Acadamics, int emp_id, String fullname, String designation, String joinDate) {
        super(emp_id, fullname, designation, joinDate);
        this.Acadamics = Acadamics;
    }
     
     // create getter and setter
    public String getAcadamics() {
        return Acadamics;
    }

    public void setAcadamics(String Acadamics) {
        this.Acadamics = Acadamics;
    }
    
    public Doctor() {
        
    }
    
}
