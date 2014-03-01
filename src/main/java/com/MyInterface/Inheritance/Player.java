/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.Inheritance;

import com.MyInterface.Encapsulation.Person;

/**
 *
 * @author Roman
 */

/*Test 

  Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
*/
public class Player extends Person{
    
     private String foot,division,position;   
     public Player(String fName, String lName, String contactNumber, String idNumber, int age,String foot,String division,String position)
     {
         super(fName, lName, contactNumber, idNumber, age);
         
         this.foot = foot;
         this.division = division;
         this.position = position;
     }
     
     //Default
      public Player()
      {
          super();
      }
     
    public String getDivision()
    {
        return division;
    }
    public String getPostion()
    {
        return position;
    }
    public String getPreferedFoot()
    {
        return foot;
    }
    
    public void setDivision(String division)
    {
        this.division = division;
    }
    public void setPostion(String position)
    {
        this.position = position;
    }
    public void setPreferedFoot(String foot)
    {
        this.foot = foot;
    }
    
}
