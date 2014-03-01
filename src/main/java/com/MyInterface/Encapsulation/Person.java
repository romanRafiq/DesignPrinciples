/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.Encapsulation;

import java.io.Serializable;

/**
 *
 * @author Roman
 */
public class Person implements Serializable
{
   private String fName,lName,contactNumber,idNumber; 
  
   private int age;

   
   //default construct
   public Person()
   {
       fName = "";
       lName = "";
       contactNumber = "";
       idNumber = "";
       age = 0;
   }
   
   
   public Person(String fName, String lName, String contactNumber, String idNumber, int age)
   {
       this.fName = fName;
       this.lName = lName;
       this.contactNumber = contactNumber;
       this.idNumber = idNumber;
       this.age = age;
   }
   
    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getAge() {
        return age;
    }

    public String getIdNumber() {
        return idNumber;
    }
   
   //Setters
    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
