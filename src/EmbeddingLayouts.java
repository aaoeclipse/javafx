import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class EmbeddingLayouts extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Button button1 = new Button();
        button1.setText("Hello");
        button1.setOnAction(event -> System.out.println("Hello"));

        HBox topMenu = new HBox();
        Button buttonA = new Button();
        buttonA.setText("home");
        buttonA.setOnAction(event -> System.out.println("home"));

        Button buttonB = new Button();
        buttonB.setText("test");
        buttonB.setOnAction(event -> System.out.println("test"));
        topMenu.getChildren().addAll(buttonA, buttonB);

        VBox leftMenu = new VBox();
        Button buttonC = new Button();
        buttonC.setText("profile");
        buttonC.setOnAction(event -> System.out.println("profile"));

        Button buttonD = new Button();
        buttonD.setText("stuff");
        buttonD.setOnAction(event -> System.out.println("stuff"));
        leftMenu.getChildren().addAll(buttonC, buttonD);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);


        Scene scene1 = new Scene(borderPane,200,200);

        window.setScene(scene1);
        window.setTitle("Layouts");
        window.show();
    }

    public static void main(String[] args) { launch(args); }
}
