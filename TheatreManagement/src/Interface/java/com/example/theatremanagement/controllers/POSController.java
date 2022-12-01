package com.example.theatremanagement.controllers;
import com.example.theatremanagement.ApplicationRoot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sqlconnector.DBUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class POSController implements Initializable
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

    public void initialize(URL url, ResourceBundle resourceBundle) {
        SaleDate.setText(java.time.LocalDate.now().toString());
    }
    public void navigateHome(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void insertTicket() throws SQLException {

        DBUtils initializer = new DBUtils();
        Connection dbconn;
        dbconn = initializer.Connect();

        int Discount = 0;

        //this converts the boolean value to a binary value
        if (DiscountButton.isSelected()) {Discount = 1;}

        //this applies a discount to the ticket
        if (DiscountButton.isSelected())
        {
            //get the value from the text field and parse to double
            double ticketPrice = Double.parseDouble(Price.getText());

            //apply 15% discount
            double discountedPrice = ticketPrice - (ticketPrice * .15);

            //set text field
            Price.setText(String.valueOf(discountedPrice));
        }

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
            //clear fields and reset form
            TicketNO.clear();
            HallNO.clear();
            Title.clear();
            SeatNO.clear();
            Price.clear();
            DiscountButton.disarm();

            System.out.println("The record has been inserted!");

        }

    }

}
