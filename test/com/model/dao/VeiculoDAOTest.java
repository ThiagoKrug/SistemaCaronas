/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Veiculo;
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
public class VeiculoDAOTest {

    public VeiculoDAOTest() {
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
     * Test of inserir method, of class VeiculoDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Veiculo veiculo = null;
        VeiculoDAO instance = new VeiculoDAO();
        instance.inserir(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altera method, of class VeiculoDAO.
     */
    @Test
    public void testAltera() {
        System.out.println("altera");
        Veiculo veiculo = null;
        VeiculoDAO instance = new VeiculoDAO();
        instance.altera(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class VeiculoDAO.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        Veiculo veiculo = null;
        VeiculoDAO instance = new VeiculoDAO();
        instance.deletar(veiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}