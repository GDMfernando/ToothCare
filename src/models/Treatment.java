/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author acer
 */
//Treatment class define 
public class Treatment {
    private String name;
    private double price;

    // create Constructor
    public Treatment(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Encaptulations
    // create getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
