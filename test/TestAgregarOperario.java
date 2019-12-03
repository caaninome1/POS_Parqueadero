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
public class TestAgregarOperario {
    
    public TestAgregarOperario() {
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
    public void insertarOperarios(){
       OperarioDAO odao = new OperarioDAO();
        
        System.out.println(odao.insertarOperario("", "", "", ""));
        System.out.println(odao.insertarOperario("0123456789", "Carlos", "caaninome", "12345"));
        System.out.println(odao.insertarOperario("0123456789", "Carlos", "caaninome", "12345"));
        System.out.println(odao.insertarOperario("0123456789", "David", "dscastanedav", "12345"));
        System.out.println(odao.insertarOperario("1234567890", "David", "dscastanedav", "12345"));
        System.out.println(odao.insertarOperario("0000000000", "Diana", "dbarrerac", "00000"));
        System.out.println(odao.insertarOperario("0123456789", "C", "caaninome", "12345"));
        System.out.println(odao.insertarOperario("0123456789", "Carlos Pedro Solano Perez Angulo Prieto", "caaninome", "12345"));
        System.out.println(odao.insertarOperario("012345678", "Carlos", "caaninome", "12345"));
        System.out.println(odao.insertarOperario("0123456789", "Carlos", "c", "12345"));
        System.out.println(odao.insertarOperario("0123456789", "Carlos", "el usuario de carlos es: caaninome", "12345"));
        System.out.println(odao.insertarOperario("0123456789", "Carlos", "caaninome", "12345"));
        System.out.println(odao.insertarOperario("0123456789", "Carlos", "caaninome", "123"));
        System.out.println(odao.insertarOperario("0123456789", "Carlos", "caaninome", "012345678901234567890"));    
    }
}
