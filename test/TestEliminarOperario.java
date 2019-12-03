/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.OperarioDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class TestEliminarOperario {
    
    public TestEliminarOperario() {
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

    @Test
    public void eliminarOperario(){
        OperarioDAO odao = new OperarioDAO();
        System.out.println(odao.eliminarOperario(""));
        System.out.println(odao.eliminarOperario("0123"));
        System.out.println(odao.eliminarOperario("0"));
        System.out.println(odao.eliminarOperario("01234564564564564654"));
        System.out.println(odao.eliminarOperario("0000000000"));
        System.out.println(odao.eliminarOperario("0000000000"));
    }
}
