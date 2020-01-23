/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import FRONTERA.Estadisticas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Carlos
 */
public class DaoEstadisticas {
    
        public static void estadistica1()throws Exception{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero","administrador","1234");
            JasperReport estadistica = null;
            String estadistic = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Estadisticas\\Estadistica1.jasper";
            estadistica = (JasperReport) JRLoader.loadObjectFromFile(estadistic);
            JasperPrint jp=JasperFillManager.fillReport(estadistic,null,con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
    }

    public static void estadistica2()throws Exception{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero","administrador","1234");
            JasperReport reporte = null;
            String report = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Estadisticas\\Estadistica2.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(report);
            JasperPrint jp=JasperFillManager.fillReport(report,null,con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
    }
}
