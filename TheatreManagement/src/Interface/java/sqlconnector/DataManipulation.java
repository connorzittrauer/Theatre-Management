/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlconnector;
import java.sql.*;
import java.util.*;

//Driver Class
public class DataManipulation{

    public void Manipulate() throws SQLException {
    Manipulation d = new Manipulation();
    d.getDBConnection();
    d.UpdateData();
    d.DeleteData();
}

}
//Service Class
class Manipulation
{
   public Connection getDBConnection ()  throws SQLException
    {
    String connectionurl= "jdbc:mysql://localhost:3306/company";   
    String username ="root";
    String  password="root";
    
    Connection dbconn;
 
    
    try
    {
        //connection to a database
        dbconn = DriverManager.getConnection(connectionurl, username, password);

        System.out.println("Database connection was successful!");
        
        return dbconn;

    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
        
    return null;
    }
    
    
    public  void UpdateData ()  throws SQLException
    {  
        Scanner input = new Scanner(System.in); 
        int empssn,departmentid;
        
       
        //input data for update
        System.out.print("Enter Employee ID:");
        empssn= input.nextInt();
        System.out.print("Enter Employee's Department Number to Update:");
        departmentid= input.nextInt();
        try
        {
        //update data in a table of a database/schema
        Connection conn=getDBConnection();
        String updateq= "update employee set department_number = '"+departmentid+"' where employee_ssn = '"+empssn+"' " ;
        PreparedStatement updatest = conn.prepareStatement(updateq);
        updatest.executeUpdate();
        }
         catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("The record has been updated!");
        }
       
        
    }
    
    public  void DeleteData ()  throws SQLException
    {  
        Scanner input = new Scanner(System.in); 
        int departmentid;
        
       
        //input data for deletion
        System.out.print("Enter the Department Number to Delete Its Related Record:");
        departmentid= input.nextInt();
        try
        {
        //delete data from a table of a database/schema
        Connection conn=getDBConnection();
        String deleteq= "delete from department where department_number = '"+departmentid+"'";
        PreparedStatement deletest = conn.prepareStatement(deleteq);
        deletest.executeUpdate();
        }
         catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("The record has been deleted!");
        }
       
        
    }
}