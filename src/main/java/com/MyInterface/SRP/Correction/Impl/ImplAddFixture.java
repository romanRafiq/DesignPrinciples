/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.SRP.Correction.Impl;

import com.MyInterface.Encapsulation.ImplFixtures;
import com.MyInterface.FixturesInterface;
import com.MyInterface.SRP.Correction.AddFixture;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public class ImplAddFixture implements AddFixture{

    //private List newFixtureList = new ArrayList<ImplFixtures>();
    private List Fixtures = new ArrayList<ImplFixtures>();
    private ImplFixtures fixtureObj = new ImplFixtures();
    
    public List<FixturesInterface> addFixture(List Fixtures,ImplFixtures fixtureObj) {
        
        this.Fixtures = Fixtures;
        this.fixtureObj = fixtureObj;
        
        Fixtures.add(this.fixtureObj);
        
        return Fixtures;
    }

    
    
    
}
