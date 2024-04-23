/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */
// admin clas extends from employee class
public class Admin extends Employee{
    private String userName;
    private String password;
    
    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    // create Constructor for veriables
    public Admin(String userName, String password, int emp_id, String fullname, String designation, String joinDate) {
        super(emp_id, fullname, designation, joinDate);
        this.userName = userName;
        this.password = password;
    }
    
    // create getter and setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
