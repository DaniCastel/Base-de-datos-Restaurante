
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


public class CamAgregarPedido extends javax.swing.JFrame {


    
    public CamAgregarPedido() {
        
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Agregar Pedido");
        jSaludo.setText("Camarero "+
                CamInicio.idCam);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonVolver.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(20,20,10));
        jBotonVolver.setIcon(icono);

        
        
        
        
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSaludo = new javax.swing.JLabel();
        jFMesa = new javax.swing.JTextField();
        jAgregarPedido = new javax.swing.JButton();
        jSaludo1 = new javax.swing.JLabel();
        jMesa = new javax.swing.JLabel();
        jFPlato = new javax.swing.JTextField();
        jFCantidad = new javax.swing.JTextField();
        jPlato = new javax.swing.JLabel();
        jBotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        jSaludo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo.setText("Camarero");

        jFMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFMesaActionPerformed(evt);
            }
        });

        jAgregarPedido.setBackground(new java.awt.Color(0, 153, 153));
        jAgregarPedido.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jAgregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jAgregarPedido.setText("Agregar Pedido");
        jAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarPedidoActionPerformed(evt);
            }
        });

        jSaludo1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo1.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo1.setText("Cantidad");

        jMesa.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jMesa.setForeground(new java.awt.Color(255, 255, 255));
        jMesa.setText("Mesa");

        jFPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFPlatoActionPerformed(evt);
            }
        });

        jFCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCantidadActionPerformed(evt);
            }
        });

        jPlato.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jPlato.setForeground(new java.awt.Color(255, 255, 255));
        jPlato.setText("Plato");

        jBotonVolver.setBackground(new java.awt.Color(153, 0, 0));
        jBotonVolver.setBorder(null);
        jBotonVolver.setBorderPainted(false);
        jBotonVolver.setContentAreaFilled(false);
        jBotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonVolver.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jFMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jMesa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPlato)
                        .addGap(61, 61, 61)))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jSaludo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(jSaludo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSaludo)
                    .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPlato)
                    .addComponent(jMesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jFPlato, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSaludo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFMesaActionPerformed

    private void jAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarPedidoActionPerformed
        String pla = jFPlato.getText();
        String cant = jFCantidad.getText();
        String mes = jFMesa.getText();

        Integer plato=Integer.parseInt(pla);
        Integer cantidad=Integer.parseInt(cant);
        Integer mesa=Integer.parseInt(mes);
                
             try {  
            // Creamos la conexion  
            CallableStatement cStmt;
      
            cStmt = MySQL.conn.prepareCall(" CALL proc_agregar_pedido(?,?,?,?) ");
            MySQL.conn.setAutoCommit(false);  
              
             cStmt.setInt(1, mesa);    
             cStmt.setInt(2, plato);  
             cStmt.setInt(3, cantidad);
             cStmt.setInt(4, CamInicio.idCam);
          
             cStmt.execute();     

        }catch (Exception e) {  
                     Logger.getLogger(CamAgregarPedido.class.getName()).log(Level.SEVERE, null, e);

        }
             
    }//GEN-LAST:event_jAgregarPedidoActionPerformed

    private void jFPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFPlatoActionPerformed

    private void jFCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFCantidadActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        CamInicio obj =new CamInicio();
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
                new CamAgregarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregarPedido;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JTextField jFCantidad;
    private javax.swing.JTextField jFMesa;
    private javax.swing.JTextField jFPlato;
    private javax.swing.JLabel jMesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPlato;
    private javax.swing.JLabel jSaludo;
    private javax.swing.JLabel jSaludo1;
    // End of variables declaration//GEN-END:variables
}
