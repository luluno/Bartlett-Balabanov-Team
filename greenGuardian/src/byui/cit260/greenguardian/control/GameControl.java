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
}
