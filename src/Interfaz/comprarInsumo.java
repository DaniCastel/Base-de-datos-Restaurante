
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


public class comprarInsumo extends javax.swing.JFrame {


    
    public comprarInsumo() {
        
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Agregar Pedido");
        jSaludo.setText("Camarero "+
                CamInicio.idCam);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonVolver2.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(20,20,10));
        jBotonVolver.setIcon(icono);

        
        
        
        
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSaludo = new javax.swing.JLabel();
        sede = new javax.swing.JTextField();
        realizarCompra = new javax.swing.JButton();
        jSaludo1 = new javax.swing.JLabel();
        jMesa = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        insumo = new javax.swing.JTextField();
        jPlato = new javax.swing.JLabel();
        jBotonVolver = new javax.swing.JButton();
        cantidadLabel = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        jSaludo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo.setText("Comprar insumo");

        sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedeActionPerformed(evt);
            }
        });

        realizarCompra.setBackground(new java.awt.Color(0, 153, 153));
        realizarCompra.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        realizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        realizarCompra.setText("Realizar compra");
        realizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarCompraActionPerformed(evt);
            }
        });

        jSaludo1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo1.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo1.setText("Nombre del insumo");

        jMesa.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jMesa.setForeground(new java.awt.Color(255, 255, 255));
        jMesa.setText("Sede");

        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });

        insumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insumoActionPerformed(evt);
            }
        });

        jPlato.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jPlato.setForeground(new java.awt.Color(255, 255, 255));
        jPlato.setText("Nombre del proveedor");

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

        cantidadLabel.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        cantidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadLabel.setText("Cantidad");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jMesa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insumo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sede, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPlato)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(realizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(jSaludo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jSaludo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantidadLabel)
                .addGap(140, 140, 140))
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
                    .addComponent(sede, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSaludo1)
                    .addComponent(cantidadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insumo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(realizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedeActionPerformed

    private void realizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarCompraActionPerformed
        String inSede = sede.getText();
        String inProveedor = proveedor.getText();
        String inInsumo = insumo.getText();
        String inCantidad = cantidad.getText();
        
        Integer sp_sede =Integer.parseInt(inSede);
        Integer sp_cantidad=Integer.parseInt(inCantidad);
                
             try {  
            // Creamos la conexion  
            CallableStatement cStmt;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conec = DriverManager.getConnection("jdbc:mysql://localhost/entregafinalbd","root","ragnarok3798");
            cStmt = conec.prepareCall("{call sp_compra_insumo(?,?,?,?)}");
            conec.setAutoCommit(true);  
              
             cStmt.setInt(1, sp_sede);    
             cStmt.setString(2, inProveedor);  
             cStmt.setString(3, inInsumo);
             cStmt.setInt(4, sp_cantidad);
          
             cStmt.execute();
             cStmt.close();
             conec.close();
        }catch (Exception e) {  
                     Logger.getLogger(comprarInsumo.class.getName()).log(Level.SEVERE, null, e);

        }
             
    }//GEN-LAST:event_realizarCompraActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorActionPerformed

    private void insumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insumoActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        CamInicio obj =new CamInicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

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
                new comprarInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JTextField insumo;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jMesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPlato;
    private javax.swing.JLabel jSaludo;
    private javax.swing.JLabel jSaludo1;
    private javax.swing.JTextField proveedor;
    private javax.swing.JButton realizarCompra;
    private javax.swing.JTextField sede;
    // End of variables declaration//GEN-END:variables
}
