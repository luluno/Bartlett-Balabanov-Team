/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenguardian;

import byui.cit260.greenguardian.model.Player;
import byui.cit260.greenguardian.model.Game;
import byui.cit260.greenguardian.view.StartProgramView;

/**
 *
 * @author Lucia Bartlett
 */
public class GreenGuardian {

    private static Game currentGame = null;
    private static Player player = null;
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       //create StartProgramView and start the program
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.startProgram();
     }
       
   public static Game getCurrentGame(){
        return currentGame;
        }
   public static void setCurrentGame(Game currentGame){
            GreenGuardian.currentGame = currentGame;
        }   
   public static Player getPlayer(){
            return player;
        }
   public static void setPlayer(Player player){
            GreenGuardian.player = player;
        }
    }

