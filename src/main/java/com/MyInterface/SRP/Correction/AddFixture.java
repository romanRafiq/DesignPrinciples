/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.SRP.Correction;

import com.MyInterface.Encapsulation.ImplFixtures;
import com.MyInterface.FixturesInterface;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface AddFixture {
    
    public List<FixturesInterface> addFixture(List Fixtures,ImplFixtures fixtureObj);   
}
