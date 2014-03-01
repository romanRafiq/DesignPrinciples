/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MyInterface.ISP.Correction;

import com.MyInterface.Inheritance.Player;
import com.MyInterface.Polymorphism.Coach;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 211072478
 */
public class ImplTeam implements ListOfPlayersInDivision,CoachList{
      
    private List list = new ArrayList<Player>();              
    private List newList = new ArrayList<Player>();
    private List newCoachList = new ArrayList<Coach>();
    private List coachList = new ArrayList<Coach>();
    
    private Player player;
    private Coach coach;
    private String division;
    

    public List<Player> getNumberOfPlayers(List list,String division) {
        
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

    public List<Coach> playsForClub(List coachList) {
        
        this.coachList = coachList;
        
        coach = new Coach();
        
        //Listings
        for(int i = 0;i < coachList.size();i++)
        {          
            coach = (Coach)coachList.get(i);
            
            if(coach.getplayForTheClub() == true )
            {
                newCoachList.add(coach);
            }           
        } 
        
        return newCoachList;        
    }

   

   
    
}
