/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Usuario;
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
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
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
     * Test of getById method, of class UsuarioDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        Integer id = null;
        UsuarioDAO instance = new UsuarioDAO();
        Usuario expResult = null;
        Usuario result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class UsuarioDAO.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        UsuarioDAO instance = new UsuarioDAO();
        List expResult = null;
        List result = instance.getUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserir method, of class UsuarioDAO.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.inserir(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class UsuarioDAO.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.alterar(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class UsuarioDAO.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        Usuario usuario = null;
        UsuarioDAO instance = new UsuarioDAO();
        instance.deletar(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}