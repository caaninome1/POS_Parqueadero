/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CONTROL.AdministradoresJpaController;
import ENTIDAD.Administradores;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class AdministradoresDAO {

    private Administradores admin = new Administradores();
    private AdministradoresJpaController ajc = new AdministradoresJpaController();
    private String mensaje = "";

    public boolean login(String administrador, String contraseña) {
        EntityManager em = ajc.getEntityManager();
        boolean valor;
        try {
            Query query = em.createQuery("SELECT a.administrador, a.contrasena "
                    + "FROM Administradores a WHERE a.administrador = :administrador "
                    + "AND a.contrasena = :contrasena");
            query.setParameter("administrador", administrador);
            query.setParameter("contrasena", contraseña);
            List resultado = query.getResultList();
            if (!resultado.isEmpty()) {
                valor = true;
            } else {
                valor = false;
            }
        } catch (Exception e) {
            valor = false;
        }
        return valor;
    }

    public String insertarAdministrador(String administrador, String contrasena) {
        if ((administrador.equals("")) || (contrasena.equals(""))) {
            System.out.println("todos los campos son obligatorios");
        } else {
                try {
                    admin.setIdadministrador(1);
                    admin.setAdministrador(administrador);
                    admin.setContrasena(contrasena);
                    ajc.create(admin);
                    mensaje = "Administrador registrado correctamente";
                } catch (Exception e) {
                    System.out.println("Mensaje en registrar " + e.getMessage());
                    mensaje = "Ya existe un administrador";
                }
        }
        return mensaje;
    }
}
