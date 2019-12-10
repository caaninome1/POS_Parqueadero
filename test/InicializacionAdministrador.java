/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CONTROLADOR.ControlAdministradores;
import CONTROLADOR.ControlOperarios;
import ENTIDAD.Administradores;
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
public class InicializacionAdministrador {
    
    public InicializacionAdministrador() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void insertarAdministradores() {
        ControlAdministradores adao = new ControlAdministradores();
                
        System.out.println(adao.insertarAdministrador("", ""));
        System.out.println(adao.insertarAdministrador("caaninome", "12345"));
        System.out.println(adao.insertarAdministrador("caaninome", "12345"));
        System.out.println(adao.insertarAdministrador("david", "1234"));
        System.out.println("--------------------------------------");
    }
        
    @Test
    public void loginAdministradores(){
        ControlAdministradores adao = new ControlAdministradores();
        
        System.out.println(adao.login("", ""));
        System.out.println(adao.login("caaninome","1234" ));
        System.out.println(adao.login("caaninomee","12345" ));
        System.out.println(adao.login("caaninome","12345" ));
        System.out.println(adao.login("david","12345" ));
        System.out.println(adao.login("caaninome","0000" ));   
        System.out.println("--------------------------------------");
    }
}
