/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.SRP.Violation;

import com.MyInterface.Encapsulation.ImplFixtures;
import com.MyInterface.FixturesInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public class ImplFixtureInter implements FixtureInterface{

    private ArrayList<String> displayList = new ArrayList<String>();    
    private ImplFixtures fixtureObj = new ImplFixtures();    
  
    
    
    public List<FixturesInterface> addFixture(List Fixtures,ImplFixtures fixtureAddObj) {                             
        
        Fixtures.add(fixtureAddObj);
        
        return Fixtures;
    }
    
     public ArrayList<String> printFixturesForDivision(List fixtureList, String ageGroup) {
      
        
         for(int x = 0;x< fixtureList.size();x++)
        {
            fixtureObj = (ImplFixtures)fixtureList.get(x);
                                    
            if(fixtureObj.getAgeGroup().equals(ageGroup))
            {
                displayList.add(fixtureObj.toString());               
            }
        }
        
        return displayList;        
    }
    
}
