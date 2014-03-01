/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.Encapsulation;

import com.MyInterface.FixturesInterface;
import java.util.Date;

/**
 *
 * @author Roman
 */
public class ImplFixtures implements FixturesInterface{

    private String ageGroup,division,opponent,location;
    private Date dateOfGame;
    public String getAgeGroup() {
        return ageGroup;
    }

    public String getDivision() {
        return division;
    }

    public String getOpponent() {
        return opponent;
    }

    public String getLocation() {
        return location;
    }

    public Date getDateOfGame() {
        return dateOfGame;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDateOfGame(Date dateOfGame) {
        this.dateOfGame = dateOfGame;
    }
   
     public String toString()
     {
         return ("Fixture_ " + dateOfGame+"_ Opponent"+ opponent+"_  "+location);
     }
}
