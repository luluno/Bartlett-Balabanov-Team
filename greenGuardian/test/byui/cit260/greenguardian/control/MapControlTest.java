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
public class MapControlTest {
   
   public MapControlTest() {
   }
   
   /**
    * Test of calcTimeToMove method, of class MapControl.
    */
   @Test
   public void testCalcTimeToMove() {
      System.out.println("calcTimeToMove");
      /*************************************
      * Test Cases #1 The valid cityCoordinates(7,5); playerCoordinates(2,3);
      **************************************/
      System.out.println("\tTest case #1 cityCoordinates(7,5); playerCoordinates(2,3)");
      MapControl instance = new MapControl(); // Create an object of the MapControl Class
      //Create an object of Coordinates class, name it cityCoordinates and use non-default constructor to provide
      //the necessary value to the variables row and column
      byte column = 5;
      byte row = 7;
      MapControl.Coordinates cityCoordinates = instance.new Coordinates(row,column);
      MapControl.Coordinates playerCoordinates = instance.new Coordinates((byte)2,(byte)3);
      float expResult = 2400;
      float result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("\tThe expected result = "+expResult+" and result = "+result);
      System.out.println();
      assertEquals(expResult, result, 0.01);
      
      /***********************************
       * Test Cases #2 The valid cityCoordinates (4,5); playerCoordinates (2,3);
      ************************************/
      System.out.println("\tTest case #2 cityCoordinates(4,5); playerCoordinates(2,3)");
      
      cityCoordinates = instance.new Coordinates((byte)4, (byte)5);
      playerCoordinates = instance.new Coordinates((byte)2, (byte)3);
      expResult = 679;
      result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("\tThe expected result = "+expResult+" and result = "+result);
      System.out.println();
      assertEquals(expResult, result, 0.01);
      
      /***********************************
       * Test Cases #3 The valid cityCoordinates (2,5); playerCoordinates (2,3);
      ************************************/
      System.out.println("\tTest case #3 cityCoordinates(2,5); playerCoordinates(2,3)");
      
      cityCoordinates = instance.new Coordinates((byte)2, (byte)5);
      playerCoordinates = instance.new Coordinates((byte)2,(byte)3);
      expResult = 480;
      result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("\tThe expected result = "+expResult+" and result = "+result);
      System.out.println();
      assertEquals(expResult, result, 0.01);
      
      /***********************************
       * Test Cases #4 The valid cityCoordinates (5,3); playerCoordinates (2,3);
      ************************************/
      System.out.println("\tTest case #4 cityCoordinates(5,3); playerCoordinates(2,3)");
      
      cityCoordinates = instance.new Coordinates((byte)5, (byte)3);
      playerCoordinates = instance.new Coordinates((byte)2,(byte)3);
      expResult = 720;
      result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("\tThe expected result = "+expResult+" and result = "+result);
      System.out.println();
      assertEquals(expResult, result, 0.01);
      
      /***********************************
       * Test Cases #5 The invalid cityCoordinates (2,3); playerCoordinates (2,3);
      ************************************/
      System.out.println("\tTest case #5 cityCoordinates(2,3); playerCoordinates(2,3)");
      
      cityCoordinates = instance.new Coordinates((byte)2, (byte)3);
      playerCoordinates = instance.new Coordinates((byte)2,(byte)3);
      expResult = 0;
      result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("\tThe expected result = "+expResult+" and result = "+result);
      System.out.println();
      assertEquals(expResult, result, 0.01);
      
      /***********************************
       * Test Cases #6 The boundary cityCoordinates (-5,-5); playerCoordinates (1,1);
      ************************************/
      System.out.println("\tTest case #6 cityCoordinates(-5,-5); playerCoordinates(1,1)");
      
      cityCoordinates = instance.new Coordinates((byte)-5, (byte)-5);
      playerCoordinates = instance.new Coordinates((byte)1,(byte)1);
      expResult = 2036;
      result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("\tThe expected result = "+expResult+" and result = "+result);
      System.out.println();
      assertEquals(expResult, result, 0.01);
      
      /***********************************
       * Test Cases #7 The boundary cityCoordinates (5,5); playerCoordinates (1,1);
      ************************************/
      System.out.println("\tTest case #7 cityCoordinates(5,5); playerCoordinates(1,1)");
      
      cityCoordinates = instance.new Coordinates((byte)5, (byte)5);
      playerCoordinates = instance.new Coordinates((byte)1,(byte)1);
      expResult = 1358;
      result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("\tThe expected result = "+expResult+" and result = "+result);
      System.out.println();
      assertEquals(expResult, result, 0.01);
      
     }
}
