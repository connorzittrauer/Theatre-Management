package com.example.theatremanagement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sqlconnector.DBInitializer;

import java.io.IOException;
import java.sql.SQLException;

public class ApplicationRoot extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("CineDB");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws SQLException
    {
        DBInitializer initializer = new DBInitializer();
        initializer.Connect();
        launch();
    }
}