package LoginWindow;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;





public class MainLogInWindow extends Application{

    @Override
    public void start(Stage stage){
        Pane root = new Pane();
        Label label1 = new Label("Test message");
        label1.setLayoutX(50);
        label1.setLayoutY(50);
        root.getChildren().add(label1);

        Scene scene = new Scene(root, 400, 500);
        stage.setTitle("Log-In Page");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }




}
