/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.converter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Juliano Macedo
 * @since 28/01/2013
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.converter.TipoUsuarioConverterTest.class, com.converter.UsuarioConverterTest.class, com.converter.TipoVeiculoConverterTest.class, com.converter.VeiculoConverterTest.class})
public class ConverterSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}