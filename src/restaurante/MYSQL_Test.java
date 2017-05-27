/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author dcast
 */
public class MYSQL_Test {
     public static void main(String[] args) throws Exception {
        MySQL db = new MySQL();
        db.MySQLConnection("root", "1234", "");

    }
}
