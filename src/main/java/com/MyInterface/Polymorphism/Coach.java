/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.Polymorphism;

import com.MyInterface.Encapsulation.Person;

/**
 *
 * @author Roman
 */

/*
     Bicycle bike01, bike02, bike03;

    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();
*/
public class Coach extends Person{
    
    private String coachingDivision;
    private boolean playForTheClub = false;
    
     //Default
      public Coach()
      {
          super();
      }
      
       public Coach(String fName, String lName, String contactNumber, String idNumber, int age,String coachingDivision,boolean playForTheClub)
     {
         super(fName, lName, contactNumber, idNumber, age);
         
         this.coachingDivision = coachingDivision;
         this.playForTheClub = playForTheClub;         
     }
       
    public String getCoachingDivision()
    {
        return coachingDivision;
    }
    public boolean getplayForTheClub()
    {
        return playForTheClub;
    }
    
    
    public void setCoachingDivision(String coachingDivision)
    {
        this.coachingDivision = coachingDivision;
    }
    public void setPlayForTheClub(boolean playForTheClub)
    {
        this.playForTheClub = playForTheClub;
    }
    
}
