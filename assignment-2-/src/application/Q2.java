/*
 * MenuItems : File, Edit, Help
 * SubMenus : 
 * File-> New, Open, Save
 * Edit -> Cut, Copy, Paste
 * Help -> Help Centre, About us 
 */
package application;

import javafx.scene.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.*;

import javafx.application.Application;

public class Q2 extends Application{
	
	public void start() {}

	@Override
	public void start(Stage primaryStage){
		// TODO Auto-generated method stub
		
		try {
			
			primaryStage.setTitle("Q2 Menu");
			
			BorderPane root = new BorderPane();
			
			Scene primaryScene = new Scene(root, 600, 600);
			
			primaryStage.setScene(primaryScene);
			
			MenuBar mb = new MenuBar();
			
			// File menu 
			Menu fileMenu = new Menu("_File");
			
			// Adding file menu items
			MenuItem newItem = new MenuItem("New");
			MenuItem closeItem = new MenuItem("Close");
			MenuItem saveItem = new MenuItem("Save");
			fileMenu.getItems().addAll(newItem, closeItem, saveItem);
			fileMenu.setMnemonicParsing(true); // Mnemonic Turned on
			newItem.setAccelerator(KeyCombination.keyCombination("shortcut+n"));
			closeItem.setAccelerator(KeyCombination.keyCombination("shortcut+l"));
			saveItem.setAccelerator(KeyCombination.keyCombination("shortcut+a"));
			mb.getMenus().add(fileMenu);
			
			// Edit Menu
			Menu editMenu = new Menu("_Edit");
			
			//Adding edit menu items
			MenuItem cutItem = new MenuItem("Cut");
			MenuItem copyItem = new MenuItem("Copy");
			MenuItem pasteItem = new MenuItem("Paste");
			editMenu.getItems().addAll(cutItem, copyItem, pasteItem);
			editMenu.setMnemonicParsing(true);
			cutItem.setAccelerator(KeyCombination.keyCombination("shortcut+x"));
			copyItem.setAccelerator(KeyCombination.keyCombination("shortcut+c"));
			pasteItem.setAccelerator(KeyCombination.keyCombination("shortcut+v"));
			mb.getMenus().add(editMenu);
			
			// Help Menu
			Menu helpMenu = new Menu("_Help");
			
			// Adding help menu items
			MenuItem helpCentreItem = new MenuItem("Help Us");
			MenuItem aboutUs = new MenuItem("About Us");
	        helpMenu.getItems().addAll(helpCentreItem, aboutUs);
	        helpMenu.setMnemonicParsing(true);
	        helpCentreItem.setAccelerator(KeyCombination.keyCombination("shortcut+b"));
	        aboutUs.setAccelerator(KeyCombination.keyCombination("shortcut+u"));
	        mb.getMenus().add(helpMenu);
	        
	        root.setTop(mb);
			primaryStage.show();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}