/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JoshBatey
 */
public class Konexio 
{
   static Connection kon;
  public Konexio()
  {
   //    konexio();
  }
    public static Connection konexio()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/dbmarket";
            String user="root";
            String pass="";
           // String pass="";
              kon =DriverManager.getConnection(url,user,pass);
              System.out.println("You\'re Connected!!!");
            //JOptionPane.showMessageDialog(null, "You\'re Connected!!!");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        } 
        catch (ClassNotFoundException ex) 
        { 
            Logger.getLogger(Konexio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kon;
    }
    
}

