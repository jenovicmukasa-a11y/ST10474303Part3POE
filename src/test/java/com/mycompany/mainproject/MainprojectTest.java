package com.mycompany.mainproject;

import org.junit.Test;
import static org.junit.Assert.*;


public class MainprojectTest {
    
    public MainprojectTest() {
    }

    /**
     * Test of main method, of class Main1.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Mainproject.main(args);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Main1.
     */
    @org.junit.Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        boolean expResult = false;
        boolean result = Mainproject.checkUserName(username);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Main1.
     */
    @org.junit.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = Mainproject.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkSouthAfricanCell method, of class Main1.
     */
    @org.junit.Test
    public void testCheckSouthAfricanCell() {
        System.out.println("checkSouthAfricanCell");
        String cell = "";
        boolean expResult = false;
        boolean result = Mainproject.checkSouthAfricanCell(cell);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}