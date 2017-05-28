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

public class consultarCantidad extends javax.swing.JFrame {

    public consultarCantidad() {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonVolver2.png"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(20, 20, 10));
        jBotonVolver.setIcon(icono);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        sedId = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        jMesa = new javax.swing.JLabel();
        jBotonVolver = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTable();
        jMesa1 = new javax.swing.JLabel();
        jMesa2 = new javax.swing.JLabel();
        insNombre = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        sedId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedIdActionPerformed(evt);
            }
        });

        consultar.setBackground(new java.awt.Color(0, 153, 153));
        consultar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        consultar.setForeground(new java.awt.Color(255, 255, 255));
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jMesa.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jMesa.setForeground(new java.awt.Color(255, 255, 255));
        jMesa.setText("Consultar cantidad de insumo");

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

        resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(resultado);

        jMesa1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jMesa1.setForeground(new java.awt.Color(255, 255, 255));
        jMesa1.setText("Id sede:");

        jMesa2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jMesa2.setForeground(new java.awt.Color(255, 255, 255));
        jMesa2.setText("Nombre insumo:");

        insNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jMesa1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sedId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jMesa2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(45, 45, 45)
                        .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jMesa)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jMesa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMesa1)
                            .addComponent(sedId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMesa2)
                            .addComponent(insNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sedIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedIdActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed

        try {
            // Creamos la conexion  
            CallableStatement cStmt;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conec = DriverManager.getConnection("jdbc:mysql://localhost/entregafinalbd", "root", "ragnarok3798");
            cStmt = conec.prepareCall("{call proc_consultar_cantidad(?,?)}");
            conec.setAutoCommit(true);

            cStmt.setInt(1, Integer.parseInt(sedId.getText()));
            cStmt.setString(2, insNombre.getText());
            cStmt.execute();
            ResultSet rstb = cStmt.getResultSet();
            ResultSetMetaData rsmd = rstb.getMetaData();
            int col = rsmd.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsmd.getColumnLabel(i));
            }
            while (rstb.next()) {
                String fila[] = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rstb.getString(j + 1);
                }
                modelo.addRow(fila);
            }
            resultado.setModel(modelo);
            cStmt.close();
            conec.close();
        } catch (Exception e) {
            Logger.getLogger(consultarCantidad.class.getName()).log(Level.SEVERE, null, e);

        }

    }//GEN-LAST:event_consultarActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        CamInicio obj = new CamInicio();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void insNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insNombreActionPerformed

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
                new consultarCantidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JTextField insNombre;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jMesa;
    private javax.swing.JLabel jMesa1;
    private javax.swing.JLabel jMesa2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable resultado;
    private javax.swing.JTextField sedId;
    // End of variables declaration//GEN-END:variables
}
