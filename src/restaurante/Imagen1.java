/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author dcast
 */
public class Imagen1 extends javax.swing.JPanel {
        public Imagen1(int x, int y) {
            this.setSize(x, y); //se selecciona el tamaño del panel
        }

        public void paint(Graphics grafico) {
            Dimension height = getSize();         
    
            ImageIcon Img = 
        new ImageIcon(getClass().getResource("/Imagenes/FondoMaderaBlanca.jpg")); 
            
            grafico.drawImage(
                    Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }
