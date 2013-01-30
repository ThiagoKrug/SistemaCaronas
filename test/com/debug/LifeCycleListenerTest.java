/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.debug;

import javax.faces.event.PhaseEvent;
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
    public void testAfterPhase() {
        System.out.println("afterPhase");
        PhaseEvent event = null;
        LifeCycleListener instance = new LifeCycleListener();
        instance.afterPhase(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beforePhase method, of class LifeCycleListener.
     */
    @Test
    public void testBeforePhase() {
        System.out.println("beforePhase");
        PhaseEvent event = null;
        LifeCycleListener instance = new LifeCycleListener();
        instance.beforePhase(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}