import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Testing extends Application {
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Button button = new Button();
        button.setText("Click Me!");
        button.setOnAction(e -> {
            boolean result = ConfirmBox.display("Naked pics!?", "Are you sure you want to sent naked pics?");
            System.out.println("result = " + result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene1 = new Scene(layout, 300,250);

        // window
        window.setTitle("Test");
        window.setScene(scene1);
        window.show();

    }

    public static void main(String[] args){ launch(args); }
}
