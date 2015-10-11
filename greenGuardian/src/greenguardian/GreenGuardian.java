/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenguardian;

import byui.cit260.greenguardian.model.Player;
import byui.cit260.greenguardian.model.map;

/**
 *
 * @author Joe
 */
public class GreenGuardian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Player playerOne = new Player ();
     
     playerOne.setName("Lucia B");
     playerOne.setBestTime(7.00);
     
     String playerInfo = playerOne.toString();
     System.out.println(playerInfo);
  //Displaying Map class
    map mapfirst = new map();
    mapfirst.setrowCount(2);
    mapfirst.setcolumnCount(3);
    
    String mapscoordinates = mapfirst.toString();
    System.out.print(mapscoordinates);
    
    }
    
}
