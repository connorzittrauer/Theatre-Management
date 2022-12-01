package com.example.theatremanagement.controllers;
import com.example.theatremanagement.ApplicationRoot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sqlconnector.DBUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class InvoicesController implements Initializable
{
    private Stage stage;
    @FXML
    private AnchorPane root;
    DBUtils initializer = new DBUtils();
    @FXML
    private ListView<String> ticketListView;

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        ArrayList<String> ticket_rows;
        try
        {
            initializer.Connect();
            ticket_rows = initializer.RetrieveTickets();

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        ticketListView.getItems().addAll(ticket_rows);
    }

    @FXML
    protected void navigateHome(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }


}
