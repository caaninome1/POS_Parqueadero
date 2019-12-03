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
public class TestBuscarOperario {
    
    public TestBuscarOperario() {
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
    public void buscarOperario(){
        OperarioDAO odao = new OperarioDAO();
        System.out.println(odao.buscarOperarioId(""));
        System.out.println(odao.buscarOperarioId("012345"));
        System.out.println(odao.buscarOperarioId("0"));
        System.out.println(odao.buscarOperarioId("0123456789"));
        System.out.println(odao.buscarOperarioId("1234567890"));
        System.out.println(odao.buscarOperarioId("0000000000"));
    }
}
