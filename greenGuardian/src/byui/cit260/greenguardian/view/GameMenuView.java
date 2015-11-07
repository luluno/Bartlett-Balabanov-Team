/**
 * *******************************************************************
 * Program: GreedGuardian, Developing the GameMenu View Class Brother: Jackson,
 * CIT260 Author: Nicholas Balabanov Summary: This is a GameMenuView class that displays
 * Controls most of the game 
    * *********************************************************************
 */
package byui.cit260.greenguardian.view;

import java.util.Scanner;

/**
 *
 * @author Nicholas Balabanov
 */
public class GameMenuView {

   void displayMenu() {
      char choice;
      choice = ' ';
      String Menu = ("*****************************************************\n"
	      + "* \tThis is Game Menu     \t          *\n"
	      + "*****************************************************");
      System.out.println(Menu);
      do {
	 
	 choice = this.getInput();
	 this.doAction(choice);
      }
      while (choice != 'Q');
   }

   private char getInput() {
      boolean valid = false; //indicates if the value has been retrieved
      String Input = null;
      char letter;
      Scanner keyboard = new Scanner(System.in); //keyboard input stream

      while (!valid) { // while a valid value has not been retrieved

	 // prompt for a value
	 System.out.println("Enter a category first letter(enter H, for more information):");

	 //get the value from the keyboard and trim off the blanks
	 Input = keyboard.nextLine();
	 Input = Input.trim();
	 //if the value is invalid (less than two characters in length)
	 if (Input.length() == 0) {
	    System.out.println("Incorrect input value - input cannot be blank");
	    continue; // and repeat again
	 }
	 break; // out of the (exit) the repetition
      }
      letter = Character.toUpperCase(Input.charAt(0));
      return letter;
   }
   private void doAction(char selection)
   {
      switch(selection)
      {
      
	  case 'V':
	     System.out.println("**** ViewMap method called ****");
	     break;
	  case 'U':
	     System.out.println("**** DisplayTools method called ****");
	     break;
	  case 'S':
	     System.out.println("**** CityStatus method called ****");
	     break;
	  case 'C':
	     System.out.println("**** ExploreCity method called ****");
	     break;
	  case 'M':
	     System.out.println("**** Move to new City method called ****");
	     return;
	  case 'E':
	     System.out.println("**** Time and distance methods called ****");
	     break;
	  case 'T':
	     System.out.println("**** Transportation method called ****");
	     break;
	  case 'L':
	     System.out.println("**** Load of Transportation method called ****");
	     break;
	  case 'W':
	     System.out.println("**** GetToWork method called ****");
	     break;
	     case 'X':
	     System.out.println("**** CollectTrash method called ****");
	     break;
	  case 'A':
	     System.out.println("**** Ask UGC method called ****");
	     break;
	  case 'H':
	    this.helpDisplay();
	     break;
	  case 'Q':
	     System.out.println("**** Quit method called ****");
	     break;
	  default:
	     System.out.println("\n**** Invalid selection *** Try again");
	     break;
      }
   }
   final void helpDisplay()
      {
       final String menu = "\n"
	       + "\n ==============================="
	       + "\n|                           Game Menu         \t          |"
	       + "\n ==============================="
	       + "\n|\tV - View Map         \t          |"
	       + "\n|\tU - View tools  \t          |"
	       + "\n|\tS - Display city status\t          |"
	       + "\n|\tC - Explore the city   \t          |"
	       + "\n|\tM - Move to a new city\t          |"
	       + "\n|\tE - Estimate time and distane\t          |"
	       + "\n|\tT - Transportation        \t          |"
	       + "\n|\tL - Estimate the load of Tran.\t          |"
	       + "\n|\tW - Work on city         \t          |"
	       + "\n|\tX - Collect the trash     \t          |"
	       + "\n|\tA - Ask UGC, if aplicable.\t          |"
	       + "\n|\tH - Display help menu  \t          |"
	       + "\n|\tQ - Quit the game        \t          |"
	       + "\n===============================\n";
       System.out.println(menu);
      }
}
