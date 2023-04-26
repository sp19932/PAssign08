package JavaFx;
/**
 * File: PAssign08.java
 * Class: CSCI 1302
 * Author: Shiv Patel
 * Created on: Apr 21, 2023
 * Last Modified:  Apr 26, 2023
 * Description: Create and Show a Phone Number Pad
 */

import JavaFx.KeyPadPane;
import JavaFx.KeyPadPanePlus;
import JavaFx.KeyPadCustomPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import java.util.Arrays;

public class PAssign08 extends Application{
	protected Label label = new Label("Press any button twice ");
	protected TextField Result = new TextField("Click a button for a suprise:) ");

	public void start(Stage primaryStage) { // set the stage
		
		BorderPane mainPane = new BorderPane(); // Create a border pane
		KeyPadCustomPane key = new KeyPadCustomPane();
		mainPane.setCenter(key);
		mainPane.setLeft(label);
		mainPane.setTop(Result);
		Result.setEditable(false);
	
		
		//The PrimaryStage Title  and scene
		primaryStage.setTitle("Phone Number Pad"); 
		Scene scene = new Scene(mainPane, 350, 250);
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	public static void main(String[] args) {
		launch(args);
	} // end of main method
	
} // end of PAssign08
