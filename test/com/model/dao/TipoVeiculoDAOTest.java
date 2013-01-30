/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.TipoVeiculo;
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
public class TipoVeiculoDAOTest {
    
    public TipoVeiculoDAOTest() {
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
     * Test of getById method, of class TipoVeiculoDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Integer id = null;
        TipoVeiculoDAO instance = new TipoVeiculoDAO();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTiposVeiculos method, of class TipoVeiculoDAO.
     */
    @Test
    public void testGetTiposVeiculos() {
        System.out.println("getTiposVeiculos");
        TipoVeiculoDAO instance = new TipoVeiculoDAO();
        List expResult = null;
        List result = instance.getTiposVeiculos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}