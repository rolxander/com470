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
public class ValidarEmailTest {
    ValidarEmail validar = ValidarEmail.getInstance();
    public ValidarEmailTest() {
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
        System.out.print("Reseteamos valor clean para siguiente uso");
        validar.reset();
    }
    @Test
    public void testValidarEmailSinArroba(){
        boolean resultado = validar.validaEmail("gaelelpapigmail.com");
        assertFalse(resultado);
    }
    @Test
    public void testValidarEmailConArroba(){
        boolean resultado = validar.validaEmail("gaelelpapi@gmail.com");
        assertTrue(resultado);
    }
}
