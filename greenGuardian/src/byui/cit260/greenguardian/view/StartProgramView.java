/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.view;

import byui.cit260.greenguardian.control.ProgramControl;
import byui.cit260.greenguardian.model.Player;
import java.util.Scanner;

/*
 * Author Lucia Bartlett & Nicholas Balabanov
 */

public class StartProgramView {
     public StartProgramView(){
    }
    public void startProgram(){
   
    //display the banner screen
    this.displayBanner();
    
    //get the players name
    String playersName = this.getPlayersName();
   
    //create new player
    Player player = ProgramControl.createPlayer(playersName);
    
    //display a customized welcome message
    this.displayWelcomeMessage(player);
    
    //display the main menu
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.displayMenu();
    }  

    public void displayBanner() {
        //Introduction to Green Guardian game
       System.out.println("\n\n*************************************************************");
       System.out.println("*                                                                                 \t*"
                             + "\n* This is the game of Green Guardian. In this game, the\t*"
                             + "\n* player will help the Earth stay clean by exploring       \t*"
                             + "\n* different cities and help citizens to manage their         \t*"
                             + "\n* ecological problems.                                                  \t*");
       
       System.out.println("*                                                                                  \t*"
                        + "\n* You will need to first check the ecological                        \t*"
                        + "\n* circumstances in the area and develop a plan how to        \t*"
                        + "\n* fix that problem. Green guardian will teach citizens          \t*"
                        + "\n* how to manage the problem in the future.                       \t*");
       
       System.out.println("*                                                                                  \t*"
                        + "\n* Have fun in this adventure.                                              \t*"
                        + "\n*                                                                                       \t*");
        
       System.out.println("*************************************************************");
    }

    public String getPlayersName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){ // while a valid anme has not been retrieved
            
            // prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            playersName = Character.toUpperCase(playersName.charAt(0)) + playersName.substring(1);
            //if the name is invalid (less than two characters in length)
            if (playersName.length()== 0){
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }
	    else if (playersName.length()==1)
	    {System.out.println("The user name is too short, please choose another one.");}
            break; // out of the (exit) the repetition
        }
        
        return playersName; 
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n----------------------------------------------------------");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tLearn and enjoy");
        System.out.println("----------------------------------------------------------");
    }
    }
        

       
               
  
