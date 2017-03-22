/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author acer
 */
public class FXMLDocumentController implements Initializable {
    double number1;
    double number2;
    char operator;

    @FXML
    private TextField displayField;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void handleTwoAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "2";
        displayField.setText(newText);
    }

    @FXML
    private void handleOneAction(ActionEvent event) {
         String oldText = displayField.getText();
        String newText = oldText + "1"; 
        displayField.setText(newText);
    }

    @FXML
    private void handleAddiitionAction(ActionEvent event) {
        String firstNumber = displayField.getText();
        number1 = Double.parseDouble(firstNumber);
        displayField.clear();
        operator = '+';
    }

    @FXML
    private void handleSubstractionAction(ActionEvent event) {
        String firstNumber = displayField.getText();
        number1 = Double.parseDouble(firstNumber);
        displayField.clear();
        operator = '-';
    }

    @FXML
    private void handleMultiplyAction(ActionEvent event) {
        String firstNumber = displayField.getText();
        number1 = Double.parseDouble(firstNumber);
        displayField.clear();
        operator = '*';
    }

    @FXML
    private void handleDivisionAction(ActionEvent event) {
        String firstNumber = displayField.getText();
        number1 = Double.parseDouble(firstNumber);
        displayField.clear();
        operator = '/';
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
         String secondNumber = displayField.getText();
        number2 = Double.parseDouble(secondNumber);
        double result = 0;
        // write if/else to make sure we are using the right operator
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                break;
        }
        displayField.setText("" + result);
    }

    @FXML
    private void handleThreeAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "3";
        displayField.setText(newText);
    }

    @FXML
    private void handleSixAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "6";
        displayField.setText(newText);
    }

    @FXML
    private void handleNineAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "9";
        displayField.setText(newText);
    }

    @FXML
    private void handleDotAction(ActionEvent event) {
    }

    @FXML
    private void handleFiveAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "5";
        displayField.setText(newText);
    }

    @FXML
    private void handleZeroAction(ActionEvent event) {
         String oldText = displayField.getText();
        //if (oldText.length() != 1 || oldText.charAt(0) != '0') {
        if (!oldText.equals("0")) {
            String newText = oldText + "0";
            displayField.setText(newText);
        }
    }

    @FXML
    private void handleFourAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "4";
        displayField.setText(newText);
    }

    @FXML
    private void handleAllClearAction(ActionEvent event) {
        displayField.setText("");
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        String oldText = displayField.getText();
        
        String newText = oldText.substring(0, oldText.length() - 1);
        displayField.setText(newText);
    }

    @FXML
    private void handleEightAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "8";
        displayField.setText(newText);
    }

    @FXML
    private void handleSevenAction(ActionEvent event) {
        String oldText = displayField.getText();
        String newText = oldText + "7";
        displayField.setText(newText);
    }

   
}
