package com.bank.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {

    @FXML
    private BorderPane bp;

    @FXML
    private Button btnConn;

    @FXML
    private TextField tfLogin;

    @FXML
    private PasswordField tfMdp;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Set a breakpoint here to check if the initialize method is called
        loadPage("login");
    }

    private void loadPage(String page){
        Parent root = null;

        try {
            // Set a breakpoint here to check the URL and root values
            URL url = new File("src/main/resources/com/bank/Views/"+page+".fxml").toURI().toURL();
            root = FXMLLoader.load(url);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set a breakpoint here to check the root value before setting it to the BorderPane
        bp.setCenter(root);
    }
}

