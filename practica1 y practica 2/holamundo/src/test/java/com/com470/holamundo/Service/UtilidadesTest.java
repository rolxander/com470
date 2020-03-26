/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holamundo.Service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Gael
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
    }

    /**
     * Test of concatenar method, of class Utilidades.
     */
    @org.junit.Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @org.junit.Test
    public void testConcatenarFallo() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @org.junit.Test
    public void testConcatenarError() {
        System.out.println("concatenar");
        String uno = null;
        String dos = "Mundo";
        Utilidades instance = new Utilidades();
        String expResult = null;
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
