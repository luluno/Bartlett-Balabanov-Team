/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.control;

/**
 *
 * @author Lucia Bartlett Individual Assignment
 */
public class GameControl {
    /*
    * The GameControl will retrieve the calcTimeToMove and will convert that time
    * in minutes to time in days.
    */
    
           public short calcConvertTime(short time, short days){
              if (time <= 0){
                return 3;
}
             else
                  days = (short) (time / 500 * 2 + 3);
                    days = (short) Math.round(days);

                     return days;
}

/**
 * *********************************************************************
 * Program: GreedGuardian, Developing the GameControl subclass 
 * Brother Jackson, CIT260 
 * Author: Nicholas Balabanov 
 * Summary: This is a GameControl class that
 * responds for everything that would happened in the game-program.
 * **********************************************************************
 */

/**
 *
 * @author Nicholas Balabanov
 */
   /*
    *
    */
      
      public void adjustDay (Dates date, short adjustment)
{
	 // receive the ammount days in the current month;

   short days = daysInMonth(date.month,date.year);
   if (adjustment <= 0)
   {
      System.out.println("We can't go back in time, the time machines didn't invent yet.");
   }
   while(adjustment>0)
   {
   date.day++;
  if(date.day > days)
  {
  date.day = 1;
  adjustMonth(date,(byte)1);
  daysInMonth(date.month,date.year);
  }
   adjustment --;
   }
}

   private short daysInMonth(byte month, short year) {
     System.out.println("This would be dinamic, but right now it would return average ammount of days.");
//To change body of generated methods, choose Tools | Templates.
     return 30;
   }

   private void adjustMonth(Dates date, byte i) {
    System.out.println("Months was adjusted");//To change body of generated methods, choose Tools | Templates.
   }

   public class Dates {

      public Dates() {
	 this.day = 1;
	 this.month = 1;
	 this.year = 2055;
      }
      private byte day;
      private byte month;
      private short year;

      public byte getDay() {
	 return this.day;
      }

      public byte getMonth() {
	 return this.month;
      }

      public short getYear() {
	 return this.year;
      }

      public void setDate(byte day, byte month, short year) {
	 this.day = day;
	 this.month = month;
	 this.year = year;
      }
   }
}
