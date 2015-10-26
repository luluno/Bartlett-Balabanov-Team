/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.control;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author nicholasjdev
 */
public class GameControlTimeAdjustmentTest {
 
   public GameControlTimeAdjustmentTest() {
   }

   /**
    * Test of adjustDay method, of class GameControl.
    */
   @Test
   public void testAdjustDay() {
      System.out.println("adjustDay");
      /*************************************************
      *Test case #1 & 2 Valid test
      **************************************************/
      GameControl instance = new GameControl();
      System.out.println("Test Case #1 Valid test.");
      GameControl.Dates date = instance.new Dates();
      byte expResult = 16;
      instance.adjustDay(date, (byte)15);
      byte result = date.getDay();
      System.out.println("Result="+result+"\n");
      assertEquals(expResult, result, 0.01);
     
      System.out.println("Test Case #2 Valid test. Adjustment more then days in Month");
      date = instance.new Dates();
      expResult = 2;
      instance.adjustDay(date, (byte)33);
      result = date.getDay();
      System.out.println("Result="+result+"\n");
      assertEquals(expResult, result, 0.01);
      
      /*************************************************
      *Test case #3 & 4 the invalid test
      **************************************************/
      System.out.println("Test Case #3 InValid test. Adjustment are negative");
      date = instance.new Dates();
      expResult = -1;
      instance.adjustDay(date, (byte)-1);
      result = date.getDay();
      System.out.println("Result="+result+"\n");
      assertEquals(expResult, result, 0.01);
      
      System.out.println("Test Case #4 InValid test. Adjustment equal zero");
      date = instance.new Dates();
      expResult = 0;
      instance.adjustDay(date, (byte)0);
      result = date.getDay();
      System.out.println("Result="+result+"\n");
      assertEquals(expResult, result, 0.01);
      
      /*************************************************
      *Test case #5 Boarder Test
      **************************************************/
      System.out.println("Test Case #5 Boarder test. Adjustment equal 30");
      date = instance.new Dates();
      expResult = 31;
      instance.adjustDay(date, (byte)30);
      result = date.getDay();
      System.out.println("Result="+result+"\n");
      assertEquals(expResult, result, 0.01);
   }
   
}

