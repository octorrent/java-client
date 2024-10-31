package com.octorrent.java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class MainWindowController {

    @FXML
    private Label label;  // Connects with the Label in the FXML file

    @FXML
    private void handleButtonClick(){
        System.out.println("Clicked");
    }

    @FXML
    private void onOpenTorrentAction(){

    }
}
