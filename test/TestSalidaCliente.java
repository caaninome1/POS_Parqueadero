/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ClienteDAO;
import java.math.BigInteger;
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
public class TestSalidaCliente {
    
    public TestSalidaCliente() {
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
    public void salidaClientes(){
        ClienteDAO cdao = new ClienteDAO();
        
//        System.out.println(cdao.salidaCliente(new BigInteger("2")));
//        System.out.println(cdao.salidaCliente(new BigInteger("3")));
//        System.out.println(cdao.salidaCliente(new BigInteger("3")));
//        System.out.println(cdao.salidaCliente(new BigInteger("18")));
//        System.out.println(cdao.salidaCliente(new BigInteger("0")));
//        System.out.println(cdao.salidaCliente(new BigInteger("-1")));
        System.out.println(cdao.salidaCliente(new BigInteger("12"),"Puntos"));
    }
}
