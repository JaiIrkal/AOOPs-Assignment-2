/*
 * Context Menu : New, View 
 * SubMenus: New-> File, Folder, Image
 * 			 View-> Large, Medium and Small
 * 
 */
package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Q3 extends Application{
	
	public void start(Stage myStage) {
		
		try {
			
			myStage.setTitle("Q3 Context Menu");
			
			BorderPane root = new BorderPane();
			
			Scene myScene = new Scene(root, 300, 300);
			myStage.setScene(myScene);
			
			// Menu Items for New
			Menu newMenu = new Menu("New");
			MenuItem nFile = new MenuItem("File");
			MenuItem nFolder = new MenuItem("Folder");
			MenuItem nImage = new MenuItem("Image");
			newMenu.getItems().addAll(nFile, nFolder, nImage);
			
			// Menu Items for View
			Menu view = new Menu("View");
			MenuItem vLarge = new MenuItem("Large");
			MenuItem vMedium = new MenuItem("Medium");
			MenuItem vSmall = new MenuItem("Small");
			view.getItems().addAll(vLarge, vMedium, vSmall);
			Menu mainMenu = new Menu();
			mainMenu.getItems().addAll(newMenu, view);
			ContextMenu mainContext = new ContextMenu(mainMenu);
			
			TextField tf = new TextField();
			tf.setPrefColumnCount(20);
			tf.setContextMenu(mainContext);
			
			FlowPane fpRoot = new FlowPane(10, 10);
			fpRoot.setAlignment(Pos.CENTER);
			fpRoot.getChildren().add(tf);
			
			root.setCenter(fpRoot);
			
			myStage.show();
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}