/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.SRP.Correction.Impl;

import com.MyInterface.Encapsulation.ImplFixtures;
import com.MyInterface.SRP.Correction.DisplayFixtures;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public class ImplPrintFixturesForDivision implements DisplayFixtures{

    private ArrayList<String> displayList = new ArrayList<String>();
    
    private ImplFixtures fixtureObj = new ImplFixtures();
       
            
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
