/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTERA;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Carlos
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    private int x;
    private int y;
    
    public Administrador() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Administrador");
        Toolkit t= Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionOperarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnGestionParqueadero = new javax.swing.JButton();
        btnGenerarInformes = new javax.swing.JButton();
        btnVerEstadisticas = new javax.swing.JButton();
        lblicono = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblSuperior = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, -1));

        btnGestionOperarios.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnGestionOperarios.setText("Gestión de Operarios");
        btnGestionOperarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionOperariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionOperariosMouseExited(evt);
            }
        });
        btnGestionOperarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionOperariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionOperarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 230, -1));

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 230, -1));

        btnGestionParqueadero.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnGestionParqueadero.setText("Gestión Parqueadero");
        btnGestionParqueadero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionParqueaderoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionParqueaderoMouseExited(evt);
            }
        });
        btnGestionParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionParqueaderoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionParqueadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, -1));

        btnGenerarInformes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnGenerarInformes.setText("Generar Informes");
        btnGenerarInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarInformesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarInformesMouseExited(evt);
            }
        });
        btnGenerarInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarInformesActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 230, -1));

        btnVerEstadisticas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnVerEstadisticas.setText("Ver Estadísticas");
        btnVerEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerEstadisticasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerEstadisticasMouseExited(evt);
            }
        });
        btnVerEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstadisticasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 230, -1));

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/logotipo.png"))); // NOI18N
        jPanel1.add(lblicono, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 420, 100, -1));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/btnminimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setOpaque(false);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        btnMinimizar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnMinimizarPropertyChange(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 11, 20, 20));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/btncerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setOpaque(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, -1));

        lblSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblSuperiorMouseDragged(evt);
            }
        });
        lblSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSuperiorMousePressed(evt);
            }
        });
        jPanel1.add(lblSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/fondo.png"))); // NOI18N
        lblfondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblfondoMousePressed(evt);
            }
        });
        jPanel1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionOperariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionOperariosActionPerformed
        GestionOperarios go = new GestionOperarios();
        go.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionOperariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        FramePrincipal fp = new FramePrincipal();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnGestionParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionParqueaderoActionPerformed
        ActualizarParqueadero ap = new ActualizarParqueadero();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionParqueaderoActionPerformed

    private void lblfondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfondoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblfondoMousePressed

    private void btnGestionOperariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionOperariosMouseEntered
        btnGestionOperarios.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnGestionOperariosMouseEntered

    private void btnGenerarInformesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarInformesMouseEntered
        btnGenerarInformes.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnGenerarInformesMouseEntered

    private void btnVerEstadisticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEstadisticasMouseEntered
        btnVerEstadisticas.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnVerEstadisticasMouseEntered

    private void btnGestionParqueaderoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionParqueaderoMouseEntered
        btnGestionParqueadero.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnGestionParqueaderoMouseEntered

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnGestionOperariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionOperariosMouseExited
        btnGestionOperarios.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnGestionOperariosMouseExited

    private void btnGenerarInformesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarInformesMouseExited
        btnGenerarInformes.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnGenerarInformesMouseExited

    private void btnVerEstadisticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerEstadisticasMouseExited
        btnVerEstadisticas.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnVerEstadisticasMouseExited

    private void btnGestionParqueaderoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionParqueaderoMouseExited
        btnGestionParqueadero.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnGestionParqueaderoMouseExited

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnMinimizarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnMinimizarPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizarPropertyChange

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void lblSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lblSuperiorMouseDragged

    private void lblSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblSuperiorMousePressed

    private void btnGenerarInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarInformesActionPerformed
        Informes i = new Informes();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGenerarInformesActionPerformed

    private void btnVerEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstadisticasActionPerformed
        Estadisticas e = new Estadisticas();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerEstadisticasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnGenerarInformes;
    private javax.swing.JButton btnGestionOperarios;
    private javax.swing.JButton btnGestionParqueadero;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnVerEstadisticas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblicono;
    // End of variables declaration//GEN-END:variables
}
