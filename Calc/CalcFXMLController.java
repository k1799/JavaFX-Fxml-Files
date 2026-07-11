
package Calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class CalcFXMLController implements Initializable {

    @FXML
    private TextField txtFirst;
    @FXML
    private TextField txtSecond;
    @FXML
    private ComboBox<String> cmbOperation;
    @FXML
    private Label output;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbOperation.getItems().addAll("Addition","Subration","Multiplication","Division","Modulus");
    }    

    @FXML
    private void calculate(ActionEvent event) {
        int a = Integer.parseInt(txtFirst.getText());
        int b = Integer.parseInt(txtSecond.getText());
        
        String op = cmbOperation.getValue();
        
        int result = 0;
        
        if(op.equals("Addition")){
        result = a+b;
        }
        
        else if(op.equals("Subration")){
        result = a-b;
        }
        
        else if(op.equals("Multiplication")){
        result = a*b;
        }
        
        else if(op.equals("Division")){
        result = a/b;
        }
        
        else if(op.equals("Modulus")){
        result = a%b;
        }
        
        output.setText("Result : " + result);
    }

    @FXML
    private void reset(ActionEvent event) {
        txtFirst.clear();
        txtSecond.clear();
        
        cmbOperation.getSelectionModel().clearSelection();
        
       output.setText("");
    }

    
}
