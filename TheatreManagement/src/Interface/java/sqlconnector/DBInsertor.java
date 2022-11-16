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

    public void insert_records() throws SQLException
    {
           dbconn = initializer.Connect();
           insertData();
    }
    

    
    public void insertData ()  throws SQLException
    {

//        Scanner input = new Scanner(System.in);
//        int empssn,superssn;
//        double empsalary;
//        String empfname, emplname;
//
//        //input data for insertion
//        System.out.print("Enter Employee SSN:");
//        empssn= input.nextInt();
//        System.out.print("Enter Employee's Firstname:");
//        empfname= input.next();
//        System.out.print("Enter Employee's Lastname:");
//        emplname= input.next();
//        System.out.print("Enter Employee's Supervisor's SSN:");
//        superssn= input.nextInt();
//        System.out.print("Enter Employee's Salary:");
//        empsalary= input.nextDouble();

//        try
//        {
//        //insert data into a table of a database/schema
//        Connection conn= dbconn;
//        String insertq= "insert into employee(employee_ssn,employee_firstname,employee_lastname,employee_salary,supervisor_ssn) values ('"+empssn+ "','"+empfname+"','"+emplname+ "','"+empsalary+ "', '"+superssn+"')";
//        PreparedStatement insertst = conn.prepareStatement(insertq);
//        insertst.executeUpdate();
//        }
//         catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        finally
//        {
//            System.out.println("The record has been inserted!");
//        }
//
        
    }
}