
package Interfaz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import restaurante.*;

public class CamInicio extends javax.swing.JFrame {


    public static Integer idCam=1 ;
    
    public CamInicio() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Inicio Camarero");
        
         ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonSalir.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(30,30,20));
        jBotonVolver.setIcon(icono);
        jFCamId.setHorizontalAlignment( jFCamId.CENTER);
       
        Imagen2 Imagen = new Imagen2(740,420);
        jPanel1.add(Imagen);
        jPanel1.repaint();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jFCamId = new javax.swing.JTextField();
        jCamID = new javax.swing.JLabel();
        jBMisPropinas = new javax.swing.JButton();
        jBAgregarPedido = new javax.swing.JButton();
        jBEntregarPedido = new javax.swing.JButton();
        jBotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jClientesAtendidos = new javax.swing.JButton();
        jCancelarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Camarero");

        jFCamId.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jFCamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCamIdActionPerformed(evt);
            }
        });

        jCamID.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jCamID.setForeground(new java.awt.Color(255, 255, 255));
        jCamID.setText("ID");

        jBMisPropinas.setBackground(new java.awt.Color(51, 51, 51));
        jBMisPropinas.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jBMisPropinas.setForeground(new java.awt.Color(255, 255, 255));
        jBMisPropinas.setText("Mis propinas");
        jBMisPropinas.setBorderPainted(false);
        jBMisPropinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMisPropinasActionPerformed(evt);
            }
        });

        jBAgregarPedido.setBackground(new java.awt.Color(51, 51, 51));
        jBAgregarPedido.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jBAgregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregarPedido.setText("Agregar Pedido");
        jBAgregarPedido.setBorderPainted(false);
        jBAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarPedidoActionPerformed(evt);
            }
        });

        jBEntregarPedido.setBackground(new java.awt.Color(51, 51, 51));
        jBEntregarPedido.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jBEntregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jBEntregarPedido.setText("Entregar Pedido");
        jBEntregarPedido.setBorderPainted(false);
        jBEntregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntregarPedidoActionPerformed(evt);
            }
        });

        jBotonVolver.setBackground(new java.awt.Color(153, 0, 0));
        jBotonVolver.setBorder(null);
        jBotonVolver.setBorderPainted(false);
        jBotonVolver.setContentAreaFilled(false);
        jBotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonVolver.setFocusPainted(false);
        jBotonVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonVolver.setIconTextGap(6);
        jBotonVolver.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cerrar Sesión");

        jClientesAtendidos.setBackground(new java.awt.Color(51, 51, 51));
        jClientesAtendidos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jClientesAtendidos.setForeground(new java.awt.Color(255, 255, 255));
        jClientesAtendidos.setText("Clientes atendidos");
        jClientesAtendidos.setBorderPainted(false);
        jClientesAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClientesAtendidosActionPerformed(evt);
            }
        });

        jCancelarPedido.setBackground(new java.awt.Color(51, 51, 51));
        jCancelarPedido.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jCancelarPedido.setText("Cancelar Pedido");
        jCancelarPedido.setBorderPainted(false);
        jCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jCamID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFCamId, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jClientesAtendidos, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jBAgregarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBEntregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jBMisPropinas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jFCamId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jCamID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEntregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jClientesAtendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBMisPropinas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFCamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCamIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCamIdActionPerformed

    private void jBMisPropinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMisPropinasActionPerformed
         try{
            idCam = Integer.parseInt(jFCamId.getText());
        CamPropinaslDia p= new CamPropinaslDia();
        p.setVisible(true);
        dispose();
        }catch(Exception e){
             WIngresaID p= new WIngresaID();
            p.setVisible(true);
           
        } 
        
        
       
    }//GEN-LAST:event_jBMisPropinasActionPerformed

    private void jBAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarPedidoActionPerformed
        
        try{
            idCam = Integer.parseInt(jFCamId.getText());
            CamAgregarPedido p= new CamAgregarPedido();
            p.setVisible(true);
            dispose();
        }catch(Exception e){
             WIngresaID p= new WIngresaID();
            p.setVisible(true);
           
        }
        
    }//GEN-LAST:event_jBAgregarPedidoActionPerformed

    private void jBEntregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntregarPedidoActionPerformed
         try{
           idCam = Integer.parseInt(jFCamId.getText());
        CamPedidosPendientes p= new CamPedidosPendientes();
        p.setVisible(true);
        dispose();
        }catch(Exception e){
             WIngresaID p= new WIngresaID();
            p.setVisible(true);
           
        } 
        
        
        
    }//GEN-LAST:event_jBEntregarPedidoActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        Login obj =new Login();
        obj.setVisible(true);
        dispose();
        try {
            MySQL.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Climenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jClientesAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClientesAtendidosActionPerformed
        try{
           idCam = Integer.parseInt(jFCamId.getText());
        CamClientesAtendidos p= new CamClientesAtendidos();
        p.setVisible(true);
        dispose();
        }catch(Exception e){
             WIngresaID p= new WIngresaID();
            p.setVisible(true);
           
        } 
    }//GEN-LAST:event_jClientesAtendidosActionPerformed

    private void jCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarPedidoActionPerformed
        CamCancelarPedido p= new CamCancelarPedido();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jCancelarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CamInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarPedido;
    private javax.swing.JButton jBEntregarPedido;
    private javax.swing.JButton jBMisPropinas;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jCamID;
    private javax.swing.JButton jCancelarPedido;
    private javax.swing.JButton jClientesAtendidos;
    private javax.swing.JTextField jFCamId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
