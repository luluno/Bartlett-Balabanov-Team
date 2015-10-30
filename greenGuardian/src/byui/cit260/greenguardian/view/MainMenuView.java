/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.view;

import java.util.Scanner;

/**
 *
 * @author Lucia Bartlett & Nicholas Balabanov
 */
public class MainMenuView {

   private final String MENU = "\n"
           + "\n======================================================================"
           + "\n|                           Main Menu                                |"
           + "\n======================================================================"
           + "\nG - Start game"
           + "\nH - How to play the game"
           + "\nL - Load game"
           + "\nE - Exit"
           + "\n======================================================================";
   
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); // display the main menu
            
            String input = this.getInput(); // get the user's selection
	    input.toUpperCase();
            selection = input.charAt(0); // get first character of string
	    this.doAction(selection);// do action based on selection
        } while (selection != 'E'); // a selection is not "Exit"
    }

    public String getInput() {
        boolean valid = false; //indicates if the value has been retrieved
        String Input = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid){ // while a valid value has not been retrieved
            
            // prompt for a value
            System.out.println("Please enter a value");
            
            //get the value from the keyboard and trim off the blanks
            Input = keyboard.nextLine();
            Input = Input.trim();
            
            //if the value is invalid (less than two characters in length)
            if (Input.length() < 2){
                System.out.println("Invalid value - the value must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return Input; 
    }
    public void doAction(char choice)
    {
       switch(choice)
       {
	  case 'N':
	     this.startNewGame();
	     break;
	  case 'G':
	     this.startExistingGame();
	     break;
	  case 'H':
	     this.displayHelpMenu();
	     break;
	  case 'S':
	     this.saveGame();
	     break;
	  case 'E':
	     return;
	  default:
	     System.out.println("\n**** Invalid selection *** Try again");
	     break;
       }
    }
}
