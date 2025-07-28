package LauncherWindow;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.StageStyle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;


public class MainLauncherWindow extends Application{

    private double XOffset = 0;
    private double YOffset = 0;


    @Override
    public void start(Stage stage){
        Pane root = new Pane();
        root.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 0%, #1a1a1a, #2a2a2a);");

        Color neonGreen = Color.web("#39ff14");

        //     -------------         BORDER                ------------------
        Line top = new Line(0,0,1200,0);
        top.setStroke(neonGreen);
        top.setStrokeWidth(5);
        Line left  = new Line(0,0,0,800);
        left.setStroke(neonGreen);
        left.setStrokeWidth(5);
        Line bottom = new Line(0,800,1200,800);
        bottom.setStroke(neonGreen);
        bottom.setStrokeWidth(5);
        Line right = new Line(1200,0,1200,800);
        right.setStroke(neonGreen);
        right.setStrokeWidth(5);
//     -------------------------------------------------------------------


        Rectangle draggableRectangle = new Rectangle(1200,80);
        draggableRectangle.setFill(new LinearGradient(
                0,0,1,0,true, CycleMethod.NO_CYCLE, new Stop(0,Color.web("#1a1a1a")),new Stop(1,Color.web("#2a2a2a"))
        ));

        Button exitButton = new Button("X");
        exitButton.setLayoutX(1157.5);
        exitButton.setLayoutY(2.5);
        exitButton.setStyle("-fx-background-color: #2a2a2a;"+"-fx-text-fill: #39ff14");

        exitButton.setPrefSize(40,19);
        exitButton.setOnMouseEntered(e->{
            exitButton.setStyle("-fx-background-color: red;"+"-fx-text-fill : white;");
        });
        exitButton.setOnMouseExited(e->{
            exitButton.setStyle("-fx-background-color: #2a2a2a;"+"-fx-text-fill: #39ff14");
        });

        exitButton.setOnAction(e -> {
            stage.close();
        });
        Button minimizeButton = new Button("__" +
                "");
        minimizeButton.setLayoutX(1118.5);
        minimizeButton.setLayoutY(2.5);
        minimizeButton.setStyle("-fx-background-color: #2a2a2a;"+"-fx-text-fill: #39ff14;");
        minimizeButton.setPrefSize(40,19);

        minimizeButton.setOnMouseEntered(e->{
            minimizeButton.setStyle("-fx-background-color: blue;"+"-fx-text-fill : white;");
        });
        minimizeButton.setOnMouseExited(e->{
            minimizeButton.setStyle("-fx-background-color: #2a2a2a;"+"-fx-text-fill: #39ff14;");
        });
        minimizeButton.setOnAction(e->{
            stage.setIconified(true);
        });











        root.getChildren().addAll(draggableRectangle,exitButton,minimizeButton,top,right,left,bottom);
        Scene scene = new Scene(root, 1200, 800);
        draggableRectangle.setOnMousePressed(e -> {
            XOffset = e.getScreenX() - stage.getX();
            YOffset = e.getScreenY() - stage.getY();
        });

        draggableRectangle.setOnMouseDragged(e -> {
            stage.setX(e.getScreenX() - XOffset);
            stage.setY(e.getScreenY() - YOffset);
        });
        stage.setScene(scene);
        stage.setTitle("XPulse Launcher");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }


}
