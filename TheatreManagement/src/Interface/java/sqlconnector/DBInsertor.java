/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlconnector;

import java.sql.*;
import java.util.*;

/**
 *
 * @author talam
 */
public class DBInsertor {

    Connection dbconn;
    DBInitializer initializer = new DBInitializer();
    public void insertRecords() throws SQLException
    {
           dbconn = initializer.Connect();
           insertData();
            //some change
    }
    

    
    public void insertData ()  throws SQLException
    {

        Scanner input = new Scanner(System.in);
        int HallNO=12,MaxSeats=400, IMax=0;
        String Title;


        //input data for insertion
//        System.out.print("TicketNO:");
//        HallNO= input.nextInt();
//        System.out.print("HallNO:");
//        MaxSeats= input.nextInt();
//        System.out.print("EmployeeID:");
//        IMax= input.nextInt();
//        ArrayList<Object> rows = new ArrayList<>();

        try
        {

            //THIS BLOCK WORKS
//        Connection conn= dbconn;
//        String insertq= "insert into theatre_hall(HallNO,MaxSeats,IMAX) values (' " +
//               ""+HallNO+" ',' " +
//               ""+MaxSeats+" ',' " +
//               ""+IMax+" ')";
//        PreparedStatement insertst = conn.prepareStatement(insertq);
//        insertst.executeUpdate();





        }
         catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("The record has been inserted!");
        }
//
        
    }
}