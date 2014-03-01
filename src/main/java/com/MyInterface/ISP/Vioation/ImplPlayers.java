/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.ISP.Vioation;

import com.MyInterface.Inheritance.Player;
import com.MyInterface.Polymorphism.Coach;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public class ImplPlayers implements playersInterface{

     private List list = new ArrayList<Player>();              
    private List newList = new ArrayList<Player>();
    private List newCoachList = new ArrayList<Coach>();
    private List coachList = new ArrayList<Coach>();
    
    private Player player;
    private Coach coach;
    private String division;
    
    public List<Coach> playsForClub(List coachList) {
       this.coachList = coachList;
        
        coach = new Coach();
        
        //Listings
        for(int i = 0;i < coachList.size();i++)
        {          
            coach = (Coach)coachList.get(i);
            
            if(coach.getplayForTheClub() == false )
            {
                newCoachList.add(coach);
            }           
        } 
        
        return newCoachList; 
    }

    public List<Player> getNumberOfPlayers(List list, String division) {
this.division = division;
        
        this.list = list;
        
        player = new Player();               
        
        //List players in the given division   
        for(int i = 0;i < list.size();i++)
        {          
            player = (Player)list.get(i);
            
            if(player.getDivision().equals(division) )
            {
                newList.add(player);
            }           
        }             
        return newList;
    }
    
}
