package com.example.theatremanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;

public class TicketController
{
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML private TextField TicketNO;

    public void navigateHome(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("home-view.fxml"));

    }

    @FXML
    public void printField(ActionEvent event)
    {
        System.out.println(TicketNO.getText());
    }



}
