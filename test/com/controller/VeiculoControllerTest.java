/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 28/01/2013
 */
public class VeiculoControllerTest {

    public VeiculoControllerTest() {
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
     * Test of salvar method, of class VeiculoController.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class VeiculoController.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        Integer id = null;
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.deletar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class VeiculoController.
     */
    @Test
    public void testEditar() throws Exception {
        System.out.println("editar");
        Integer id = null;
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.editar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}