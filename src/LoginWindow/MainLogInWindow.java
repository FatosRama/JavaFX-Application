package LoginWindow;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;




public class MainLogInWindow extends Application{

    @Override
    public void start(Stage stage){
        Pane root = new Pane();
        stage.initStyle(StageStyle.UNDECORATED);
        root.setStyle("-fx-background-color: #121212;");

        Color neonGreen = Color.web("#39ff14");

// ------------------------- TITLE BORDER --------------------------------
        Line dLine1 = new Line(180,0,220,40);
        dLine1.setStroke(neonGreen);
        dLine1.setStrokeWidth(2);
        Line dLine2 = new Line(220,40,680,40);
        dLine2.setStroke(neonGreen);
        dLine2.setStrokeWidth(2);
        Line dLine3 = new Line(680,40,720,0);
        dLine3.setStroke(neonGreen);
        dLine3.setStrokeWidth(2);
//-------------------------------------------------------------------------
        Label titleApplication = new Label("XPULSE LAUNCHER");
        titleApplication.setLayoutX(320);

        titleApplication.setStyle("-fx-font-family:'Tahoma'; -fx-font-size:30px;"+"-fx-text-fill: #39ff14;");

        Label PanelTitle = new Label("JOIN US");
        PanelTitle.setStyle("-fx-text-fill: white; -fx-font-size:20px;");
        PanelTitle.setLayoutX(410);
        PanelTitle.setLayoutY(90);

        Rectangle logInPanel = new Rectangle(300, 450);
        logInPanel.setFill(Color.web("#1a1a1a"));
        logInPanel.setLayoutX(300);
        logInPanel.setLayoutY(70);










//     -------------         BORDER                ------------------
        Line top = new Line(0,0,900,0);
        top.setStroke(neonGreen);
        top.setStrokeWidth(2);
        Line left  = new Line(0,0,0,600);
        left.setStroke(neonGreen);
        left.setStrokeWidth(2);
        Line bottom = new Line(0,600,900,600);
        bottom.setStroke(neonGreen);
        bottom.setStrokeWidth(2);
        Line right = new Line(900,0,900,600);
        right.setStroke(neonGreen);
        right.setStrokeWidth(2);
//     -------------------------------------------------------------------



        Button exitButton = new Button("X");
        exitButton.setLayoutX(859);
        exitButton.setLayoutY(1.5);
        exitButton.setStyle("-fx-background-color: #121212;"+"-fx-text-fill: #39ff14");

        exitButton.setPrefSize(40,19);
        exitButton.setOnMouseEntered(e->{
            exitButton.setStyle("-fx-background-color: red;"+"-fx-text-fill : white;");
        });
        exitButton.setOnMouseExited(e->{
            exitButton.setStyle("-fx-background-color: #121212;"+"-fx-text-fill: #39ff14");
        });

        exitButton.setOnAction(e -> {
            stage.close();
        });


        root.getChildren().addAll(logInPanel,PanelTitle,titleApplication,dLine1,dLine2,dLine3,right,bottom,left,top,exitButton);
        Scene scene = new Scene(root, 900, 600,Color.BLACK);
        stage.setTitle("Log-In Page");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }




}
