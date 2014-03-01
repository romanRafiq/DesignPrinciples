/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.ISP.Vioation;

import com.MyInterface.Inheritance.Player;
import com.MyInterface.Polymorphism.Coach;
import java.util.List;

/**
 *
 * @author Roman
 */
public interface playersInterface {
    
    public List<Coach> playsForClub(List coachList);
     public List<Player> getNumberOfPlayers(List list,String division);
}
