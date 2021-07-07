
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vignesh
 */
public class ConnectionSQL {
    java.sql.Connection con;
    ResultSet rs;
    Statement stmt;

    ConnectionSQL(){
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\vignesh\\Documents\\Database\\Register");
            stmt= con.createStatement();
            System.out.println("Success");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Problem with connection of database");
        }
    }  
    
}
