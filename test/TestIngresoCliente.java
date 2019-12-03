import DAO.ClienteDAO;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.util.Date;
import java.text.DateFormat;  


public class TestIngresoCliente {
    
    public TestIngresoCliente() {
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
    public void ingresoCliente(){
        ClienteDAO cdao = new ClienteDAO();

        System.out.println(cdao.ingresoCliente("ABC123", "Automovil"));               
        System.out.println(cdao.ingresoCliente("AAA 000", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA-000", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA_000", "Automovil"));
        System.out.println(cdao.ingresoCliente("000", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA", "Automovil"));
        System.out.println(cdao.ingresoCliente("000AAA", "Automovil"));
        System.out.println(cdao.ingresoCliente("aaa000", "Automovil"));
        System.out.println(cdao.ingresoCliente("AA000", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA00", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA00A", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA000", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA000", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("AAA000", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA000", "Automovil"));
        System.out.println("--------------------------------------");
        
        System.out.println(cdao.ingresoCliente("AAA 00A", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA-00A", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA_00A", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("000", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("00AAAA", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("aaa00a", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AA00A", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA00", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA000", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA00A", "Automovil"));
        System.out.println(cdao.ingresoCliente("AAA00A", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("AAA00J", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("AAA00J", "Motocicleta"));
        System.out.println("--------------------------------------");
        
        
        System.out.println(cdao.ingresoCliente("0", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("012345678654654546549", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("AAA000", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("AAA00A", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("AAAAAAAAAA", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("0123456789", "Automovil"));
        System.out.println(cdao.ingresoCliente("0123456789", "Motocicleta"));
        System.out.println(cdao.ingresoCliente("0123456789", "Bicicleta"));
        System.out.println(cdao.ingresoCliente("0123456789", "Bicicleta"));
        System.out.println("--------------------------------------");
       
    }

}
