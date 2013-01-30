/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
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
public class VeiculoConverterTest {

    public VeiculoConverterTest() {
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
     * Test of getAsObject method, of class VeiculoConverter.
     */
    @Test
    public void testGetAsObject() {
        System.out.println("getAsObject");
        FacesContext context = null;
        UIComponent component = null;
        String value = "";

        System.out.println("Testando a criação de Intâcia: 'VeiculoConverter'");
        VeiculoConverter instance = new VeiculoConverter();
        assertNotNull(">>> A instância da Classe 'VeiculoConverter' não pode ser criada! <<<", instance);

        Object expResult = null;
        Object result = instance.getAsObject(context, component, value);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAsString method, of class VeiculoConverter.
     */
    @Test
    public void testGetAsString() {
        System.out.println("getAsString");
        FacesContext context = null;
        UIComponent component = null;
        Object value = null;

        System.out.println("Testando a criação de Intâcia: 'VeiculoConverter'");
        VeiculoConverter instance = new VeiculoConverter();
        assertNotNull(">>> A instância da Classe 'VeiculoConverter' não pode ser criada! <<<", instance);

        Object expResult = null;
        String result = instance.getAsString(context, component, value);
        assertEquals(expResult, result);
    }
}