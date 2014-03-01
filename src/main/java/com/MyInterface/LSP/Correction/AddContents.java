/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.LSP.Correction;

import com.MyInterface.Encapsulation.Person;
import com.MyInterface.Inheritance.Player;
import com.MyInterface.Polymorphism.Coach;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public class AddContents {
    
    
    private Player playerObj;
    private Coach coachObj;
    private Person personObj;
    private List<Person> list = new ArrayList<Person>();
    
    public void addPerson(Person person)
    {
        personObj = person;
        list.add(personObj);
    }
    
    public void addCoach(Coach coach)
    {
            coachObj = coach;
            list.add(coach);

    }
    
    public void addPlayers(Player player)
    {
        playerObj = player;
        list.add(playerObj);
    }
    
}
