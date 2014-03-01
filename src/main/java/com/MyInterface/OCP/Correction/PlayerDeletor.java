/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.MyInterface.OCP.Correction;

import com.MyInterface.Inheritance.Player;
import java.util.List;

/**
 *
 * @author Roman
 */
public class PlayerDeletor {
    
    
    public List<Player> deletePlayer(DeleteMethod deleteMethod,int objectIndex,List ListPlayer )
    {         
       return  deleteMethod.deleteObject(objectIndex, ListPlayer);        
    }    
}
