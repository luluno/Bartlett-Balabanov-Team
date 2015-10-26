/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholasjdev
 */
public class GameControlTest {
   
   public GameControlTest() {
   }

   /**
    * Test of adjustDay method, of class GameControl.
    */
   @Test
   public void testAdjustDay() {
      System.out.println("adjustDay");
      /*
      * Test case #1 Valid test.
      */
      GameControl instance = new GameControl();
      System.out.println("Test Case #1 Valid test.");
      GameControl.Dates date = instance.new Dates();
      float expResult = 16;
      instance.adjustDay(date, (byte)15);
      byte result = date.getDay();
      System.out.println("the expected result="+expResult+" and result="+result);
      assertEquals(expResult, result, 0.01);
   }
   
}
