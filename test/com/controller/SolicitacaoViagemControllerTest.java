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

    private SolicitacaoViagem solicitacaoviagem;

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

        System.out.println("Testando a criação de Intâcia: 'SolicitacaoViagemController'");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        assertNotNull(">>> A instância da Classe 'SolicitacaoViagemController' não pode ser criada! <<<", instance);

        String expResult = "listar";
        String result = instance.salvar();
        assertEquals(expResult, result);
    }

    /**
     * Test of editar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testEditar() throws Exception {
        System.out.println("editar");
        Integer id = 1;

        System.out.println("Testando a criação de Intâcia: 'SolicitacaoViagemController'");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        assertNotNull(">>> A instância da Classe 'SolicitacaoViagemController' não pode ser criada! <<<", instance);

        String expResult = "formulario";
        String result = instance.editar(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testDeletar() throws Exception {
        System.out.println("deletar");
        Integer id = 1;

        System.out.println("Testando a criação de Intâcia: 'SolicitacaoViagemController'");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        assertNotNull(">>> A instância da Classe 'SolicitacaoViagemController' não pode ser criada! <<<", instance);

        String expResult = "listar";
        String result = instance.deletar(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of cancelar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testCancelar() throws Exception {
        System.out.println("cancelar");
        Integer id = 1;

        System.out.println("Testando a criação de Intâcia: 'SolicitacaoViagemController'");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        assertNotNull(">>> A instância da Classe 'SolicitacaoViagemController' não pode ser criada! <<<", instance);

        String expResult = "listar";
        String result = instance.cancelar(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of initialiseSession method, of class SolicitacaoViagemController.
     */
    @Test
    public void testInitialiseSession() throws Exception {
        System.out.println("initialiseSession");

        System.out.println("Testando a criação de Intâcia: 'SolicitacaoViagemController'");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        assertNotNull(">>> A instância da Classe 'SolicitacaoViagemController' não pode ser criada! <<<", instance);

        instance.initialiseSession();
    }

    /**
     * Test of getSolicitacaoviagem method, of class
     * SolicitacaoViagemController.
     */
    @Test
    public void testGetSolicitacaoviagem() throws Exception {
        System.out.println("getSolicitacaoviagem");

        System.out.println("Testando a criação de Intâcia: 'SolicitacaoViagemController'");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        assertNotNull(">>> A instância da Classe 'SolicitacaoViagemController' não pode ser criada! <<<", instance);

        SolicitacaoViagem expResult = this.solicitacaoviagem;
        SolicitacaoViagem result = instance.getSolicitacaoviagem();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSolicitacaoviagem method, of class
     * SolicitacaoViagemController.
     */
    @Test
    public void testSetSolicitacaoviagem() throws Exception {
        System.out.println("setSolicitacaoviagem");
        SolicitacaoViagem solictViagem = this.solicitacaoviagem;

        System.out.println("Testando a criação de Intâcia: 'SolicitacaoViagemController'");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        assertNotNull(">>> A instância da Classe 'SolicitacaoViagemController' não pode ser criada! <<<", instance);

        instance.setSolicitacaoviagem(solictViagem);
    }
}