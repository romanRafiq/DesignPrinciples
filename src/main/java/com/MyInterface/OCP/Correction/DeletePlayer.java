/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.OCP.Correction;

import com.MyInterface.Inheritance.Player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roman
 */
public class DeletePlayer extends DeleteMethod{
   
    private List ListPlayer = new ArrayList<Player>();
    
    @Override
    List<Player> deleteObject(int objectIndex, List ListPlayer) {        
        
        this.ListPlayer = ListPlayer;
          
        this.ListPlayer.remove(objectIndex);
        
        return this.ListPlayer;        
    }
    
    
}
