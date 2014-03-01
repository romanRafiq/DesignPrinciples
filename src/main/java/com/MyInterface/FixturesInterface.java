/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface;

import java.util.Date;

/**
 *
 * @author Roman
 */
public interface FixturesInterface {
    
    public String getAgeGroup();
    public String getDivision();
    public String getOpponent();
    public String getLocation();
    public Date getDateOfGame();
    
    public void setAgeGroup(String ageGroup);
    public void setDivision(String division);
    public void setOpponent(String opponent);
    public void setLocation(String location);
    public void setDateOfGame(Date dateOfGame);
    public String toString();
    
    
}
