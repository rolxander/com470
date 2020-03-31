/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.holamundo.Service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Gael
 */
public class CalculadoraTest {
    public Calculadora calculadora;
    
    @Before
    public void setUp() {
         calculadora = new Calculadora();
    }
    @Test
    public void testSuma() {
        System.out.println("suma");
        float x = 5.0F;
        float y = 5.0F;
        float expResult = 10.0F;
        float result = calculadora.suma(x, y);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testResta() {
        System.out.println("resta");
        float x = 5.0F;
        float y = 5.0F;
        float expResult = 0.0F;
        float result = calculadora.resta(x, y);
        assertEquals(expResult, result, 0.0);
    }
    @Test   
    public void testDivision() {
        System.out.println("division");
        float x = 25.0F;
        float y = 5.0F;
        float expResult = 5.0F;
        float result = calculadora.division(x, y);
        assertEquals(expResult, result, 0.0);
    }
       @Test   (expected = Exception.class)
    public void testDivisionEntreCero() {
        System.out.println("division");
        float x = 0.0F;
        float y = 0.0F;
        float expResult = 0.0F;
        float result = calculadora.division(x, y);
        assertNull(null);
    }
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        float x = 5.0F;
        float y = 5.0F;
        float expResult = 25.0F;
        float result = calculadora.multiplicacion(x, y);
        assertEquals(expResult, result, 0.0);
    }
}
