package FRONTERA;

import DAO.ClienteDAO;
import ENTIDAD.Clientes;
import java.math.BigInteger;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import java.time.Instant;

/**
 *
 * @author Carlos
 */
public class Operario extends javax.swing.JFrame {

    private ClienteDAO cdao = new ClienteDAO();
    
    public Operario() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("OPERARIO");
        mostrarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        btnIngreso = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnIngresosRegistrados = new javax.swing.JButton();
        cbTipoVehiculo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtIdTicket = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnBuscarIdTicket = new javax.swing.JButton();
        txtValorTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LValorTotal = new javax.swing.JLabel();
        txtFechaEntrada = new javax.swing.JTextField();
        txtFechaSalida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBaseImponible = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClienteDatos = new javax.swing.JTable();
        Puntos = new javax.swing.JLabel();
        txtPuntos = new javax.swing.JTextField();
        txtIVA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        cbformaPago = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("INGRESO Y SALIDA DE CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 170, -1));

        btnIngreso.setBackground(new java.awt.Color(0, 255, 0));
        btnIngreso.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnIngreso.setText("INGRESO");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 170, 40));

        btnSalida.setBackground(new java.awt.Color(255, 0, 0));
        btnSalida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSalida.setText("SALIDA");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 170, 40));

        btnIngresosRegistrados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresosRegistrados.setText("Ingresos Registrados");
        jPanel1.add(btnIngresosRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 230, -1));

        cbTipoVehiculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Automovil", "Motocicleta", "Bicicleta" }));
        jPanel1.add(cbTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Matrícula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtMatricula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMatricula.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyTyped(evt);
            }
        });
        jPanel1.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        txtIdTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtIdTicket.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIdTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdTicketKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Id Ticket");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 30));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 140, -1));

        btnBuscarIdTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarIdTicket.setText("Buscar");
        btnBuscarIdTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarIdTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 140, -1));

        txtValorTotal.setEditable(false);
        txtValorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Entrada");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 100, 20));

        LValorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LValorTotal.setText("Valor TOTAL ($)");
        jPanel1.add(LValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, 20));

        txtFechaEntrada.setEditable(false);
        txtFechaEntrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFechaEntrada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFechaEntrada.setToolTipText("");
        txtFechaEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFechaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 180, -1));

        txtFechaSalida.setEditable(false);
        txtFechaSalida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFechaSalida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fecha Salida");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 90, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Base Imponible");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 110, 20));

        txtBaseImponible.setEditable(false);
        txtBaseImponible.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBaseImponible.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtBaseImponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 180, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("IVA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 40, 20));

        tbClienteDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbClienteDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClienteDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 900, 160));

        Puntos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Puntos.setText("Puntos");
        jPanel1.add(Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 70, 20));

        txtPuntos.setEditable(false);
        txtPuntos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPuntos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 180, -1));

        txtIVA.setEditable(false);
        txtIVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIVA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tiempo (min)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        txtTiempo.setEditable(false);
        txtTiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 180, -1));

        cbformaPago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbformaPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "T. Crédito", "T. Débito", "Puntos" }));
        jPanel1.add(cbformaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 140, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 580, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 580, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        String mensaje = "";
        if(txtMatricula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar una matrícula");
        }else{
            String matricula = txtMatricula.getText();
            String tipoVehiculo = cbTipoVehiculo.getSelectedItem().toString();
            
            
            mensaje = cdao.ingresoCliente(matricula, tipoVehiculo);
            JOptionPane.showMessageDialog(null, mensaje);
        }
        if(mensaje == "Ingresado correctamente"){
            mostrarTabla();
            limpiar();
        }     
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        FramePrincipal fp = new FramePrincipal();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed
    
    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        String mensaje = "";
        if(txtIdTicket.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar un ID Ticket!");
        }else if ((cdao.sacarClientes(new BigInteger(txtIdTicket.getText())))==false){
            JOptionPane.showMessageDialog(null, "¡El id no existe!");
            limpiar();          
        }else{
        BigInteger IdTicket = new BigInteger(txtIdTicket.getText());
        mensaje = cdao.salidaCliente(IdTicket); 
        
        JOptionPane.showMessageDialog(null, mensaje);
        mostrarTabla();
        limpiar();
        }           
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed

    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void tbClienteDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteDatosMouseClicked
        int select = tbClienteDatos.getSelectedRow();
        txtIdTicket.setText(tbClienteDatos.getValueAt(select, 0) + "");
        txtMatricula.setText(tbClienteDatos.getValueAt(select, 1) + "");
        cbTipoVehiculo.setSelectedItem(tbClienteDatos.getValueAt(select, 2) + "");
        txtPuntos.setText(tbClienteDatos.getValueAt(select, 3) + "");
        //txtEstado.setText(tbClienteDatos.getValueAt(select, 5)+"");
        txtFechaEntrada.setText(tbClienteDatos.getValueAt(select, 4) + "");
        txtFechaSalida.setText(tbClienteDatos.getValueAt(select, 5) + "");
        txtTiempo.setText(tbClienteDatos.getValueAt(select, 6)+"");
        txtBaseImponible.setText(tbClienteDatos.getValueAt(select, 7) + "");
        txtIVA.setText(tbClienteDatos.getValueAt(select, 8) + "");
        txtValorTotal.setText(tbClienteDatos.getValueAt(select, 9) + "");
    }//GEN-LAST:event_tbClienteDatosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtFechaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEntradaActionPerformed

    private void txtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyTyped

    }//GEN-LAST:event_txtMatriculaKeyTyped

    private void txtMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyReleased
        txtMatricula.setText(txtMatricula.getText().toUpperCase());
    }//GEN-LAST:event_txtMatriculaKeyReleased

    private void btnBuscarIdTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdTicketActionPerformed
        if(txtIdTicket.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo Id Ticket está vacío");
        }else{
            Clientes c = cdao.buscarClientes(new BigInteger(txtIdTicket.getText()));
            txtMatricula.setText(c.getMatricula());
            txtPuntos.setText(c.getPuntos()+"");
            txtTiempo.setText(c.getTiempo()+"");
            txtFechaEntrada.setText(c.getEntrada());
            txtFechaSalida.setText(c.getSalida());
            txtBaseImponible.setText(c.getBaseImponible()+"");
            txtIVA.setText(c.getIva()+"");
            txtValorTotal.setText(c.getValorTotal()+"");
        }
    }//GEN-LAST:event_btnBuscarIdTicketActionPerformed

    private void txtIdTicketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdTicketKeyTyped
        char c = evt.getKeyChar();
        
        if(c<'0'|| c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdTicketKeyTyped

    /**
     * @param args the command line arguments
     */
    public void limpiar() {
        txtIdTicket.setText("");
        txtMatricula.setText("");
        txtPuntos.setText("");
        txtTiempo.setText("");
        txtFechaEntrada.setText("");
        txtFechaSalida.setText("");
        txtBaseImponible.setText("");
        txtIVA.setText("");
        txtValorTotal.setText("");
    }
    
    private void mostrarTabla() {
        cdao.listarClientes(tbClienteDatos);
    }

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
            java.util.logging.Logger.getLogger(Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LValorTotal;
    private javax.swing.JLabel Puntos;
    private javax.swing.JButton btnBuscarIdTicket;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnIngresosRegistrados;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JComboBox cbTipoVehiculo;
    public static javax.swing.JComboBox cbformaPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbClienteDatos;
    private javax.swing.JTextField txtBaseImponible;
    private javax.swing.JTextField txtFechaEntrada;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtIVA;
    public static javax.swing.JTextField txtIdTicket;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtPuntos;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
