
package Interfaz;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import restaurante.*;

public class AGInicio2 extends javax.swing.JFrame {


    public static Integer idCam ;
    
    
    public AGInicio2() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Inicio Administrador General");
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonSalir.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(30,30,20));
        jBotonVolver.setIcon(icono);
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Imagenes/BotonSiguienteRojo.png"));
        Icon icono1= new ImageIcon(imagen1.getImage().getScaledInstance(30,30,20));
        jBotonSiguiente.setIcon(icono1);
       
        Imagen1 Imagen = new Imagen1(740,420);
        jPAdminGeneral.add(Imagen);
        jPAdminGeneral.repaint();


    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPAdminGeneral = new javax.swing.JPanel();
        jAdminGral = new javax.swing.JLabel();
        jBotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPlatosVendidos = new javax.swing.JButton();
        jInsumosContables = new javax.swing.JButton();
        jAdminGral2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBotonSiguiente = new javax.swing.JButton();
        jPlatoMasVendido1 = new javax.swing.JButton();
        jAdminGral3 = new javax.swing.JLabel();
        jConsultarCantidadIns = new javax.swing.JButton();
        jInsumosMenosGastado = new javax.swing.JButton();
        jPlatoMenosVendido1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPAdminGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jPAdminGeneral.setForeground(new java.awt.Color(255, 255, 255));
        jPAdminGeneral.setPreferredSize(new java.awt.Dimension(720, 400));

        jAdminGral.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jAdminGral.setText("Administrador General");

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
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Cerrar Sesión");

        jPlatosVendidos.setBackground(new java.awt.Color(0, 102, 102));
        jPlatosVendidos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPlatosVendidos.setForeground(new java.awt.Color(255, 255, 255));
        jPlatosVendidos.setText("Platos vendidos");
        jPlatosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlatosVendidosActionPerformed(evt);
            }
        });

        jInsumosContables.setBackground(new java.awt.Color(0, 102, 102));
        jInsumosContables.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jInsumosContables.setForeground(new java.awt.Color(255, 255, 255));
        jInsumosContables.setText("Insumos Contable");
        jInsumosContables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsumosContablesActionPerformed(evt);
            }
        });

        jAdminGral2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jAdminGral2.setText("Estadísticas");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Siguiente");

        jBotonSiguiente.setBackground(new java.awt.Color(153, 0, 0));
        jBotonSiguiente.setBorder(null);
        jBotonSiguiente.setBorderPainted(false);
        jBotonSiguiente.setContentAreaFilled(false);
        jBotonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBotonSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotonSiguiente.setIconTextGap(6);
        jBotonSiguiente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSiguienteActionPerformed(evt);
            }
        });

        jPlatoMasVendido1.setBackground(new java.awt.Color(0, 102, 102));
        jPlatoMasVendido1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPlatoMasVendido1.setForeground(new java.awt.Color(255, 255, 255));
        jPlatoMasVendido1.setText("Plato mas vendido");
        jPlatoMasVendido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlatoMasVendido1ActionPerformed(evt);
            }
        });

        jAdminGral3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jAdminGral3.setText("Insumos");

        jConsultarCantidadIns.setBackground(new java.awt.Color(0, 102, 102));
        jConsultarCantidadIns.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jConsultarCantidadIns.setForeground(new java.awt.Color(255, 255, 255));
        jConsultarCantidadIns.setText("Consultar cantidad de insumo");
        jConsultarCantidadIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarCantidadInsActionPerformed(evt);
            }
        });

        jInsumosMenosGastado.setBackground(new java.awt.Color(0, 102, 102));
        jInsumosMenosGastado.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jInsumosMenosGastado.setForeground(new java.awt.Color(255, 255, 255));
        jInsumosMenosGastado.setText("Insumos Menos Gastado");
        jInsumosMenosGastado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsumosMenosGastadoActionPerformed(evt);
            }
        });

        jPlatoMenosVendido1.setBackground(new java.awt.Color(0, 102, 102));
        jPlatoMenosVendido1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPlatoMenosVendido1.setForeground(new java.awt.Color(255, 255, 255));
        jPlatoMenosVendido1.setText("Plato menos vendido");
        jPlatoMenosVendido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlatoMenosVendido1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAdminGeneralLayout = new javax.swing.GroupLayout(jPAdminGeneral);
        jPAdminGeneral.setLayout(jPAdminGeneralLayout);
        jPAdminGeneralLayout.setHorizontalGroup(
            jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137)
                .addComponent(jAdminGral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jInsumosContables, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInsumosMenosGastado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConsultarCantidadIns, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPlatosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlatoMasVendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlatoMenosVendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jAdminGral3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAdminGral2)
                .addGap(157, 157, 157))
        );
        jPAdminGeneralLayout.setVerticalGroup(
            jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                .addComponent(jBotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jAdminGral)
                                .addComponent(jLabel1))
                            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))
                        .addGap(28, 28, 28)
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAdminGral2)
                            .addComponent(jAdminGral3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jInsumosContables, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPlatoMasVendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jInsumosMenosGastado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPlatoMenosVendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jConsultarCantidadIns, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPlatosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAdminGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAdminGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jPlatosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlatosVendidosActionPerformed
        AplatoMenosVendido p= new AplatoMenosVendido();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPlatosVendidosActionPerformed

    private void jInsumosContablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsumosContablesActionPerformed
       AGinventarioContable p= new AGinventarioContable();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jInsumosContablesActionPerformed

    private void jBotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSiguienteActionPerformed
        AGInicio obj =new AGInicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBotonSiguienteActionPerformed

    private void jPlatoMasVendido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlatoMasVendido1ActionPerformed
        AplatoMasVendido obj =new AplatoMasVendido();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPlatoMasVendido1ActionPerformed

    private void jConsultarCantidadInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarCantidadInsActionPerformed
        AGconsultarCantidad obj =new AGconsultarCantidad();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jConsultarCantidadInsActionPerformed

    private void jInsumosMenosGastadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsumosMenosGastadoActionPerformed
        AGinsumoMenosGastado obj =new AGinsumoMenosGastado();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jInsumosMenosGastadoActionPerformed

    private void jPlatoMenosVendido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlatoMenosVendido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPlatoMenosVendido1ActionPerformed

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
                new AGInicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdminGral;
    private javax.swing.JLabel jAdminGral2;
    private javax.swing.JLabel jAdminGral3;
    private javax.swing.JButton jBotonSiguiente;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JButton jConsultarCantidadIns;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JButton jInsumosContables;
    private javax.swing.JButton jInsumosMenosGastado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPAdminGeneral;
    private javax.swing.JButton jPlatoMasVendido1;
    private javax.swing.JButton jPlatoMenosVendido1;
    private javax.swing.JButton jPlatosVendidos;
    // End of variables declaration//GEN-END:variables
}
