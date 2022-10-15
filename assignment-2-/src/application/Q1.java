/*
 * Q1.] Read username and password
 *      Validate input
 *      If match display welcome scene
 *      Else raise exception
 */

package application;

import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;

import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;


public class Q1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			
			GridPane root = new GridPane();
			root.setAlignment(Pos.CENTER);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("User Login");
			
			//VBOX
			VBox entire = new VBox(10);
			
			// Name 
			HBox nameHbox = new HBox();
			Label nameLabel = new Label("Name: ");
			TextField nameTf = new TextField();
			nameTf.setPromptText("Name");
			nameHbox.getChildren().addAll(nameLabel, nameTf);
			entire.getChildren().add(nameHbox);
			
			
			// Password
			HBox passwdHbox = new HBox();
			Label passwdLabel = new Label("Password: ");
			TextField passwdTf = new TextField();
			passwdTf.setPromptText("Password");
			passwdHbox.getChildren().addAll(passwdLabel, passwdTf);
			entire.getChildren().add(passwdHbox);
			
			// Submit Button
			HBox bttnBox = new HBox();
			Button submit = new Button("Submit");
			bttnBox.getChildren().add(submit);
			entire.getChildren().add(submit);
			Label invalidLabel = new Label("");
			HBox responseBox = new HBox();
			responseBox.getChildren().add(invalidLabel);
			entire.getChildren().add(responseBox);
			
			submit.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent ae) {
					
					String USER_NAME = "Jai";
					String PASSWORD = "sdmcet";
					
					if(nameLabel.getText().matches(USER_NAME) & passwdLabel.getText().matches(PASSWORD)) {
						
						invalidLabel.setText("Signed In");
					}
				}
			});
			
			entire.setAlignment(Pos.CENTER);
			
			root.getChildren().add(entire);
			
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
