/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.ISP.Vioation;

import com.MyInterface.ISP.Correction.ImplTeam;
import com.MyInterface.Inheritance.Player;
import com.MyInterface.Polymorphism.Coach;
import java.util.List;

/**
 *
 * @author Roman
 */
public class coachAndPlayas {
    private ImplTeam team = new ImplTeam();
        
    
    public List<Player> getPlayerInDivision(List teamList,String division)
    {
       return team.getNumberOfPlayers(teamList, division);
    }
    
    public List<Coach> coachThatArePlayers(List coachList)
    {
         return team.playsForClub(coachList);
    }
}
