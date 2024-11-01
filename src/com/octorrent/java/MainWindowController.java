package com.octorrent.java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MainWindowController {

    @FXML
    private ScrollPane allTabLayout;

    @FXML
    public void initialize(){
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 1",
                "Item 2",
                "Item 3");

        allTabLayout.setContent(listView);
    }

    @FXML
    private void onOpenTorrentAction(){

    }

    @FXML
    private void onQuitAction(){
        System.exit(0);
    }
}
