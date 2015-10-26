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
 * @author Joe
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of calcConvertTime method, of class GameControl.
     */
    @Test
    public void testCalcConvertTime() {
        System.out.println("calcConvertTime");
        /*************************************
        * Test Case #1 
        **************************************/
        System.out.println("\tTest case #1");
        short time = 2401;
        short days = 0;
        GameControl instance = new GameControl();
        short expResult = 11;
        short result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
    
         /*************************************
        * Test Case #2 
        **************************************/
        System.out.println("\tTest case #2");
        time = 679;
        days = 0;
        expResult = 5;
        result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
        
         /*************************************
        * Test Case #3
        **************************************/
        System.out.println("\tTest case #3");
        time = 480;
        days = 0;
        expResult = 3;
        result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
        
         /*************************************
        * Test Case #4
        **************************************/
        System.out.println("\tTest case #4");
        time = 720;
        days = 0;
        expResult = 5;
        result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
        
        /*************************************
        * Test Case #5
        **************************************/
        System.out.println("\tTest case #5");
        time = 0;
        days = 0;
        expResult = 3;
        result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
        
         /*************************************
        * Test Case #6
        **************************************/
        System.out.println("\tTest case #6");
        time = -133;
        days = 0;
        expResult = 3;
        result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
        
         /*************************************
        * Test Case #7
        **************************************/
        System.out.println("\tTest case #7");
        time = 1;
        days = 0;
        expResult = 3;
        result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
        
         /*************************************
        * Test Case #8
        **************************************/
        System.out.println("\tTest case #8");
        time = 9999;
        days = 0;
        expResult = 41;
        result = instance.calcConvertTime(time, days);
        assertEquals(expResult, result);
        
    }
    
}
