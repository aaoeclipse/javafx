import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GridPaneTutorial extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label nameLabel = new Label("Username: ");
        GridPane.setConstraints(nameLabel, 0,0);

        TextField nameInput = new TextField("test");
        GridPane.setConstraints(nameInput, 1,0);

        Label passwordLabel = new Label("Password: ");
        GridPane.setConstraints(passwordLabel, 0,1);

        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1,1);

        Button login = new Button();
        login.setText("Login");
        GridPane.setConstraints(login, 1, 2);

        gridPane.getChildren().addAll(nameLabel, nameInput, passwordLabel, passInput, login);

        Scene scene1 = new Scene(gridPane,200,200);

        window.setScene(scene1);
        window.setTitle("Layouts");
        window.show();
    }

    public static void main(String[] args) { launch(args); }
}