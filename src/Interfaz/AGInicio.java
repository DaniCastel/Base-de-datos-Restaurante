
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

public class AGInicio extends javax.swing.JFrame {


    public static Integer idCam ;
    
    
    public AGInicio() {
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
        jBComprasFecha = new javax.swing.JButton();
        jBotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPropinasCam = new javax.swing.JButton();
        jCamMayorPropina = new javax.swing.JButton();
        jChefMayorPropina = new javax.swing.JButton();
        jHistorialCompras = new javax.swing.JButton();
        jAdminGral1 = new javax.swing.JLabel();
        jBGananciaPromedio = new javax.swing.JButton();
        jAdminGral2 = new javax.swing.JLabel();
        jAdminGral3 = new javax.swing.JLabel();
        jComprarInsumo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBotonSiguiente = new javax.swing.JButton();
        jBGananciaNetaPorFecha = new javax.swing.JButton();
        jBGananciaPorMetodo = new javax.swing.JButton();

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

        jHistorialCompras.setBackground(new java.awt.Color(0, 102, 102));
        jHistorialCompras.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jHistorialCompras.setForeground(new java.awt.Color(255, 255, 255));
        jHistorialCompras.setText("Historial de compras");
        jHistorialCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHistorialComprasActionPerformed(evt);
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

        jAdminGral2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jAdminGral2.setText("Ganancias");

        jAdminGral3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jAdminGral3.setText("Compras");

        jComprarInsumo.setBackground(new java.awt.Color(0, 102, 102));
        jComprarInsumo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jComprarInsumo.setForeground(new java.awt.Color(255, 255, 255));
        jComprarInsumo.setText("Comprar Insumo");
        jComprarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprarInsumoActionPerformed(evt);
            }
        });

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

        jBGananciaNetaPorFecha.setBackground(new java.awt.Color(0, 102, 102));
        jBGananciaNetaPorFecha.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jBGananciaNetaPorFecha.setForeground(new java.awt.Color(255, 255, 255));
        jBGananciaNetaPorFecha.setText("Ganancia neta por fecha");
        jBGananciaNetaPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGananciaNetaPorFechaActionPerformed(evt);
            }
        });

        jBGananciaPorMetodo.setBackground(new java.awt.Color(0, 102, 102));
        jBGananciaPorMetodo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jBGananciaPorMetodo.setForeground(new java.awt.Color(255, 255, 255));
        jBGananciaPorMetodo.setText("Por metodo de pago");
        jBGananciaPorMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGananciaPorMetodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAdminGeneralLayout = new javax.swing.GroupLayout(jPAdminGeneral);
        jPAdminGeneral.setLayout(jPAdminGeneralLayout);
        jPAdminGeneralLayout.setHorizontalGroup(
            jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                        .addComponent(jBGananciaNetaPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jHistorialCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                        .addComponent(jBGananciaPorMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBComprasFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPropinasCam, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCamMayorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jBGananciaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComprarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jChefMayorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(137, 137, 137)
                        .addComponent(jAdminGral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAdminGeneralLayout.createSequentialGroup()
                                .addComponent(jBotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(64, 64, 64))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAdminGeneralLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jAdminGral2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAdminGral3)
                .addGap(112, 112, 112)
                .addComponent(jAdminGral1)
                .addGap(79, 79, 79))
        );
        jPAdminGeneralLayout.setVerticalGroup(
            jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
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
                            .addComponent(jAdminGral3)))
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addComponent(jBotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGananciaPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComprarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChefMayorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHistorialCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGananciaNetaPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCamMayorPropina, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPropinasCam, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBComprasFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGananciaPorMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAdminGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPAdminGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGananciaPorMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGananciaPorMetodoActionPerformed
        AG3gananciaPorMetodoPago obj =new AG3gananciaPorMetodoPago();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBGananciaPorMetodoActionPerformed

    private void jBGananciaNetaPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGananciaNetaPorFechaActionPerformed
        // TODO add your handling code here:
        AG2gananciaNPFecha obj =new AG2gananciaNPFecha();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBGananciaNetaPorFechaActionPerformed

    private void jBotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSiguienteActionPerformed
        AGInicio2 obj =new AGInicio2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBotonSiguienteActionPerformed

    private void jBGananciaPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGananciaPromedioActionPerformed
        AG1gananciaPromPFecha p= new AG1gananciaPromPFecha();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBGananciaPromedioActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        Login obj =new Login();
        obj.setVisible(true);
        dispose();
        try {
            MySQL.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Cli1menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jBComprasFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprasFechaActionPerformed
        AG6comprasPorFecha p= new AG6comprasPorFecha();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBComprasFechaActionPerformed

    private void jPropinasCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPropinasCamActionPerformed
        ASpropinaCamarero obj =new ASpropinaCamarero();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPropinasCamActionPerformed

    private void jCamMayorPropinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCamMayorPropinaActionPerformed
        AG8camareroMayorPropina obj =new AG8camareroMayorPropina();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jCamMayorPropinaActionPerformed

    private void jHistorialComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHistorialComprasActionPerformed
        AG5historialCompra p= new AG5historialCompra();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jHistorialComprasActionPerformed

    private void jChefMayorPropinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChefMayorPropinaActionPerformed
        AG7chefMayorPropina obj =new AG7chefMayorPropina();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jChefMayorPropinaActionPerformed

    private void jComprarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprarInsumoActionPerformed

        AG4comprarInsumo p= new AG4comprarInsumo();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jComprarInsumoActionPerformed

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
                new AGInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdminGral;
    private javax.swing.JLabel jAdminGral1;
    private javax.swing.JLabel jAdminGral2;
    private javax.swing.JLabel jAdminGral3;
    private javax.swing.JButton jBComprasFecha;
    private javax.swing.JButton jBGananciaNetaPorFecha;
    private javax.swing.JButton jBGananciaPorMetodo;
    private javax.swing.JButton jBGananciaPromedio;
    private javax.swing.JButton jBotonSiguiente;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JButton jCamMayorPropina;
    private javax.swing.JButton jChefMayorPropina;
    private javax.swing.JButton jComprarInsumo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JButton jHistorialCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPAdminGeneral;
    private javax.swing.JButton jPropinasCam;
    // End of variables declaration//GEN-END:variables
}
