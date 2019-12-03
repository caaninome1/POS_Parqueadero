
import DAO.ParqueaderoDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class InicializacionParquadero {
     public InicializacionParquadero() {
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
    public void insertarParqueadero(){
       ParqueaderoDAO pdao = new ParqueaderoDAO();
       System.out.println(pdao.insertarParqueadero("","", "", "", 
                "", "", "", 0, 0, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("1","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "C", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "12345678978787", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Con altura", 110, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 111, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 78, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 11));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 111, 78, 11));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 0, 0, 0));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel y 50 cupos o más", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0000000000","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel y 50 cupos o más", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456788","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel y 50 cupos o más", 100, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456788","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel y 50 cupos o más", 70, 70, 0));
       System.out.println(pdao.insertarParqueadero("0123456788","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel y 50 cupos o más", 70, 30, 11));
       System.out.println(pdao.insertarParqueadero("0123456787","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel con menos de 50 cupos", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0000000000","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel con menos de 50 cupos", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456787","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel con menos de 50 cupos", 89, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456787","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel con menos de 50 cupos", 70, 63, 0));
       System.out.println(pdao.insertarParqueadero("0123456787","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "Subterráneo, un solo nivel con menos de 50 cupos", 70, 30, 11));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con 50 cupos o más", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0000000000","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con 50 cupos o más", 70, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456786","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con 50 cupos o más", 78, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456786","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con 50 cupos o más", 70, 55, 0));
       System.out.println(pdao.insertarParqueadero("0123456786","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con 50 cupos o más", 70, 30, 11));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con menos de 50 cupos", 40, 30, 0));
       System.out.println(pdao.insertarParqueadero("0000000000","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con menos de 50 cupos", 40, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456785","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con menos de 50 cupos", 67, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456785","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con menos de 50 cupos", 40, 47, 0));
       System.out.println(pdao.insertarParqueadero("0123456785","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, piso en concreto, asfalto o gravilla lavada de rio compactada, y con menos de 50 cupos", 40, 30, 11));
       System.out.println(pdao.insertarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, pisos en afirmado o césped", 20, 30, 0));
       System.out.println(pdao.insertarParqueadero("0000000000","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, pisos en afirmado o césped", 20, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456784","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, pisos en afirmado o césped", 56, 30, 0));
       System.out.println(pdao.insertarParqueadero("0123456785","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, pisos en afirmado o césped", 20, 40, 0));
       System.out.println(pdao.insertarParqueadero("0123456785","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "A nivel, pisos en afirmado o césped", 20, 30, 11));  
        System.out.println("--------------------------------------------------------------------");
    }
    
    @Test
    public void actualizarParqueadero(){
        ParqueaderoDAO pdao = new ParqueaderoDAO();
        System.out.println(pdao.actualizarParqueadero("","", "", "", 
                "", "", "", 0, 0, 0));
        System.out.println(pdao.actualizarParqueadero("0123456789","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parking", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Comun", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 123", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "1234567", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "0123", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "En altura o subterráneo con dos o más niveles", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 70, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "S", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "C", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "1", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "12345678905465465454", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "0", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "0123455646546546", "A nivel, pisos en afirmado o césped", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped ", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o céspedsdfsdfdfsdfsdfsdfs", 20, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 1000, 30, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 1000, 0));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 20, 30, 1000));
        System.out.println(pdao.actualizarParqueadero("0123456788","Parkin", "Simplificado", "Cl 1234", 
                "123456789", "012345", "A nivel, pisos en afirmado o césped", 1000, 1000, 1000));   
        System.out.println("--------------------------------------------------------------------");
    }

}
