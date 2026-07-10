/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package homeworkfxfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtname;
    @FXML
    private Label output;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void sumbit(ActionEvent event) {
        String name = txtname.getText();

    output.setText("Hello, " + name);
    }

    
}
