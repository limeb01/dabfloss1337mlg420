package javauppgifter;
import javafx.application.Application;
	import javafx.scene.Group;
	import javafx.scene.Scene;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.StackPane;
	import javafx.scene.text.FontWeight;
	import javafx.stage.Stage;
	import javafx.scene.control.*;
	import javafx.scene.shape.Rectangle;
	import javafx.event.ActionEvent;

	import java.awt.*;
	import javafx.scene.control.Button;

	import java.awt.Label;
	import java.time.Clock;
	import java.util.ArrayList;
	
public class Gamet extends Application {


	BorderPane miniräknare = new BorderPane();
	
	ArrayList<Button> KnapparArray = new ArrayList<Button>();
	
	public static void main(String[] args) {
	launch(args);
	}


	@Override
	public void start (Stage primaryStage){
	knappar();

	miniräknare.setPrefHeight(600);
	miniräknare.setPrefWidth(400);

	
	miniräknare.setCenter(borderpaneCenter());

	Scene calculatorScene = new Scene(miniräknare);

	primaryStage.setTitle("Calculator");
	primaryStage.setScene(calculatorScene);
	primaryStage.show();

	}



	public StackPane borderpaneCenter(){
	
	
	StackPane center = new StackPane();
	GridPane buttons = new GridPane();
	buttons.setHgap(10);
	buttons.setVgap(10);
	int rad = 1;
	int kolumner = 1;
	for (int i = 0; i < KnapparArray.size(); i++) {

	
	if (i % 4 ==0) {
	rad++;
	kolumner = 1;
	}


	buttons.add(KnapparArray.get(i),kolumner,rad);
	kolumner ++;
	}

	center.getChildren().add(buttons);

	return center;
	}

	public void knappar() {

	char[] nummer = {'7', '8', '9','x','4','5','6','÷','1','2','3','-','.','0','=','+','(',')','C','D'};
	int count = 0;

	for (char t : nummer){	

	char charr = nummer[count];
	System.out.println(charr);
	String knappString = String.valueOf(charr);
	Button knapp = new Button(knappString);
	knapp.setStyle("-fx-font: 20 arial;");
	knapp.setOnAction(event -> { System.out.println("hej");});
	knapp.setPrefHeight(100);
	knapp.setPrefWidth(100);
	KnapparArray.add(knapp);
	count++;
	}


	}
}
