/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlconnector;
import java.sql.*;

public class DBInitializer
{
    Connection dbconn = null;
    public Connection Connect() throws SQLException
    {
        final String username = "root";
        final String password = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/CineDB";

        try
        {
            //Step 1: Connection to a database
            dbconn = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection was successful!");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return dbconn;



    }

    public void RetrieveRecords(String table) throws SQLException {

        Statement statement = null;
        ResultSet rs = null;

        //Step 2: Create a statement
        statement = dbconn.createStatement();

        //Step 3: Run a SQL query
        rs = statement.executeQuery("select * from " + table);

        //Step 4: Output the retrieved data /result set
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();

        while (rs.next()) {
            for(int i = 1; i < columnsNumber; i++)
                System.out.print(rs.getString(i) + " ");
            System.out.println();
            }
          }

    }




