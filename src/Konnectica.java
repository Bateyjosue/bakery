
import beta.Konexio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Batey
 */
public class Konnectica {
    static Connection kon;
    public static Connection konexio()
    {
        try
        {
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            String url = "jdbc:microsoft:sqlserver://HOST:1433;DatabaseName=dbmarket;Integrated Security = True";
            String user="";
            String pass="";
              kon =DriverManager.getConnection(url,user,pass);
              System.out.println("You\'re Connected!!!");
            //JOptionPane.showMessageDialog(null, "You\'re Connected!!!");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Konexio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kon;
    }
}

  