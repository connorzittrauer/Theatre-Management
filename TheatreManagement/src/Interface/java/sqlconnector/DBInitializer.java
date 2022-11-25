/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlconnector;
import java.sql.*;
import java.util.ArrayList;

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

        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return dbconn;


    }

    public ArrayList<String> RetrieveFilms(String table) throws SQLException
    {

        Statement statement = null;
        ResultSet rs = null;
        ArrayList<String> rows = new ArrayList<>();
        //Step 2: Create a statement
        statement = dbconn.createStatement();

        //Step 3: Run a SQL query
        //rs = statement.executeQuery("select * from " + table);
        rs = statement.executeQuery("SELECT CONCAT(filmid, ' ' ,title, ' ', rating, ' ', runtime) AS 'Rows' from film");

        //Step 4: Output the retrieved data /result set
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        System.out.println(columnsNumber);

        while (rs.next())
        {
            for (int i = 1; i <= columnsNumber; i++)
            {
//                System.out.print(rs.getString(i));
                rows.add(rs.getString(i));

            }


//        while (rs.next())
//        {
//            for (int i = 1; i <= columnsNumber; i++)
//                System.out.print(rs.getString(i));
//            System.out.println();
//        }

//        while (rs.next()) {
//            for(int i = 1; i <= columnsNumber; i++)
//                rows.add((rs.getString(i)));
//        }
//            return rows;
//        }



        }
        return rows;
    }
}


