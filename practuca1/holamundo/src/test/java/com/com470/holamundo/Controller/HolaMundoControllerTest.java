/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holamundo.Controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jose Gael
 */
public class HolaMundoControllerTest {
    @Test
    public void testHola() {
        System.out.println("hola");
        HolaMundoController instance = new HolaMundoController();
        String expResult = "Hola Mundo";
        String result = instance.hola();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
