package com.example.theatremanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import sqlconnector.DBInitializer;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TicketController
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    DBInitializer initializer = new DBInitializer();
    Connection dbconn;
    @FXML private TextField TicketNO;
    @FXML private TextField HallNO;
    @FXML private TextField EmployeeID;
    @FXML private TextField Title;
    @FXML private TextField SaleDate;
    @FXML private TextField SeatNO;
    @FXML private TextField Price;
    @FXML private RadioButton DiscountButton;

    public void navigateHome(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("home-view.fxml"));

    }

    @FXML
    public void printField(ActionEvent event)
    {
        System.out.println(TicketNO.getText());
        TicketNO.clear();
    }

    public void insertTicket() throws SQLException {

        int Discount = 0;
        if (!DiscountButton.isSelected()) {Discount = 1;}

        System.out.println(DiscountButton.isSelected());
        System.out.println(Discount);

        dbconn = initializer.Connect();



        try
        {

        Connection conn= dbconn;
        String insertq= "insert into ticket(TicketNO,HallNO,EmployeeID,Title,SaleDate,SeatNO,Price,Discount) values (' " +
               ""+TicketNO.getText()+" ',' " +
               ""+HallNO.getText()+" ',' " +
               ""+EmployeeID.getText()+" ',' " +
               ""+Title.getText()+" ',' " +
               ""+SaleDate.getText()+" ',' " +
               ""+SeatNO.getText()+" ',' " +
               ""+Price.getText()+" ',' " +
               ""+Discount+" ')";

        PreparedStatement insertst = conn.prepareStatement(insertq);
        insertst.executeUpdate();


        }


        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("The record has been inserted!");
        }

    }

}
