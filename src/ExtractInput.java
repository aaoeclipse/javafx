import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExtractInput extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(8);

        Label nameLabel = new Label("Insert your name: ");
        GridPane.setConstraints(nameLabel, 0,0);
        TextField nameInput = new TextField();
        nameInput.setPromptText("Your name here");
        GridPane.setConstraints(nameInput, 1,0);
        Button b1 = new Button();
        b1.setText("Go!");
        b1.setOnAction(e-> System.out.println(nameInput.getText()));
        GridPane.setConstraints(b1, 1,1);

        grid.getChildren().addAll(nameLabel, nameInput, b1);


        Scene scene = new Scene(grid,250,250);
        window.setScene(scene);
        window.setTitle("input");
        window.show();

    }
}
