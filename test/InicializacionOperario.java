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
public class InicializacionOperario {
    
    public InicializacionOperario() {
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
    public void loginOperario(){
        ControlOperarios odao = new ControlOperarios();
        
        System.out.println(odao.loginOperario("", ""));
        System.out.println(odao.loginOperario("caaninome", "12345"));
        System.out.println(odao.loginOperario("dscastanedav", "1234567890"));
        System.out.println(odao.loginOperario("caaninome", "123458"));
        System.out.println(odao.loginOperario("caanino", "12345"));
        System.out.println(odao.loginOperario("dbarrerac", "12345"));
        System.out.println(odao.loginOperario("dscastanedav", "00000"));
        System.out.println(odao.loginOperario("katun", "55555"));  
        System.out.println("----------------------");
    }
    
    @Test
    public void actualizarOperario(){
        ControlOperarios odao = new ControlOperarios();
        
        System.out.println(odao.actualizarOperario("", "", "", "",1));
        System.out.println(odao.actualizarOperario("0123456789", "Carlos", "caaninome", "12345",9));
        System.out.println(odao.actualizarOperario("012345678", "Carlos", "caaninome", "12345",9));
        System.out.println(odao.actualizarOperario("012345678", "Carlo", "caaninome", "12345",9));
        System.out.println(odao.actualizarOperario("012345678", "Carlo", "caaninom", "12345",9));
        System.out.println(odao.actualizarOperario("012345678", "Carlo", "caaninom", "1234",9));
        System.out.println(odao.actualizarOperario("0", "Carlo", "caaninom", "1234",9));
        System.out.println(odao.actualizarOperario("012345678901234567890", "Carlo", "caaninom", "1234",9));
        System.out.println(odao.actualizarOperario("012345678", "C", "caaninom", "1234",9));
        System.out.println(odao.actualizarOperario("012345678", "Carlos Arturo Peñaranda Sisa de la Aspriella y Romano Mendez Buen día", "caaninom", "1234",3));
        System.out.println(odao.actualizarOperario("012345678", "Carlo", "c", "1234",1));
        System.out.println(odao.actualizarOperario("012345678", "Carlo", "el usuario provisto a carlos es: caaninomeeeee", "1234",3));
        System.out.println(odao.actualizarOperario("012345678", "Carlo", "caaninom", "1",2));
        System.out.println(odao.actualizarOperario("012345678", "Carlo", "caaninom", "123454564654654654654654654",2)); 
        System.out.println("--------------------------");
    }
    


    
    @Test 
    public void verificarLongitudNombre(){
        ControlOperarios odao = new ControlOperarios();
        System.out.println(odao.verificarLongitudNombre(""));
        System.out.println(odao.verificarLongitudNombre("C"));
        System.out.println(odao.verificarLongitudNombre("Carlos De las siete vírgenes Torcuato y Castebeldía Diomedes Turanga Armero y Palacios"));
        System.out.println(odao.verificarLongitudNombre("Carlos"));
        System.out.println("------------------------");
    }

    @Test 
    public void verificarLongitudUsuario(){
        ControlOperarios odao = new ControlOperarios();
        System.out.println(odao.verificarLongitudUsuario(""));
        System.out.println(odao.verificarLongitudUsuario("c"));
        System.out.println(odao.verificarLongitudUsuario("caaninome Terrealba Castebeldía Diomedes Turanga Armero y Palacios"));
        System.out.println(odao.verificarLongitudUsuario("caaninome"));
        System.out.println("------------------------");
    }
    
    @Test 
    public void verificarLongituPassword(){
        ControlOperarios odao = new ControlOperarios();
        System.out.println(odao.verificarLongitudPassword(""));
        System.out.println(odao.verificarLongitudPassword("0"));
        System.out.println(odao.verificarLongitudPassword("012345678901234567890123456789"));
        System.out.println(odao.verificarLongitudPassword("01234"));
        System.out.println("-------------------------");
    }

}

