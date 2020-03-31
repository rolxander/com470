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
public class MetodosJUnitTest {
    
    public MetodosJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.print("Antes de cada Test");
    }
    
    @After
    public void tearDown() {
        System.out.print("Despues    de cada Test");
    }

    @Test
    public void primerTest() {
        System.out.println("primer Test");
        fail("The test case is a prototype.");
    }
       @Test
    public void segimdpTest() {
        System.out.println("segundo Test");
        fail("The test case is a prototype.");
    }
    
    
}
