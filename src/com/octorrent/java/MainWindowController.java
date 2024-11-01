package com.octorrent.java;

import com.octorrent.java.handlers.Torrent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MainWindowController {

    @FXML
    private ScrollPane allTabLayout;

    @FXML
    public void initialize(){
        ListView<Node> listView = new ListView<>();
        listView.getItems().add(createRow(new Torrent("asd")));


        allTabLayout.setContent(listView);
    }

    private Node createRow(Torrent torrent){
        HBox hbox = new HBox();

        ImageView icon = new ImageView();
        hbox.getChildren().add(icon);

        VBox vbox = new VBox();

        Label title = new Label();
        title.setText(torrent.getTitle());
        vbox.getChildren().add(title);

        ProgressBar progress = new ProgressBar();
        progress.setProgress(0.5);
        vbox.getChildren().add(progress);

        Label status = new Label();
        status.setText("adasdasdsad");
        vbox.getChildren().add(status);

        Label description = new Label();
        description.setText("adasdasdsad");
        vbox.getChildren().add(description);

        hbox.getChildren().add(vbox);

        return hbox;
    }

    @FXML
    private void onOpenTorrentAction(){

    }

    @FXML
    private void onQuitAction(){
        System.exit(0);
    }
}
