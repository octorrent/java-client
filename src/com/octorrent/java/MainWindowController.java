package com.octorrent.java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;

public class MainWindowController {

    @FXML
    private AnchorPane all_tab_layout;

    @FXML
    public void initialize(){
        // Create the ListView dynamically
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Item 1", "Item 2", "Item 3");

        // Customize the ListView if needed
        listView.setPrefHeight(200);
        listView.setPrefWidth(150);

        // Add the ListView to the VBox
        all_tab_layout.getChildren().add(listView);
    }

    @FXML
    private void onOpenTorrentAction(){

    }

    @FXML
    private void onQuitAction(){
        System.exit(0);
    }
}
