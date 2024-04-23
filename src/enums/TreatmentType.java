/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

/**
 *
 * @author acer
 */
//create enum for treatment types
public enum TreatmentType {
    Cleaning("Cleaning", 2000),
    Filling("Filling", 3000),
    NerveFilling("NerveFilling", 5000),
    Whitening("Whitening", 15000), 
    RootCanalTherapy("RootCanalTherapy", 10000);

   public final String name;
   public final double price;
   
   // create Constructor
  private TreatmentType(String name, double price) {
        this.name = name;
        this.price = price;
    }
  
  // create getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
