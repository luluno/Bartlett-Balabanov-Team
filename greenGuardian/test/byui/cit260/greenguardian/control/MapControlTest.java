/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.greenguardian.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholasjdev
 */
public class MapControlTest {
   
   public MapControlTest() {
   }
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }
   
   @Before
   public void setUp() {
   }
   
   @After
   public void tearDown() {
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
      System.out.println("Test case#1 cityCoordinates(7,5); playerCoordinates(2,3)");
      MapControl instance = new MapControl(); // Create an object of the MapControl Class
      //Create an object of Coordinates class, name it cityCoordinates and use non-default constructor to provide
      //the necessary value to the variables row and column
      byte column = 5;
      byte row = 7;
      MapControl.Coordinates cityCoordinates = instance.new Coordinates(row,column);
      MapControl.Coordinates playerCoordinates = instance.new Coordinates((byte)2,(byte)3);
      float expResult = 2400;
      float result = instance.calcTimeToMove(playerCoordinates, cityCoordinates);
      System.out.println("the expected result="+expResult+" and result="+result);
      assertEquals(expResult, result, 0.01);
   }
}
