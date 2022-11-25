package com.example.theatremanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sqlconnector.DBInitializer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowtimesController
{
    private Stage stage;
    @FXML
    private AnchorPane root;

    @FXML
    protected void navigateHome(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationRoot.class.getResource("home-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    public void makeLabel() throws SQLException
    {
        DBInitializer initializer = new DBInitializer();
        initializer.Connect();
        ArrayList<String> showtime_rows;
        ArrayList<Label> showtime_labels = new ArrayList<>();
        showtime_rows = initializer.RetrieveShowtimes("showtimes");


//         Label test = new Label("This is a label");

        //Makes arraylist of labels
         for (int i=0; i < showtime_rows.size(); i++) {
             showtime_labels.add(new Label(showtime_rows.get(i)));

         }

        for (int i = 0; i <showtime_labels.size(); i++) {
            showtime_labels.get(i).setLayoutY(i * 15);
        }
        showtime_labels.forEach((x) -> x.setLayoutX(225));
        showtime_labels.forEach((x) -> x.setFont(Font.font("Barlow Condensed", FontPosture.REGULAR, 18)));


         //Add
         for (int i=0; i < showtime_labels.size(); i++) {
             root.getChildren().add(showtime_labels.get(i));
         }





//        test.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
//        test.setLayoutX(300);

        //root.getChildren().add(test);

    }


}
