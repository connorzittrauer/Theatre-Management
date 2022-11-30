package com.example.theatremanagement.controllers;

import com.example.theatremanagement.ApplicationRoot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;
import sqlconnector.DBInitializer;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FilmsController implements Initializable
{
    private Stage stage;
    @FXML
    private AnchorPane root;
    DBInitializer initializer = new DBInitializer();
    @FXML
    private ListView<String> filmListView;

    @FXML
    protected void navigateHome(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    public void deleteFilm() throws SQLException {
        String FilmID = null;
        //get selected Item
        String selectedItem = filmListView.getSelectionModel().getSelectedItem();
        int selectedIndex = filmListView.getSelectionModel().getSelectedIndex();

        //Sanitize string to retrieve FilmID
        FilmID = selectedItem.substring(0, 6);

        try
        {
           //delete film from database by FilmID
            Connection conn= initializer.Connect();
            String deleteq= "delete from film where FilmID = '"+FilmID+"'";
            PreparedStatement deletest = conn.prepareStatement(deleteq);
            deletest.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            //Remove deleted film from listview
            filmListView.getItems().remove(selectedIndex);
            System.out.println("The record has been deleted!");
        }
    }

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        ArrayList<String> film_rows;
        try
        {
            initializer.Connect();
            film_rows = initializer.RetrieveFilms();

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        filmListView.getItems().addAll(film_rows);
    }

}

