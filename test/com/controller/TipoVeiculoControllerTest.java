/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Classe pai contem apenas métdos Set e Get.
 * Aqui então testamos apenas se a instância da classe pode ser gerada corretamente.
 *
 * @author Juliano Macedo
 * @since 28/01/2013
 */
public class TipoVeiculoControllerTest {

    public TipoVeiculoControllerTest() {
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
     * Método que teste se a instância da classe TipoVeiculoController pode ser
     * criada criada com sucesso.
     */
    @Test
    public void testTipoVeiculoController() {
        System.out.println("testeTipoVeiculoController");

        System.out.println("Testando a criação de Intâcia: 'TipoVeiculoController'");
        TipoVeiculoController instance = new TipoVeiculoController();
        assertNotNull(">>> A instância da Classe 'TipoVeiculoController' não pode ser criada! <<<", instance);
    }
}