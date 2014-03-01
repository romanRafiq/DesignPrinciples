/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface;

/**
 *
 * @author Roman
 */
public interface PersonInterface {
    
    
    public String getFName();
    public String getLName();
    public String getContactNumber();
    public int getAge();
    public String getIdNumber();
    public String getDivision();
    public String getPostion();
    public String getPreferedFoot();
    
    
    public void setFName(String fName);
    public void setLName(String lName);
    public void setContactNumber(String contactNumber);
    public void setAge(int age);
    public void setIdNumber(String idNumber);
    public void setDivision(String division);
    public void setPostion(String position);
    public void setPreferedFoot(String foot);
}
