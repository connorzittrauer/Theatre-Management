/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sqlconnector;
import java.sql.*;
/**
 *
 * @author C15003049
 */
public class Driver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        DBInitializer con = new DBInitializer();
//        DBInsertor ins = new DBInsertor();


        // Pass through name of table 
        con.Connect();

        con.RetrieveRecords("customer");

        
    }
    
}
