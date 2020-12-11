package com.mycompany.calculator;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private TextField resultdisplay;
    
    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button equal;

    @FXML
    private Button ac;

    @FXML
    private Button div;

    @FXML
    private Button mul;

    @FXML
    private Button minus;

    @FXML
    private Button plus;

    double result = 0;
    double input1;
    double input2;
    int ps;
    int point;
    boolean restart = true;
    DecimalFormat td = new DecimalFormat("#.00");
    
    public double calculate (double input1, double input2, int ps) {
        switch(ps) {
                case 1 : return input1+input2;
                
                case 2 : return input1-input2;
                        
                case 3 : return input1*input2;
                   
                case 4 : return input1/input2;
                
                default: return 0;
            }
    }
    
    @FXML
    void Calculation(ActionEvent event) {

        if(event.getSource() == one) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("1");
        }
        else if(event.getSource() == two) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("2");
        }
        else if(event.getSource() == three) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("3");
        }
        else if(event.getSource() == four) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("4");
        }
        else if(event.getSource() == five) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("5");
        }
        else if(event.getSource() == six) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("6");
        }
        else if(event.getSource() == seven) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("7");
        }
        else if(event.getSource() == eight) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("8");
        }
        else if(event.getSource() == nine) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("9");
        }
        else if(event.getSource() == zero) {
            if(restart || ps != 0) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText("0");
        }
        else if(event.getSource() == dot &&  point == 0) {
            if(restart) {
                resultdisplay.setText("");
            }
            resultdisplay.appendText(".");
            point = 1;
        }
        else if(event.getSource() == ac) {
            resultdisplay.setText("");
            input1 = 0;
            input2 = 0;
            ps = 0;
            point = 0;
            restart = true;
        }
        else if(event.getSource() == plus) {
            if(restart) {
                input1 = Double.parseDouble(resultdisplay.getText());
            }
            else {
                input2 = Double.parseDouble(resultdisplay.getText());
                result = calculate(input1, input2, ps);
                resultdisplay.setText(String.valueOf(td.format(result)));
                input1 = result;
            }
            ps = 1;
            point = 0;
            restart = false;
        }
        else if(event.getSource() == minus) {
            if(restart) {
                input1 = Double.parseDouble(resultdisplay.getText());
            }
            else {
                input2 = Double.parseDouble(resultdisplay.getText());
                result = calculate(input1, input2, ps);
                resultdisplay.setText(String.valueOf(td.format(result)));
                input1 = result;
            }
            
            ps = 2;
            point = 0;
            restart = false;
        }
        else if(event.getSource() == mul) {
            if(restart) {
                input1 = Double.parseDouble(resultdisplay.getText());
            }
            else {
                input2 = Double.parseDouble(resultdisplay.getText());
                result = calculate(input1, input2, ps);
                resultdisplay.setText(String.valueOf(td.format(result)));
                input1 = result;
            }
            
            ps = 3;
            point = 0;
            restart = false;
        }
        else if(event.getSource() == div) {
            if(restart) {
                input1 = Double.parseDouble(resultdisplay.getText());
            }
            else {
                input2 = Double.parseDouble(resultdisplay.getText());
                result = calculate(input1, input2, ps);
                resultdisplay.setText(String.valueOf(td.format(result)));
                input1 = result;
            }
            
            ps = 4;
            point = 0;
            restart = false;
        }
        else if(event.getSource() == equal && ps > 0) {
            input2 = Double.parseDouble(resultdisplay.getText());
            
            resultdisplay.setText(String.valueOf(td.format(calculate(input1, input2, ps))));
            
            ps = 0;
            restart = true;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
