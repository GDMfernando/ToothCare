/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import enums.ToothCareQueData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Admin;
import models.Treatment;
import models.Doctor;
import models.Payment;
import models.Appointment;
/**
 *
 * @author acer
 */
//ToothCareData class for store the data in arrays
public class ToothCareData {
    private int queSize =10; //define que size
    private static ArrayList<ToothCareQueData> appointmentData = new ArrayList<>();
    private static ArrayList<Payment> paymentList = new ArrayList<>();
    private Admin admin;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    
    // Singleton pattern instance
    private static ToothCareData instance = new ToothCareData();
    
    public ToothCareData(){
        doctors.add(new Doctor("PHD", 2, "Timmy", "Doctor", "2020/04/05"));
        doctors.add(new Doctor("MD", 3, "Tony", "Doctor", "2021/06/10"));
    }

    //Get the singleton instance
    public static synchronized ToothCareData getInstance(){
        if (instance == null) {
            instance = new ToothCareData();
        }
        return instance;
    }
    
    //Create Hashmap
   public HashMap<Integer, Treatment> channelType(){
       //treatment list
       HashMap<Integer, Treatment> out = new HashMap<>();
       out.put(1, new Treatment("", 100));
       out.put(2, new Treatment("", 100));
       out.put(3, new Treatment("", 100));
       out.put(4, new Treatment("", 100));
       return out;
   }

   // get admin details
   public Admin getAdmin() {
        return new Admin("admin", "12345", 1, "Test User", "Admin", "2023/01/02");
    }
   
   // get doctor details
   public ArrayList<Doctor> getDoctor() {
        return doctors;
    }
   
   //add appointment method
   public void addAppointment(Appointment appointment){
       
       try {
           int index = findIndexByDate(appointment.getDate());
           // If there is available slot for the date in the queue, add the appointment to it
           if (index != -1) {
               appointmentData.get(index).insert(appointment);
               System.out.println("Appointment added succesfully");
           } else {
               ToothCareQueData queData=new ToothCareQueData(queSize);
                queData.setDate(appointment.getDate());
               queData.insert(appointment);
               appointmentData.add(queData);
           }
       } catch (Exception ex) {
           ex.printStackTrace();
       }
   }
   
   //find appointment by date method
   public ToothCareQueData findbyDate(String date){
       //Check if a queue is already created on the same date
       ToothCareQueData output=null;
    
       for (ToothCareQueData toothCareQueData : appointmentData) {
           
           if(toothCareQueData.getDate().equals(date)){
           output=toothCareQueData;
           break;
           }
       }
       return output;
   }
   
   //Find the index of an existing appointment by date method
   public int findIndexByDate(String date){
       //Check if a queue is already created on the same date
       for (int i = 0; i < appointmentData.size(); i++) {
           ToothCareQueData toothCareQueData = appointmentData.get(i);
           if (toothCareQueData.getDate().equals(date)) {
               return i; // Return the index if the date is found
           }
       }
       return -1;
       // Return -1 if the date is not found
   }
   
   //add payment to the appointment method
   public void addPayment(Appointment appointment){
       Payment pay= new Payment();
       pay.setAppointment(appointment);
       pay.setIsPayed(true);
       paymentList.add(pay);
   }
}