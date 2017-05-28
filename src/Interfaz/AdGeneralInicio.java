
package Interfaz;
import java.awt.BorderLayout;
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

public class AdGeneralInicio extends javax.swing.JFrame {


    public static Integer idCam ;
    
    public AdGeneralInicio() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Inicio Camarero");
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonCerrarAzul.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(30,30,20));
        jBotonVolver.setIcon(icono);
        
        ImageIcon fondo = new ImageIcon(getClass().getResource("/Imagenes/FondoMaderaBlanca.png"));
        Icon fondo2= new ImageIcon(fondo.getImage().getScaledInstance(740, 400, 20));
        

        
        
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//setBounds(100, 100, 450, 300);
//PanelImagen p = new PanelImagen();
//p.setBorder(new EmptyBorder(5, 5, 5, 5));
//p.setLayout(new BorderLayout(0, 0));
//setContentPane(p);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPAdminGeneral = new javax.swing.JPanel();
        jAdminGral = new javax.swing.JLabel();
        jBComprasFecha = new javax.swing.JButton();
        jBotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPAdminGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jPAdminGeneral.setForeground(new java.awt.Color(255, 255, 255));
        jPAdminGeneral.setPreferredSize(new java.awt.Dimension(720, 400));

        jAdminGral.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
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
        jLabel1.setText("Volver");

        javax.swing.GroupLayout jPAdminGeneralLayout = new javax.swing.GroupLayout(jPAdminGeneral);
        jPAdminGeneral.setLayout(jPAdminGeneralLayout);
        jPAdminGeneralLayout.setHorizontalGroup(
            jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jBComprasFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPAdminGeneralLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPAdminGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(162, 162, 162)
                        .addComponent(jAdminGral)))
                .addContainerGap(197, Short.MAX_VALUE))
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
                .addGap(41, 41, 41)
                .addComponent(jBComprasFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPAdminGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jPAdminGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jBComprasFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprasFechaActionPerformed
        comprasPorFecha p= new comprasPorFecha();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBComprasFechaActionPerformed

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
                new AdGeneralInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAdminGral;
    private javax.swing.JButton jBComprasFecha;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPAdminGeneral;
    // End of variables declaration//GEN-END:variables
}
