/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Config;

import com.MyInterface.DIP.Correction.ErrorMessageInterface;
import com.MyInterface.DIP.Correction.IntValidation;
import com.MyInterface.Encapsulation.Person;
import com.MyInterface.Inheritance.Player;

/**
 *
 * @author Roman
 */
public class AppConfig {
     
    @Bean(name = "InheritanceClass")
    public Person getFirstClass()
    {
        return new Player();
    }
    @Bean(name = "DIPclases")
    public ErrorMessageInterface getDIPClass()
    {
        return new IntValidation();
    }
      @Bean(name = "ISPrinciple")
    public CoachList getISPClass()
    {
        return new ImplTeam();
    }
}
