/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kpl15174
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class javaconnect {
    Connection conn;
    
    
    
    
   public static Connection ConnecrDb(){
    
        try {
           //Class.forName("org.derby");
           
           Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/LibraryNew","JOS","1234");
           return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
       
    }

}
