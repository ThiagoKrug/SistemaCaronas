/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.debug;

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
public class LifeCycleListenerTest {

    public LifeCycleListenerTest() {
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
     * Test of afterPhase method, of class LifeCycleListener.
     */
    @Test
    public void testLifeCycleListener() {
        System.out.println("LifeCycleListener");

        System.out.println("Testando a criação de Intâcia: 'TipoVeiculoController'");
        LifeCycleListener instance = new LifeCycleListener();
        assertNotNull(">>> A instância da Classe 'LifeCycleListener' não pode ser criada! <<<", instance);
    }
}