package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    Button button;
    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("hey now hey now");

        // button 1
        Button button1 = new Button();
        button1.setText("Scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        // vertical columns
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        // button 2
        Button button2 = new Button();
        button2.setText("Scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        // layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);

        // scene 2
        scene2 = new Scene(layout2, 600, 300);

        // run
        window.setScene(scene1);
        window.setTitle("First Test");
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
