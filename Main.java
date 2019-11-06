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
import java.util.ArrayList;

public class layout extends Application {
HBox hbox = new HBox();

String nummer = "";

BorderPane miniräknare = new BorderPane();

ArrayList<Button> KnapparArray = new ArrayList<Button>();

public static void main(String[] args) {
launch(args);
}


@Override
public void start(Stage primaryStage) {
knappar();

miniräknare.setPrefHeight(600);
miniräknare.setPrefWidth(400);


miniräknare.setCenter(borderpaneCenter());

miniräknare.setTop(hbox);
textfield("t");

Scene calculatorScene = new Scene(miniräknare);

primaryStage.setTitle("Calculator");
primaryStage.setScene(calculatorScene);
primaryStage.show();

}


public StackPane borderpaneCenter() {


StackPane center = new StackPane();
GridPane buttons = new GridPane();
buttons.setHgap(10);
buttons.setVgap(10);
int rad = 1;
int kolumner = 1;
for (int i = 0; i < KnapparArray.size(); i++) {


if (i % 4 == 0) {
rad++;
kolumner = 1;
}


buttons.add(KnapparArray.get(i), kolumner, rad);
kolumner++;
}

center.getChildren().add(buttons);

return center;
}
public void textfield(String input){
TextField textField = new TextField(input);
textField.setPrefHeight(100);
textField.setPrefWidth(500);
textField.setStyle(("-fx-font: 45 arial;"));

hbox.getChildren().setAll(textField);

}

public void knappar() {

char[] nummer = {'7', '8', '9', 'x', '4', '5', '6', '÷', '1', '2', '3', '-', '.', '0', '=', '+', 'C', 'D'};
int count = 0;

for (char t : nummer) {

char charr = nummer[count];
System.out.println(charr);
String knappString = String.valueOf(charr);
Button knapp = new Button(knappString);
knapp.setStyle("-fx-font: 20 arial;");
knapp.setOnAction(event -> {
uträkning(knappString);
System.out.println("hej");
});
knapp.setPrefHeight(75);
knapp.setPrefWidth(75);
KnapparArray.add(knapp);
count++;
}


}
public void uträkning(String input){
double result = 0;
System.out.println(input);
ArrayList <Double> talArray = new ArrayList<>();

nummer = nummer + input;
if(input.charAt(0)=='C') {
nummer = "";

}
if(input.charAt(0)=='=') {

for (int i = 0; i < nummer.length(); i++) {
char temp = nummer.charAt(i);
String tal = Character.toString(temp);
if (Character.isDigit(temp) == false) {
talArray.add(Double.parseDouble(tal));

tal = "";

}
}

for (int i = 0; i < nummer.length(); i++) {
if (Character.isDigit(nummer.charAt(i))) {

if (nummer.charAt(i) == '+') {
result = talArray.get(0) + talArray.get(1);

}

}
}

String resultString = Double.toString(result);

textfield(resultString);
}
else{
textfield(nummer);
}

}

}