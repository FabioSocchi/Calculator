/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Fabio
 */
public class PrimaryController implements Initializable {

    @FXML
    private TextField display;
    @FXML
    private Button add;
    @FXML
    private Button sub;
    @FXML
    private Button multi;
    @FXML
    private Button divi;
    @FXML
    private Button equal;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button clear;
    
    
    
    //VARIABILI
    private int data;
    private int data2;
    private int operation;
    private int answer;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handeAction(ActionEvent event) {
        if (event.getSource()==one){
            display.setText(display.getText()+"1");
        }
        if (event.getSource()==two){
            display.setText(display.getText()+"2");
        }
        if (event.getSource()==three){
            display.setText(display.getText()+"3");
        }
        if (event.getSource()==four){
            display.setText(display.getText()+"4");
        }
        if (event.getSource()==five){
            display.setText(display.getText()+"5");
        }
        if (event.getSource()==six){
            display.setText(display.getText()+"6");
        }
        if (event.getSource()==seven){
            display.setText(display.getText()+"7");
        }
        if (event.getSource()==eight){
            display.setText(display.getText()+"8");
        }
        if (event.getSource()==nine){
            display.setText(display.getText()+"9");
        }
        if (event.getSource()==zero){
            display.setText(display.getText()+"0");
        }
        if (event.getSource()==clear){
            display.setText("");
        }
        
        //calcoli
        if (event.getSource()==add){
           
            data=Integer.parseInt(display.getText());
            display.setText("");
            this.operation =1;   
        }
        
        if (event.getSource()==sub){
           
            data=Integer.parseInt(display.getText());
            display.setText("");
            this.operation =2;   
        }
        
        if (event.getSource()==multi){
           
            data=Integer.parseInt(display.getText());
            display.setText("");
            this.operation =3;   
        }
                
        if (event.getSource()==divi){
           
            data=Integer.parseInt(display.getText());
            display.setText("");
            this.operation =4;   
        }
        
                //calcloli
        if (event.getSource()==equal){
           data2=Integer.parseInt(display.getText());
           
           switch (operation){
               case 1: this.answer = data+data2;
                        display.setText(String.valueOf(answer));
                        break;
                        
               case 2: this.answer = data-data2;
                        display.setText(String.valueOf(answer));
                        break;
                        
               case 3: this.answer = data*data2;
                        display.setText(String.valueOf(answer));
                        break;
                        
               case 4: this.answer = data/data2;
                        display.setText(String.valueOf(answer));
                        break;               
           }
            
        }
        
        
        
    }
    
}
