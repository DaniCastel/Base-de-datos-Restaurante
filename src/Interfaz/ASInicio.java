
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

public class ASInicio extends javax.swing.JFrame {


    public static Integer idCam ;
    
    
    public ASInicio() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Inicio Camarero");
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonSalir.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(30,30,20));
        jBotonVolver.setIcon(icono);
        
       
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
        jBComprasFecha = new javax.swing.JButton();
        jBotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPropinasCam = new javax.swing.JButton();
        jCamMayorPropina = new javax.swing.JButton();
        jChefMayorPropina = new javax.swing.JButton();
        jPropinasChef = new javax.swing.JButton();
        jAdminGral1 = new javax.swing.JLabel();
        jBGananciaPromedio = new javax.swing.JButton();
        jPlatoMenosVendido = new javax.swing.JButton();
        jPlatoMasVendido = new javax.swing.JButton();
        jAdminGral2 = new javax.swing.JLabel();
        jInsumosContables = new javax.swing.JButton();
        jAdminGral3 = new javax.swing.JLabel();

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
        jAdminGral.setText("Administrador de Sede");

        jBComprasFecha.setBackground(new java.awt.Color(0, 102, 102));
        jBComprasFecha.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jBComprasFecha.setForeground(new java.awt.Color(255, 255, 255));
        jBComprasFecha.setText("Compras por Fecha");
        jBComprasFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprasFechaActionPerformed(evt);
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
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Cerrar Sesión");

        jPropinasCam.setBackground(new java.awt.Color(0, 102, 102));
        jPropinasCam.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPropinasCam.setForeground(new java.awt.Color(255, 255, 255));
        jPropinasCam.setText("Camareros");
        jPropinasCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPropinasCamActionPerformed(evt);
            }
        });

        jCamMayorPropina.setBackground(new java.awt.Color(0, 102, 102));
        jCamMayorPropina.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jCamMayorPropina.setForeground(new java.awt.Color(255, 255, 255));
        jCamMayorPropina.setText("Camarero mayor propina");
        jCamMayorPropina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCamMayorPropinaActionPerformed(evt);
            }
        });

        jChefMayorPropina.setBackground(new java.awt.Color(0, 102, 102));
        jChefMayorPropina.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jChefMayorPropina.setForeground(new java.awt.Color(255, 255, 255));
        jChefMayorPropina.setText("Chef mayor propina");
        jChefMayorPropina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChefMayorPropinaActionPerformed(evt);
            }
        });

        jPropinasChef.setBackground(new java.awt.Color(0, 102, 102));
        jPropinasChef.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPropinasChef.setForeground(new java.awt.Color(255, 255, 255));
        jPropinasChef.setText("Chefs");
        jPropinasChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPropinasChefActionPerformed(evt);
            }
        });

        jAdminGral1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jAdminGral1.setText("Propinas");

        jBGananciaPromedio.setBackground(new java.awt.Color(0, 102, 102));
        jBGananciaPromedio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jBGananciaPromedio.setForeground(new java.awt.Color(255, 255, 255));
        jBGananciaPromedio.setText("Ganancia promedio");
        jBGananciaPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGananciaPromedioActionPerformed(evt);
            }
        });

        jPlatoMenosVendido.setBackground(new java.awt.Color(0, 102, 102));
        jPlatoMenosVendido.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPlatoMenosVendido.setForeground(new java.awt.Color(255, 255, 255));
        jPlatoMenosVendido.setText("Plato menos vendido");
        jPlatoMenosVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlatoMenosVendidoActionPerformed(evt);
            }
        });

        jPlatoMasVendido.setBackground(new java.awt.Color(0, 102, 102));
        jPlatoMasVendido.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPlatoMasVendido.setForeground(new java.awt.Color(255, 255, 255));
        jPlatoMasVendido.setText("Plato mas vendido");
        jPlatoMasVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlatoMasVendidoActionPerformed(evt);
            }
        });

        jAdminGral2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jAdminGral2.setText("Estadísticas");

        jInsumosContables.setBackground(new java.awt.Color(0, 102, 102));
        jInsumosContables.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jInsumosContables.setForeground(new java.awt.Color(255, 255, 255));
        jInsumosContables.setText("Insumos Contable");
        jInsumosContables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsumosContablesActionPerformed(evt);
            }
        });

        jAdminGral3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jAdminGral3.setText("Insumos");

        javax.swing.GroupLayout jPAdminGeneralLayout = new javax.swing.GroupLayout(jPAdminGeneral);
        jPAdminGeneral.setLayout(jPAdminGeneralLayout);
        jPAdminGeneralLayout.setHorizontalGroup(
            jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(137, 137, 137)
                        .addComponent(jAdminGral)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                .addComponent(jBComprasFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPropinasCam, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPAdminGeneralLayout.createSequentialGroup()
                                .addComponent(jPlatoMenosVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCamMayorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPAdminGeneralLayout.createSequentialGroup()
                                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPlatoMasVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                        .addComponent(jBGananciaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jInsumosContables, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPropinasChef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jChefMayorPropina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAdminGeneralLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jAdminGral2)
                .addGap(96, 96, 96)
                .addComponent(jAdminGral3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAdminGral1)
                .addGap(105, 105, 105))
        );
        jPAdminGeneralLayout.setVerticalGroup(
            jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jAdminGral)
                        .addComponent(jLabel1))
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(26, 26, 26)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAdminGral1)
                    .addComponent(jAdminGral2)
                    .addComponent(jAdminGral3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPropinasChef, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGananciaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInsumosContables, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChefMayorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlatoMasVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCamMayorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlatoMenosVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPropinasCam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBComprasFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
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

    private void jBComprasFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprasFechaActionPerformed
        AGcomprasPorFecha p= new AGcomprasPorFecha();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBComprasFechaActionPerformed

    private void jPropinasCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPropinasCamActionPerformed
        ApropinaCamarero obj =new ApropinaCamarero();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPropinasCamActionPerformed

    private void jCamMayorPropinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCamMayorPropinaActionPerformed
       AGcamareroMayorPropina obj =new AGcamareroMayorPropina();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jCamMayorPropinaActionPerformed

    private void jChefMayorPropinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChefMayorPropinaActionPerformed
        AGchefMayorPropina obj =new AGchefMayorPropina();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jChefMayorPropinaActionPerformed

    private void jPropinasChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPropinasChefActionPerformed
        ApropinaChef p= new ApropinaChef();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPropinasChefActionPerformed

    private void jBGananciaPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGananciaPromedioActionPerformed
        AgananciaPromPFecha p= new AgananciaPromPFecha();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBGananciaPromedioActionPerformed

    private void jPlatoMenosVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlatoMenosVendidoActionPerformed
        AplatoMenosVendido p= new AplatoMenosVendido();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPlatoMenosVendidoActionPerformed

    private void jPlatoMasVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlatoMasVendidoActionPerformed
        AplatoMasVendido p= new AplatoMasVendido();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPlatoMasVendidoActionPerformed

    private void jInsumosContablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsumosContablesActionPerformed
        AGinventarioContable p= new AGinventarioContable();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jInsumosContablesActionPerformed

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
                new ASInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdminGral;
    private javax.swing.JLabel jAdminGral1;
    private javax.swing.JLabel jAdminGral2;
    private javax.swing.JLabel jAdminGral3;
    private javax.swing.JButton jBComprasFecha;
    private javax.swing.JButton jBGananciaPromedio;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JButton jCamMayorPropina;
    private javax.swing.JButton jChefMayorPropina;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JButton jInsumosContables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPAdminGeneral;
    private javax.swing.JButton jPlatoMasVendido;
    private javax.swing.JButton jPlatoMenosVendido;
    private javax.swing.JButton jPropinasCam;
    private javax.swing.JButton jPropinasChef;
    // End of variables declaration//GEN-END:variables
}
