/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.SolicitacaoViagem;
import java.util.List;
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
public class SolicitacaoViagemDAOTest {
    
    public SolicitacaoViagemDAOTest() {
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
     * Test of inserir method, of class SolicitacaoViagemDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        SolicitacaoViagem solicitacao = null;
        SolicitacaoViagemDAO instance = new SolicitacaoViagemDAO();
        instance.inserir(solicitacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class SolicitacaoViagemDAO.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        SolicitacaoViagem solicitacao = null;
        SolicitacaoViagemDAO instance = new SolicitacaoViagemDAO();
        instance.alterar(solicitacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class SolicitacaoViagemDAO.
     */
    @Test
    public void testDeletar_int() throws Exception {
        System.out.println("deletar");
        int id = 0;
        SolicitacaoViagemDAO instance = new SolicitacaoViagemDAO();
        instance.deletar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class SolicitacaoViagemDAO.
     */
    @Test
    public void testDeletar_SolicitacaoViagem() throws Exception {
        System.out.println("deletar");
        SolicitacaoViagem solicitacaoViagem = null;
        SolicitacaoViagemDAO instance = new SolicitacaoViagemDAO();
        instance.deletar(solicitacaoViagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolicitacoes method, of class SolicitacaoViagemDAO.
     */
    @Test
    public void testGetSolicitacoes() throws Exception {
        System.out.println("getSolicitacoes");
        SolicitacaoViagemDAO instance = new SolicitacaoViagemDAO();
        List expResult = null;
        List result = instance.getSolicitacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class SolicitacaoViagemDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Integer id = null;
        SolicitacaoViagemDAO instance = new SolicitacaoViagemDAO();
        SolicitacaoViagem expResult = null;
        SolicitacaoViagem result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}