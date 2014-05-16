/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hacker;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import sun.misc.JavaxSecurityAuthKerberosAccess;

/**
 * FXML Controller class
 *
 * @author 谢金光
 */
public class ConfigStageController implements Initializable {
    @FXML
    private TextField codeField;
    @FXML
    private CheckBox time;
    @FXML
    private CheckBox area_grade;
    @FXML
    private CheckBox bd;
    @FXML
    private CheckBox bdAll;
    @FXML
    private TextField ipAddress;
    @FXML
    private TextField port;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendcfg(ActionEvent event) {
        try {
            this.bd.isDisable();
            Socket soc = new java.net.Socket(InetAddress.getByName(this.ipAddress.getText().trim()), Integer.valueOf(this.port.getText().trim()));
        } catch (UnknownHostException ex) {
            Logger.getLogger(ConfigStageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfigStageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clearcfg(ActionEvent event) {
    }
    
}
