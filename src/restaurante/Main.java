/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import Interfaz.Login;
import Interfaz.Cli1menu;

/**
 *
 * @author dcast
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static MySQL db = new MySQL();
     public static Integer sedeid=1;
     public static String sesion;
        
    public static void main(String[] args) {
       Login p= new Login();
        p.setVisible(true);
    }
    
}
