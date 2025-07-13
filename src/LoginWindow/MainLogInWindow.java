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
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.effect.DropShadow;
import javafx.scene.text.Font;



public class MainLogInWindow extends Application{
    private double XOffset = 0;
    private double YOffset = 0;
    @Override
    public void start(Stage stage){

        Pane root = new Pane();
        stage.initStyle(StageStyle.UNDECORATED);
        root.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 0%, #1a1a1a, #2a2a2a);");







        Color neonGreen = Color.web("#39ff14");








// ------------------------- TITLE BORDER --------------------------------
        Line dLine1 = new Line(180,0,220,40);
        dLine1.setStroke(neonGreen);
        dLine1.setStrokeWidth(3);
        Line dLine2 = new Line(220,40,680,40);
        dLine2.setStroke(neonGreen);
        dLine2.setStrokeWidth(3);
        Line dLine3 = new Line(680,40,720,0);
        dLine3.setStroke(neonGreen);
        dLine3.setStrokeWidth(3);
//-------------------------------------------------------------------------
        Label titleApplication = new Label("XPULSE LAUNCHER");
        titleApplication.setLayoutX(320);

        titleApplication.setStyle("-fx-font-size:30px;"+"-fx-text-fill: #39ff14;");

//-----------------------------LOG IN PANEL -----------------------------------
        Label PanelTitle = new Label("LOG IN");
        PanelTitle.setStyle("-fx-text-fill: white; -fx-font-family: Arial Black; -fx-font-size:20px; -fx-font-weight:bold;");
        PanelTitle.setLayoutX(410);
        PanelTitle.setLayoutY(90);


        DropShadow logInPanelShadow = new DropShadow();
        logInPanelShadow.setColor(Color.web("#39ff14"));
        logInPanelShadow.setSpread(0.2);
        logInPanelShadow.setRadius(7);
        logInPanelShadow.setOffsetX(0);
        logInPanelShadow.setOffsetY(0);


        Rectangle logInPanel = new Rectangle(300, 450);
        logInPanel.setFill(
                new LinearGradient(
                        0,0,1,0,true, CycleMethod.NO_CYCLE, new Stop(0,Color.web("#2a2a2a")),new Stop(1,Color.web("#1a1a1a"))
                )


        );
        logInPanel.setEffect(logInPanelShadow);
        logInPanel.setLayoutX(300);
        logInPanel.setLayoutY(70);
//-------------------------------------------------------------------------









//     -------------         BORDER                ------------------
        Line top = new Line(0,0,900,0);
        top.setStroke(neonGreen);
        top.setStrokeWidth(5);
        Line left  = new Line(0,0,0,600);
        left.setStroke(neonGreen);
        left.setStrokeWidth(5);
        Line bottom = new Line(0,600,900,600);
        bottom.setStroke(neonGreen);
        bottom.setStrokeWidth(5);
        Line right = new Line(900,0,900,600);
        right.setStroke(neonGreen);
        right.setStrokeWidth(5);
//     -------------------------------------------------------------------

        Rectangle draggableRectangle = new Rectangle(900,40);
        draggableRectangle.setFill(new LinearGradient(
                0,0,1,0,true, CycleMethod.NO_CYCLE, new Stop(0,Color.web("#1a1a1a")),new Stop(1,Color.web("#2a2a2a"))
        ));

        Button exitButton = new Button("X");
        exitButton.setLayoutX(857.5);
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
        minimizeButton.setLayoutX(818.5);
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











        root.getChildren().addAll(draggableRectangle,logInPanel,PanelTitle,titleApplication,dLine1,dLine2,dLine3,right,bottom,left,top,minimizeButton,exitButton);
        Scene scene = new Scene(root, 900, 600,Color.BLACK);
        draggableRectangle.setOnMousePressed(e -> {
            XOffset = e.getScreenX() - stage.getX();
            YOffset = e.getScreenY() - stage.getY();
        });

        draggableRectangle.setOnMouseDragged(e -> {
            stage.setX(e.getScreenX() - XOffset);
            stage.setY(e.getScreenY() - YOffset);
        });
        stage.setTitle("Log-In Page");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }




}
