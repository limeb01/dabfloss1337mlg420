import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class *Main.java extends Application {
    private String tal="";
    private HBox hbox = new HBox();
    private String textfieldText = "";
    private BorderPane miniraknare = new BorderPane();
    private TextField textField = new TextField();
    private ArrayList<Button> KnapparArray = new ArrayList<Button>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        knappar();

        miniraknare.setPrefHeight(600);
        miniraknare.setPrefWidth(400);
        miniraknare.setCenter(borderpaneCenter());
        miniraknare.setTop(hbox);

        textfieldMetod("");

        Scene calculatorScene = new Scene(miniraknare);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(calculatorScene);
        primaryStage.show();
    }

    private StackPane borderpaneCenter() {
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

    private void textfieldMetod(String input) {
        if(input.contains("=")){
            textfieldText="";
            try{
                uträkning();
            }
            catch (Exception e){
            System.out.println("ERROR");
            }

        } else {
            textfieldText = textfieldText + input;
        }
        if (input.contains("C")){
            textfieldText="";
        }

        textField = new TextField(textfieldText);
        textField.setPrefHeight(100);
        textField.setPrefWidth(500);
        textField.setStyle(("-fx-font: 45 arial;"));
        hbox.getChildren().setAll(textField);


    }

    private void knappar() {

        char[] nummer = {'7', '8', '9', '*', '4', '5', '6', '÷', '1', '2', '3', '-', '=', '0', 'C', '+'};
        int count = 0;

        for (char t : nummer) {
            char charr = nummer[count];
            System.out.println(charr);
            String knappString = String.valueOf(charr);
            Button knapp = new Button(knappString);
            knapp.setStyle("-fx-font: 20 arial;");
            knapp.setOnAction(event -> {
                textfieldMetod(knappString);
            });
            knapp.setPrefHeight(75);
            knapp.setPrefWidth(75);
            KnapparArray.add(knapp);
            count++;
        }
    }


    private void uträkning(){
        String input = textField.getText();
        ArrayList <Double> numbers =  splitring(input);
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))==false){
                if (input.charAt(i)=='+'){
                    double resultat = numbers.get(0) + numbers.get(1);
                    numbers.remove(1);
                    numbers.remove(0);
                    numbers.add(0,resultat);
                }
                if(input.charAt(i)=='-'){
                    double resultat = numbers.get(0) - numbers.get(1);
                    numbers.remove(1);
                    numbers.remove(0);
                    numbers.add(0,resultat);
                }
                if (input.charAt(i)=='*'){
                    double resultat = numbers.get(0) * numbers.get(1);
                    numbers.remove(1);
                    numbers.remove(0);
                    numbers.add(0,resultat);

                }
                if (input.charAt(i)=='÷'){
                    double resultat = numbers.get(0) / numbers.get(1);
                    numbers.remove(1);
                    numbers.remove(0);
                    numbers.add(0,resultat);

                }
            }
        }
        double temp = numbers.get(0);
        int resultatSomInt = (int) temp;
        String resultatString = Integer.toString(resultatSomInt);

        textfieldMetod(resultatString);
    }

    // delar up de olika termerna
    private ArrayList<Double> splitring(String input){
        tal = "";
        System.out.println(input+" INPUT");
        ArrayList <Double> talArray = new ArrayList<>();
        double talDouble =0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))==false){
                talDouble = Double.parseDouble(tal);
                talArray.add(talDouble);
                tal = "";
            }
            else{
                tal = tal + input.charAt(i);
            }
        }
        if (tal.length()>=1) {
            talDouble = Double.parseDouble(tal);
            talArray.add(talDouble);
        }

        System.out.println(talArray);
        return talArray;
    }
}