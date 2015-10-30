/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.view;

import java.util.Scanner;

/**
 *
 * @author Lucia bartlett & Nicholas Balabanov
 */
public class HelpMenuView {
    private final String MENU = "\n"
           + "\n======================================================================"
           + "\n|                           Help Menu                                |"
           + "\n======================================================================"
           + "\nG - Getting Started"         
           + "\nF - Frequently asked questions"
           + "\nD - Difficulty level"
           + "\nR - Recyclopedia"            
           + "\nE - Exit"
           + "\n======================================================================";
   
    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU); // display the help menu
            
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
	  case 'G':
	     this.gettingStarted();
	     break;
	  case 'F':
	     this.frequentlyAskedQuestions();
	     break;
	  case 'D':
	     this.difficultyLevel();
	     break;
	  case 'R':
	     this.recyclopedia();
	     break;
	  case 'E':
	     return;
	  default:
	     System.out.println("\n**** Invalid selection *** Try again");
	     break;
       }
    }
}
