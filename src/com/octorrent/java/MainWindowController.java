package com.octorrent.java;

import com.octorrent.java.handlers.Torrent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

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
        hbox.getStyleClass().add("hbox");

        ImageView icon = new ImageView();
        icon.setFitWidth(50);
        icon.setFitHeight(50);
        //hbox.getChildren().add(icon);

        VBox vbox = new VBox();
        vbox.getStyleClass().add("vbox");
        vbox.setFillWidth(true);
        HBox.setHgrow(vbox, Priority.ALWAYS);

        Label title = new Label();
        title.setMaxWidth(Double.MAX_VALUE);
        title.setText(torrent.getTitle());

        ProgressBar progress = new ProgressBar();
        progress.setMaxWidth(Double.MAX_VALUE);
        progress.setProgress(0.5);

        Label status = new Label();
        status.setMaxWidth(Double.MAX_VALUE);
        status.setText("adasdasdsad");

        Label description = new Label();
        description.setMaxWidth(Double.MAX_VALUE);
        description.setText("adasdasdsad");

        vbox.getChildren().addAll(title, progress, status, description);
        hbox.getChildren().addAll(icon, vbox);

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
