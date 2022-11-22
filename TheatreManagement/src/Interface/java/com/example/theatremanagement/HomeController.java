package com.example.theatremanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController
{
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void navigateTicket(ActionEvent event) throws IOException
    {

        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("ticket-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }
}