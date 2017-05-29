
package Interfaz;
import static Interfaz.CamInicio.idCam;
import java.sql.CallableStatement;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.*;
import static restaurante.MySQL.conn;


public class RecRegistrarFactura extends javax.swing.JFrame {


    
    public RecRegistrarFactura() {
        
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Agregar Pedido");
        jSaludo.setText("Recepcionista "+
                RecID.idRec);
        
        jFMesa.setHorizontalAlignment( jFMesa.CENTER);
        jFModoPago.setHorizontalAlignment( jFModoPago.CENTER);
        jFPropinaCam.setHorizontalAlignment( jFPropinaCam.CENTER);
        jFPropinaChef.setHorizontalAlignment( jFPropinaChef.CENTER);
        jFCostoExtra.setHorizontalAlignment( jFCostoExtra.CENTER);
        jFClienteID.setHorizontalAlignment( jFClienteID.CENTER);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonVolver.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(30,30,20));
        jBotonVolver.setIcon(icono);
        
       
        Imagen2 Imagen = new Imagen2(740,420);
        jPanel1.add(Imagen);
        jPanel1.repaint();
        
        
        
        
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSaludo = new javax.swing.JLabel();
        jFMesa = new javax.swing.JTextField();
        jCompletarFactura = new javax.swing.JButton();
        jSaludo1 = new javax.swing.JLabel();
        jMesa = new javax.swing.JLabel();
        jFModoPago = new javax.swing.JTextField();
        jFPropinaCam = new javax.swing.JTextField();
        jPlato = new javax.swing.JLabel();
        jFPropinaChef = new javax.swing.JTextField();
        jSaludo2 = new javax.swing.JLabel();
        jSaludo3 = new javax.swing.JLabel();
        jFCostoExtra = new javax.swing.JTextField();
        jSaludo4 = new javax.swing.JLabel();
        jFClienteID = new javax.swing.JTextField();
        jBotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        jSaludo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo.setText("Registrar Factura");

        jFMesa.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jFMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFMesaActionPerformed(evt);
            }
        });

        jCompletarFactura.setBackground(new java.awt.Color(51, 51, 51));
        jCompletarFactura.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jCompletarFactura.setForeground(new java.awt.Color(255, 255, 255));
        jCompletarFactura.setText("Registrar Factura");
        jCompletarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCompletarFacturaActionPerformed(evt);
            }
        });

        jSaludo1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo1.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo1.setText("PropinaCam");

        jMesa.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jMesa.setForeground(new java.awt.Color(255, 255, 255));
        jMesa.setText("Mesa");

        jFModoPago.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jFModoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFModoPagoActionPerformed(evt);
            }
        });

        jFPropinaCam.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jFPropinaCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFPropinaCamActionPerformed(evt);
            }
        });

        jPlato.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jPlato.setForeground(new java.awt.Color(255, 255, 255));
        jPlato.setText("ModoPago");

        jFPropinaChef.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jFPropinaChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFPropinaChefActionPerformed(evt);
            }
        });

        jSaludo2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo2.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo2.setText("Costo extra");

        jSaludo3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo3.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo3.setText("PropinaChef");

        jFCostoExtra.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jFCostoExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCostoExtraActionPerformed(evt);
            }
        });

        jSaludo4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo4.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo4.setText("ID de Cliente");

        jFClienteID.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jFClienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFClienteIDActionPerformed(evt);
            }
        });

        jBotonVolver.setBackground(new java.awt.Color(153, 0, 0));
        jBotonVolver.setBorder(null);
        jBotonVolver.setBorderPainted(false);
        jBotonVolver.setContentAreaFilled(false);
        jBotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel1.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSaludo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFPropinaChef, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSaludo1)
                                .addGap(18, 18, 18)
                                .addComponent(jFPropinaCam, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(242, 242, 242))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPlato)
                                .addGap(18, 18, 18)
                                .addComponent(jFModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jMesa)
                                .addGap(18, 18, 18)
                                .addComponent(jFMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSaludo2)
                            .addComponent(jFCostoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSaludo4)
                            .addComponent(jFClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jCompletarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSaludo)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMesa)
                    .addComponent(jSaludo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlato)
                    .addComponent(jFCostoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFPropinaCam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSaludo1)
                    .addComponent(jSaludo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFPropinaChef, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSaludo3))
                .addGap(47, 47, 47)
                .addComponent(jCompletarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
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

    private void jFPropinaCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFPropinaCamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFPropinaCamActionPerformed

    private void jFModoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFModoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFModoPagoActionPerformed

    private void jCompletarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCompletarFacturaActionPerformed

        try{
            
            int mesa=Integer.parseInt(jFMesa.getText());
            String modopago=jFModoPago.getText();
            int propinacam=Integer.parseInt(jFPropinaCam.getText());
            int propinachef=Integer.parseInt(jFPropinaChef.getText());
            int costoextra=Integer.parseInt(jFCostoExtra.getText());
            int idcliente=Integer.parseInt(jFClienteID.getText());
            

            try {
                // Creamos la conexion
                CallableStatement cStmt;
                Class.forName("com.mysql.jdbc.Driver");

                cStmt = MySQL.conn.prepareCall(
                        "{call proc_completar_factura(?,?,?,?,?,?,?)}");
                MySQL.conn.setAutoCommit(true);

                cStmt.setInt(1, mesa);
                cStmt.setString(2, modopago);
                cStmt.setInt(3, propinacam);
                cStmt.setInt(4, propinachef);
                cStmt.setInt(5, costoextra);
                cStmt.setInt(6, idcliente);
                cStmt.setInt(7, RecID.idRec);

                cStmt.execute();

                cStmt.close();

                WFacturaRegistrada obj =new WFacturaRegistrada();
                obj.setVisible(true);

            } catch (Exception e) {

                WPedidoNOAgregado obj =new WPedidoNOAgregado();
                obj.setVisible(true);
                
                Logger.getLogger(RecRegistrarFactura.class.getName()).log(Level.SEVERE, null, e);
                System.out.println("no se hizo pedidos");

            }

        }catch (Exception e){
            WIngresaDatos obj =new WIngresaDatos();
            obj.setVisible(true);
            System.out.println("error");
        }

    }//GEN-LAST:event_jCompletarFacturaActionPerformed

    private void jFMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFMesaActionPerformed

    private void jFPropinaChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFPropinaChefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFPropinaChefActionPerformed

    private void jFCostoExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCostoExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCostoExtraActionPerformed

    private void jFClienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFClienteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFClienteIDActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        RecInicio obj =new  RecInicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

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
                new RecRegistrarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JButton jCompletarFactura;
    private javax.swing.JTextField jFClienteID;
    private javax.swing.JTextField jFCostoExtra;
    private javax.swing.JTextField jFMesa;
    private javax.swing.JTextField jFModoPago;
    private javax.swing.JTextField jFPropinaCam;
    private javax.swing.JTextField jFPropinaChef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPlato;
    private javax.swing.JLabel jSaludo;
    private javax.swing.JLabel jSaludo1;
    private javax.swing.JLabel jSaludo2;
    private javax.swing.JLabel jSaludo3;
    private javax.swing.JLabel jSaludo4;
    // End of variables declaration//GEN-END:variables
}
