
package Interfaz;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import restaurante.*;

public class comprasPorFecha extends javax.swing.JFrame {
    

    
    public comprasPorFecha() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Compras por fecha");
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/BotonCerrarAzul.png"));
        Icon icono= new ImageIcon(imagen.getImage().getScaledInstance(30,30,20));
        jBotonVolver.setIcon(icono);
    }
    
    public Integer llamar(String date){
        int numero = 0;
        try {
         
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(comprasPorFecha.class.getName()).log(Level.SEVERE, null, ex);
            }
       
            PreparedStatement st = MySQL.conn.prepareStatement("select contarCompraPorFecha("+date+")");
            ResultSet resultado = st.executeQuery();
            resultado.next();
            numero = resultado.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(comprasPorFecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        inputFecha = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 400));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel2.setText("Numero de compras de insumos por fecha");

        fecha.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        fecha.setText("Fecha (YYYY-MM-DD):");

        inputFecha.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        inputFecha.setText("Inserte fecha");
        inputFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFechaActionPerformed(evt);
            }
        });

        boton.setBackground(new java.awt.Color(0, 102, 102));
        boton.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setText("Consultar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        resultado.setText("#");

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel4.setText("Resultado:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addComponent(boton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha)
                    .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFechaActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        String fecha = "'"+inputFecha.getText()+"'";
        resultado.setText(llamar(fecha).toString());
    }//GEN-LAST:event_botonActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        AdGeneralInicio obj =new AdGeneralInicio();
        obj.setVisible(true);
        dispose();
        try {
            MySQL.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                new comprasPorFecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField inputFecha;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
