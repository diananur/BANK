/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLDocumentController implements Initializable {
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Label label;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
     @FXML
    private JFXPasswordField editpin;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan5(ActionEvent event) {
        pin +="5";
        editpin.setText(pin);
    }

    @FXML
    private void tekan6(ActionEvent event) {
        pin +="6";
        editpin.setText(pin);
    }

    @FXML
    private void tekan1(ActionEvent event) {
        pin +="1";
        editpin.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
        pin +="2";
        editpin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
        pin +="3";
        editpin.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        pin +="4";
        editpin.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
        pin +="7";
        editpin.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
        pin +="8";
        editpin.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
        pin +="9";
        editpin.setText(pin);
    }

    @FXML
    private void tekanC(ActionEvent event) {
        pin ="";
        editpin.setText(pin);
    }

    @FXML
    private void tekan0(ActionEvent event) {
        pin +="0";
        editpin.setText(pin);
    }

    @FXML
    private void tekanOK(ActionEvent event) {
       if(pin.equals(PIN))
           {
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("penarikan.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 452);
            
             // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Moklet Bank");
            stage.show();
            System.out.println("LOL");
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
            System.out.println("ERR");
        }
        }else{
           kesempatan -= 1;
           JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa"+kesempatan + "kesempatan lagi!");
           editpin.setText("");
           pin = "";
           if (kesempatan == 0){
               System.exit(0);
            }
            }
    }
    
    }
    

