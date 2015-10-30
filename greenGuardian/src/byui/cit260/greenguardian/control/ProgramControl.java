/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.control;

import byui.cit260.greenguardian.model.Player;
import greenguardian.GreenGuardian;

/**
 *
 * @author Lucia Bartlett and Nicholas Balabanov
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        if (name == null){
        return null;
        }
        Player player = new Player();
        player.setName(name);
        
        GreenGuardian.setPlayer(player); // save the player
        
        return player;
    }
}
