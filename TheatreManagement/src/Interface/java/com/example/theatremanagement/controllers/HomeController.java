package com.example.theatremanagement.controllers;

import com.example.theatremanagement.ApplicationRoot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController
{
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void navigatePOS(ActionEvent event) throws IOException
    {

        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("pos-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    protected void navigateFilms(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("films-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void navigateInvoices(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("invoices-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}