/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.entity.SolicitacaoViagem;
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
public class SolicitacaoViagemControllerTest {

    public SolicitacaoViagemControllerTest() {
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
     * Test of salvar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        String expResult = "";
        String result = instance.salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testEditar() throws Exception {
        System.out.println("editar");
        Integer id = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        String expResult = "";
        String result = instance.editar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        Integer id = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        String expResult = "";
        String result = instance.deletar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testCancelar() throws Exception {
        System.out.println("cancelar");
        Integer id = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        String expResult = "";
        String result = instance.cancelar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialiseSession method, of class SolicitacaoViagemController.
     */
    @Test
    public void testInitialiseSession() throws Exception {
        System.out.println("initialiseSession");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.initialiseSession();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolicitacaoviagem method, of class
     * SolicitacaoViagemController.
     */
    @Test
    public void testGetSolicitacaoviagem() throws Exception {
        System.out.println("getSolicitacaoviagem");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        SolicitacaoViagem expResult = null;
        SolicitacaoViagem result = instance.getSolicitacaoviagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSolicitacaoviagem method, of class
     * SolicitacaoViagemController.
     */
    @Test
    public void testSetSolicitacaoviagem() throws Exception {
        System.out.println("setSolicitacaoviagem");
        SolicitacaoViagem solicitacaoviagem = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setSolicitacaoviagem(solicitacaoviagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}