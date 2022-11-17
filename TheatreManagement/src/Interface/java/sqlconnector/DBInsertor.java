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
    DBInitializer initializer = new DBInitializer();
    Connection dbconn;

    public void insertRecords() throws SQLException
    {
           dbconn = initializer.Connect();
           insertData();
            //some change
    }
    

    
    public void insertData ()  throws SQLException
    {

        Scanner input = new Scanner(System.in);
        int HallNO,MaxSeats, IMax;
        String Title;


        //input data for insertion
        System.out.print("TicketNO:");
        HallNO= input.nextInt();
        System.out.print("HallNO:");
        MaxSeats= input.nextInt();
        System.out.print("EmployeeID:");
        IMax= input.nextInt();


        try
        {
        //insert data into a table of a database/schema
        Connection conn= dbconn;
//        String insertq= "insert into ticket(TicketNO,HallNO,EmployeeID,Title, SaleDate, SeatNO, Price, Discount) values " +
//                "('"+TicketNO+"',' "+HallNO+" ',' "+EmployeeID+" ',' "+Title+" ',' "+SaleDate+" ',' "+SeatNO+" ',' )";

//            String insertq= "insert into theatre_hall(HallNO,MaxSeats,IMax) values " +
//                    "('"+HallNO+" ',' "+MaxSeats+"' ',' "+IMax+"')";
//

                     String insertq= "insert into theatre_hall(HallNO,MaxSeats,IMax) values " +
                 "('"+HallNO+ "','"+MaxSeats+"','"+IMax+"')";
        PreparedStatement insertst = conn.prepareStatement(insertq);



//         String insertq= "insert into theatre_hall(HallNO,MaxSeats,IMax) values " +
//                 "('"+HallNO+ "','"+MaxSeats+"','"+IMax+"')";
//        PreparedStatement insertst = conn.prepareStatement(insertq);


        insertst.executeUpdate();
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