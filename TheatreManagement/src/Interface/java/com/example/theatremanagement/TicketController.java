package com.example.theatremanagement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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
import java.sql.SQLOutput;

public class TicketController
{
    private Stage stage;
    private Scene scene;
    private Parent root;

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
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void insertTicket() throws SQLException {

        DBInitializer initializer = new DBInitializer();
        Connection dbconn;
        dbconn = initializer.Connect();

        int Discount = 0;
        if (DiscountButton.isSelected()) {Discount = 1;}


        try
        {

        Connection conn= dbconn;
        String insertq= "insert into ticket(TicketNO,HallNO,EmployeeID,Title,SaleDate,SeatNO,Price,Discount) " +
               "values ('" +
               ""+TicketNO.getText()+" ',' " +
               ""+HallNO.getText()+" ',' " +
               ""+EmployeeID.getText()+" ',' " +
               ""+Title.getText()+" ',' " +
               ""+SaleDate.getText()+" ','" +
               ""+SeatNO.getText()+" ',' " +
               ""+Price.getText()+" ',' " +
               ""+Discount+"')";

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
