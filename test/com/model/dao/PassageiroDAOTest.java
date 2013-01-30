/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Passageiro;
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
public class PassageiroDAOTest {

    public PassageiroDAOTest() {
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
     * Test of inserir method, of class PassageiroDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Passageiro passageiro = null;
        PassageiroDAO instance = new PassageiroDAO();
        instance.inserir(passageiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassageiros method, of class PassageiroDAO.
     */
    @Test
    public void testGetPassageiros() {
        System.out.println("getPassageiros");
        PassageiroDAO instance = new PassageiroDAO();
        List expResult = null;
        List result = instance.getPassageiros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altera method, of class PassageiroDAO.
     */
    @Test
    public void testAltera() {
        System.out.println("altera");
        Passageiro passageiro = null;
        PassageiroDAO instance = new PassageiroDAO();
        instance.altera(passageiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class PassageiroDAO.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Passageiro passageiro = null;
        PassageiroDAO instance = new PassageiroDAO();
        instance.remove(passageiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class PassageiroDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Integer id = null;
        PassageiroDAO instance = new PassageiroDAO();
        Passageiro expResult = null;
        Passageiro result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByNome method, of class PassageiroDAO.
     */
    @Test
    public void testGetByNome() {
        System.out.println("getByNome");
        String nome = "";
        PassageiroDAO instance = new PassageiroDAO();
        List expResult = null;
        List result = instance.getByNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByRG method, of class PassageiroDAO.
     */
    @Test
    public void testGetByRG() {
        System.out.println("getByRG");
        String nome = "";
        PassageiroDAO instance = new PassageiroDAO();
        Passageiro expResult = null;
        Passageiro result = instance.getByRG(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}