/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

import models.Appointment;
import java.util.ArrayList;
/**
 *
 * @author acer
 */
// create queue
public class ToothCareQueData {
    public int maxSize; // size of the queue
    ArrayList<Appointment> queList;
    private String date;
    int front; // front of the queue
    int rear;// Rear of the queue
    public int noItems; // Number of items in the queue

    public ArrayList<Appointment> getQueList() {
        return queList;
    }

    public void setQueList(ArrayList<Appointment> queList) {
        this.queList = queList;
    }

    //Constructor 
  public ToothCareQueData(int s){
      
      maxSize = s;
      queList = new ArrayList<Appointment>(maxSize);
      front = 0;
      rear = -1;
      noItems = 0;
  }
    
  //method to inserts a new appointment into the queue
  // increment rear
  //use of Algorithms 
    public void insert(Appointment appo)throws Exception{
        try{
            if(rear == maxSize - 1){
                throw new Exception("Can not add the appointment, Maximum Slot Range is:" + maxSize);
            } else {
                queList.add(++rear, appo);
                noItems++;
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    
    //method to removes and returns the front appointment from the queue
    //check whether the queue is empty. if not access item and increment
    public Appointment remove(){
        if (noItems == 0){
            return null;
        }else{
            if(noItems==0){
                return null;
            }else{
                noItems--;
                return queList.remove(front++);
            }
        }
    }
    
    //method to retrieves and returns the front appointment without removing it
    public Appointment peekFront(){
        if (noItems == 0) {
            return null;
        } else {
            return queList.get(front);
        }
    }
    
    //method to retrieves and returns the rear appointment without removing it
    public Appointment peekRear(){
        if (noItems == 0) {
            return null;
        } else {
            return queList.get(rear);
        }
    }
    
    //method to displays the appointments in the queue
    public void display(){
        for (int i = front; i <= rear; i++) {
            //LOGGER.info("" + queList.get(i).getTid());
        }
    }
    
    //method to updates an existing appointment in the queue based on its ID
    public void update(Appointment updateAppointment) throws Exception{
        try {
            int indexToUpdate = -1;
            
            // Find the index of the appointment to update based on the appointment ID
            for (int i = front; i <= rear; i++) {
                if (queList.get(i).getAppoid() == updateAppointment.getAppoid()) {
                    indexToUpdate = i;
                    break;
                }
            }
            
            // Update the appointment at the found index
            if (indexToUpdate != -1) {
                queList.set(indexToUpdate, updateAppointment);
            } else {
                throw new Exception("Appointment with ID" + updateAppointment.getAppoid() + "not found in the que.");
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    
    //create getter and setter
       public String getDate() {
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }
}
