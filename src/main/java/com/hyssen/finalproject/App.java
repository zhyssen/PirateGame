/******************************************************************************
 * Final Exam Project - Treasure Hunt
 * Author: Zinet Hyssen
 * Project Purpose: Create a program that simulates a map treasure hunt. 
 * Input: This program does accept input from a mouse.
 * Desired Output: The mouse click on a pane will display a random prize.
 * Variables and classes: There is one class, the main and several variables for
 *     the labels.
 * Formulas: The shuffle formula was used.
 * Testing: When the program runs, mouse click event will display a random saying
 *     and a new image.
 * December 14, 2020
 *******************************************************************************/


package com.hyssen.finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.util.Arrays;


/**
 * JavaFX App
 */
public class App extends Application 
{

    private Label welcomeLabel;
    private Label introLabel;
    private Label statusLabel;
    private TextField nameField;
    private Label instructionLabel;
    private Label resultLabel;
    private String player;
    private String spot;
    

    public static void main(String[] args) throws FileNotFoundException 
    {
        launch(args);
        
        
        
        ArrayList<ClickResult> result = new ArrayList<ClickResult>();
        
        File text = new File("ClickResult.txt");
        
        Scanner scan = new Scanner(text);
        
        while (scan.hasNextLine())
        {
            result.add(new ClickResult(scan.nextLine()));
            
        }
         //My test to make sure the file was getting read to the array and that
        //was shuffling properly.
        
        for (int index = 0; index < result.size(); index++)
        {
            ClickResult contact = result.get(index);
            
            System.out.println(contact.getResult());
        
        }  
        
        System.out.println("BREAK");
        
        Collections.shuffle(result);
        
        for (int index = 0; index < result.size(); index++)
        {
            ClickResult contact = result.get(index);
            
            System.out.println(contact.getResult());
            //System.out.println(contact.getIndex(2));
        
        }  
        
        
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        // Create Image Objexts
        Image map1Image = new Image("map1.jpg");
        Image map2Image = new Image("map2.jpg");
        Image map3Image = new Image("map3.jpg");
        Image map4Image = new Image("map4.jpg");
        Image map5Image = new Image("map5.jpg");
        Image map6Image = new Image("map6.jpg");
        Image map7Image = new Image("map7.jpg");
        Image map8Image = new Image("map8.jpg");
        Image map9Image = new Image("map9.jpg");
        
        Image chestImage = new Image("chest.jpg");
        Image barrelsImage = new Image("barrels.jpg");
        Image beachImage = new Image("beach.jpg");
        Image coinsImage = new Image("coins.jpg");
        Image emptyChestImage = new Image("emptyChest.jpg");
        Image palmImage = new Image("Palm.jpg");
        Image parrotImage = new Image("parrot.jpg");
        Image pirateSkullImage = new Image("pirateSkull.jpg");
        Image shellsImage = new Image("shells.jpg");
        
        // Create ImageView objects
        ImageView map1View = new ImageView(map1Image);
        ImageView map2View = new ImageView(map2Image);
        ImageView map3View = new ImageView(map3Image);
        ImageView map4View = new ImageView(map4Image);
        ImageView map5View = new ImageView(map5Image);
        ImageView map6View = new ImageView(map6Image);
        ImageView map7View = new ImageView(map7Image);
        ImageView map8View = new ImageView(map8Image);
        ImageView map9View = new ImageView(map9Image);
        
        ImageView prize0View = new ImageView(chestImage);
        ImageView prize1View = new ImageView(barrelsImage);
        ImageView prize2View = new ImageView(beachImage);
        ImageView prize3View = new ImageView(coinsImage);
        ImageView prize4View = new ImageView(emptyChestImage);
        ImageView prize5View = new ImageView(palmImage);
        ImageView prize6View = new ImageView(parrotImage);
        ImageView prize7View = new ImageView(pirateSkullImage);
        ImageView prize8View = new ImageView(shellsImage);
        
        // Resize the images
        map1View.setFitWidth(200);
        map1View.setPreserveRatio(true);
        
        map2View.setFitWidth(200);
        map2View.setPreserveRatio(true);
        
        map3View.setFitWidth(200);
        map3View.setPreserveRatio(true);
        
        map4View.setFitWidth(200);
        map4View.setPreserveRatio(true);
        
        map5View.setFitWidth(200);
        map5View.setPreserveRatio(true);
        
        map6View.setFitWidth(200);
        map6View.setPreserveRatio(true);
        
        map7View.setFitWidth(200);
        map7View.setPreserveRatio(true);
        
        map8View.setFitWidth(200);
        map8View.setPreserveRatio(true);
        
        map9View.setFitWidth(200);
        map9View.setPreserveRatio(true);
        
        prize0View.setFitWidth(200);
        prize0View.setPreserveRatio(true);
        
        prize1View.setFitWidth(200);
        prize1View.setPreserveRatio(true);
        
        prize2View.setFitWidth(200);
        prize2View.setPreserveRatio(true);
        
        prize3View.setFitWidth(200);
        prize3View.setPreserveRatio(true);
        
        prize4View.setFitWidth(200);
        prize4View.setPreserveRatio(true);
        
        prize5View.setFitWidth(200);
        prize5View.setPreserveRatio(true);
        
        prize6View.setFitWidth(200);
        prize6View.setPreserveRatio(true);
        
        prize7View.setFitWidth(200);
        prize7View.setPreserveRatio(true);
        
        prize8View.setFitWidth(200);
        prize8View.setPreserveRatio(true);
        
        // Create the labels
        welcomeLabel = new Label("Ahoy! Welcome to the Treasure Hunt, Matey!");
        welcomeLabel.setStyle("=fx-font: Harrington; -fx-font-size: 18pt; -fx-font-weight: bold");
        
        //introLabel = new Label("Enter your name you scurvy land lubber.");
        //introLabel.setStyle("-fx-font-size: 16pt");
        //nameField = new TextField();
        
        //Button startButton = new Button("Click to Start");
        //startButton.setAlignment(Pos.CENTER);
                
        //startButton.setOnAction(new ButtonClickHandler());
        
        statusLabel = new Label("Are ye ready fer th' hunt? Or will ye walk th' plank?");
        statusLabel.setStyle("-fx-font-size: 16pt");
        
        instructionLabel = new Label("Click on a square to find the "
                    + "treasure. \nDon't end up in Davy Jones' Locker!");
        instructionLabel.setStyle("-fx-font-size: 16pt");
        
        resultLabel = new Label();
        resultLabel.setStyle("-fx-font-size: 16pt");
        
        // Create a GridePane
        GridPane mapGridPane = new GridPane();
                
        // Add the ImageViews to the GridPane
        mapGridPane.add(map1View, 0, 0);
        mapGridPane.add(map2View, 1, 0);
        mapGridPane.add(map3View, 2, 0);
        mapGridPane.add(map4View, 0, 1);
        mapGridPane.add(map5View, 1, 1);
        mapGridPane.add(map6View, 2, 1);
        mapGridPane.add(map7View, 0, 2);
        mapGridPane.add(map8View, 1, 2);
        mapGridPane.add(map9View, 2, 2);
        
        mapGridPane.setGridLinesVisible(true);
        
        //map1View.setOnMouseClicked(new MouseClickedHandler());
        
        // Set the mouse click events
        map1View.setOnMouseClicked(event ->
        {
            
            resultLabel.setText("Ye found th' hidden loot, Matey!");
                //resultLabel.setText(ClickResult[2]);
                //mapGridPane.add(prize0View, 0, 0);
            /*
            for (int index = 0; index < result.size(); index++)
            {
                ClickResult spot = result.get(index);
            
                System.out.println(spot.getResult(2));
        
            }*/
                
        }
        );
        
        map2View.setOnMouseClicked(event ->
        {
            resultLabel.setText("Yo Ho Ho! Time fer some grog.");
        });
        
        map3View.setOnMouseClicked(event ->
        {
            resultLabel.setText("Keep goin'. We shall find those pieces o' eight.");
        });
        
        map4View.setOnMouseClicked(event ->
        {
            resultLabel.setText("Blimey! A bag of dubloons!");
        });
        
        map5View.setOnMouseClicked(event ->
        {
            resultLabel.setText("Some scallywags got 'ere first.");
        });
        
        map6View.setOnMouseClicked(event ->
        {
            resultLabel.setText("Grr. 'tis jus' a palm tree.");
        });
        
        map7View.setOnMouseClicked(event ->
        {
            resultLabel.setText("SQUAWK!");
        });
        
        map8View.setOnMouseClicked(event ->
        {
            resultLabel.setText("Arrrrggghhhh! Game Over!");
            primaryStage.close();
        });
        
        map9View.setOnMouseClicked(event ->
        {
            resultLabel.setText("Shiver me timbers, we're gettin' close!");
        });
        
        // Put everything in their boxes
        VBox welcomeBox = new VBox(welcomeLabel, resultLabel);
        VBox statusBox = new VBox(statusLabel);
        VBox nameBox = new VBox(instructionLabel);
        VBox mainVBox = new VBox(welcomeBox, mapGridPane, statusBox, nameBox);
        
        HBox prizeBox = new HBox(prize0View);
        
        welcomeBox.setAlignment(Pos.CENTER);
        statusBox.setAlignment(Pos.CENTER);
        nameBox.setAlignment(Pos.CENTER);
       
        //System.out.println(ClickResult.get(2));
        
        // Set the scene stage and show
        Scene scene = new Scene(mainVBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Treasure HHunt");
        primaryStage.show();
        
        //Scene scene2 = new Scene(prizeBox);
        //primaryStage.setScene(scene2);
        
               
    }
    /*
    class ButtonClickHandler implements EventHandler<ActionEvent>
    {
        
        @Override
        public void handle(ActionEvent event)
        {
            //String player;
           // player = nameField.getText();
            //introLabel.setText("Avast Ye," player);
            instructionLabel.setText("Click on a square to find the "
                    + "treasure. \nDon't end up in Davy Jones' Locker!");
        }
    }
    /*
    // MouseClick event handeler
    class MouseClickedHandler implements EventHandler<ActionEvent>
    {

        
        }
        @Override
        public void handle(ActionEvent event)
        {
            resultLabel.setText("You won!");
        }
    }*/

}