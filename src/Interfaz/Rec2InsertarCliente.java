
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


public class Rec2InsertarCliente extends javax.swing.JFrame {


    
    public Rec2InsertarCliente() {
        
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Agregar Pedido");
        jSaludo.setText("Camarero "+
                CamInicio.idCam);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonVolver2.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(30,30,20));
        jBotonVolver1.setIcon(icono);
        
        Imagen2 Imagen = new Imagen2(740,420);
        jPanel1.add(Imagen);
        jPanel1.repaint();
        
        
        
        
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSaludo = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        insertar = new javax.swing.JButton();
        jMesa = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jPlato = new javax.swing.JLabel();
        cantidadLabel = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jBotonVolver1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        jSaludo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jSaludo.setForeground(new java.awt.Color(255, 255, 255));
        jSaludo.setText("Insertar cliente");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        insertar.setBackground(new java.awt.Color(0, 153, 153));
        insertar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        insertar.setForeground(new java.awt.Color(255, 255, 255));
        insertar.setText("Insertar cliente");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        jMesa.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jMesa.setForeground(new java.awt.Color(255, 255, 255));
        jMesa.setText("Nombre");

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        jPlato.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jPlato.setForeground(new java.awt.Color(255, 255, 255));
        jPlato.setText("Apellido");

        cantidadLabel.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        cantidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        cantidadLabel.setText("Telefono");

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        jBotonVolver1.setBackground(new java.awt.Color(153, 0, 0));
        jBotonVolver1.setBorder(null);
        jBotonVolver1.setBorderPainted(false);
        jBotonVolver1.setContentAreaFilled(false);
        jBotonVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonVolver1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonVolver1.setIconTextGap(6);
        jBotonVolver1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBotonVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolver1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jMesa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPlato)
                        .addGap(140, 140, 140))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(204, 204, 204)
                        .addComponent(jSaludo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(cantidadLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSaludo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBotonVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPlato)
                    .addComponent(jMesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cantidadLabel)
                .addGap(5, 5, 5)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
                
             try {  
            // Creamos la conexion  
            CallableStatement cStmt;
            Class.forName("com.mysql.jdbc.Driver");
           
            cStmt = MySQL.conn.prepareCall("{call proc_crear_cliente(?,?,?)}");
            MySQL.conn.setAutoCommit(true);  
              
             cStmt.setString(1, nombre.getText());    
             cStmt.setString(2, apellido.getText());  
             cStmt.setInt(3, Integer.valueOf(telefono.getText()));
          
             cStmt.execute();
             cStmt.close();
             
             WClienteAgregado p = new WClienteAgregado(this);
             p.setVisible(true);

        }catch (Exception e) {  
                     Logger.getLogger(Rec2InsertarCliente.class.getName()).log(Level.SEVERE, null, e);

        }
             
    }//GEN-LAST:event_insertarActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void jBotonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolver1ActionPerformed
        RecInicio obj =new RecInicio();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jBotonVolver1ActionPerformed

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
                new Rec2InsertarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JButton insertar;
    private javax.swing.JButton jBotonVolver1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPlato;
    private javax.swing.JLabel jSaludo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
