package LoginWindow;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class MainLogInWindow extends Application{
    private double XOffset = 0;
    private double YOffset = 0;
    @Override
    public void start(Stage stage){

        Pane root = new Pane();
        stage.initStyle(StageStyle.UNDECORATED);
        root.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 0%, #1a1a1a, #2a2a2a);");

        //Font font = Font.loadFont(getClass().getResourceAsStream("/fonts/Play-Regular.ttf"), 14);
        //System.out.println("Font loaded: " + font);





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
        //titleApplication.setFont(font);

//-----------------------------LOG IN PANEL -----------------------------------
        Label PanelTitle = new Label("Log in");
        PanelTitle.setStyle("-fx-text-fill: white; -fx-font-size:20px; -fx-font-weight:bold;");
      //  PanelTitle.setFont(Font.font("Play",14));
        PanelTitle.setLayoutX(420);
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


        Image openedEyeImage = new Image("file:C:\\Users\\Gaming\\IdeaProjects\\JavaFX Application\\src\\images\\open.png");
        Image closedEyeImage = new Image("file:C:\\Users\\Gaming\\IdeaProjects\\JavaFX Application\\src\\images\\close.png");
        Image mainAppLogo = new Image("file:C:\\Users\\Gaming\\IdeaProjects\\JavaFX Application\\src\\images\\XPulse_Launcher.png");

        DropShadow appLogoShadow = new DropShadow();
        appLogoShadow.setColor(Color.GRAY);
        appLogoShadow.setRadius(10);
        appLogoShadow.setOffsetX(0);
        appLogoShadow.setOffsetY(0);

        ImageView mainAppLogoView = new ImageView(mainAppLogo);
        mainAppLogoView.setFitWidth(160);
        mainAppLogoView.setFitHeight(160);
        mainAppLogoView.setLayoutX(370);
        mainAppLogoView.setLayoutY(120);
        mainAppLogoView.setEffect(appLogoShadow);
        mainAppLogoView.setOnMouseEntered(e->{
            appLogoShadow.setColor(Color.web("#39ff14"));
        });
        mainAppLogoView.setOnMouseExited(e->{
            appLogoShadow.setColor(Color.GRAY);
        });



        DropShadow textFieldShadow = new DropShadow();
        textFieldShadow.setColor(Color.WHITE);
        textFieldShadow.setSpread(0.5);
        textFieldShadow.setRadius(4);
        textFieldShadow.setOffsetX(0);
        textFieldShadow.setOffsetY(0);

        Label userNameLabel = new Label("Username: ");
        userNameLabel.setLayoutX(320);
        userNameLabel.setLayoutY(270);
        userNameLabel.setStyle("-fx-font-size: 15px; -fx-text-fill:#6f6f6f;");

        Label passwordLabel = new Label("Password: ");
        passwordLabel.setLayoutX(320);
        passwordLabel.setLayoutY(350);
        passwordLabel.setStyle("-fx-font-size: 15px; -fx-text-fill:#6f6f6f;");


        TextField userNameTextField = new TextField();
        userNameTextField.setLayoutX(320);
        userNameTextField.setLayoutY(300);
        userNameTextField.setPrefWidth(240);
        userNameTextField.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 0%, #2a2a2a,#1a1a1a);-fx-font-size: 14px; -fx-text-fill:white; -fx-border-color: gray ; -fx-border-width: 1; -fx-border-radius: 2;");
        userNameTextField.setOnMouseEntered(e->{
            userNameTextField.setEffect(textFieldShadow);
                }
                );
        userNameTextField.setOnMouseExited(e->{
            userNameTextField.setEffect(null);
        });








        PasswordField passwordTextField = new PasswordField();
        passwordTextField.setLayoutX(320);
        passwordTextField.setLayoutY(380);
        passwordTextField.setPrefWidth(240);
        passwordTextField.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 0%, #2a2a2a,#1a1a1a);-fx-font-size: 14px; -fx-text-fill:white; -fx-border-color: gray ; -fx-border-width: 1; -fx-border-radius: 2;");
        passwordTextField.setOnMouseEntered(e->{
                    passwordTextField.setEffect(textFieldShadow);
                }
        );
        passwordTextField.setOnMouseExited(e->{
           passwordTextField.setEffect(null);
        });

        TextField showPasswordTextField = new TextField();
        showPasswordTextField.setLayoutX(320);
        showPasswordTextField.setLayoutY(380);
        showPasswordTextField.setPrefWidth(240);
        showPasswordTextField.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 0%, #2a2a2a,#1a1a1a);-fx-font-size: 14px; -fx-text-fill:white; -fx-border-color: gray ; -fx-border-width: 1; -fx-border-radius: 2;");
        showPasswordTextField.setOnMouseEntered(e->{
                    showPasswordTextField.setEffect(textFieldShadow);
                }
        );
        showPasswordTextField.setOnMouseExited(e->{
            showPasswordTextField.setEffect(null);
        });

        showPasswordTextField.textProperty().bindBidirectional(passwordTextField.textProperty());

        DropShadow eyeShadow = new DropShadow();
        eyeShadow.setColor(Color.CYAN);
        eyeShadow.setRadius(1.8);
        eyeShadow.setOffsetX(0);
        eyeShadow.setOffsetY(0);

        ImageView closedEyeView = new ImageView(closedEyeImage);
        closedEyeView.setFitWidth(40);
        closedEyeView.setPreserveRatio(true);
        closedEyeView.setLayoutX(560);
        closedEyeView.setLayoutY(386.5);


        ImageView openedEyeView = new ImageView(openedEyeImage);
        openedEyeView.setFitWidth(40);
        openedEyeView.setPreserveRatio(true);
        openedEyeView.setLayoutY(387);
        openedEyeView.setLayoutX(560);
        openedEyeView.setOnMouseEntered(e->{
            openedEyeView.setEffect(eyeShadow);
        });
        openedEyeView.setOnMouseExited(e->{
            openedEyeView.setEffect(null);
        });
        openedEyeView.setOnMousePressed(e->{

            root.getChildren().removeAll(passwordTextField,openedEyeView);
            root.getChildren().addAll(showPasswordTextField,closedEyeView);
        });
        closedEyeView.setOnMouseEntered(e->{
            closedEyeView.setEffect(eyeShadow);
        });
        closedEyeView.setOnMouseExited(e->{
            closedEyeView.setEffect(null);
        });
        closedEyeView.setOnMousePressed(e->{

            root.getChildren().removeAll(showPasswordTextField,closedEyeView);
            root.getChildren().addAll(passwordTextField,openedEyeView);
        });


        Button logInButton = new Button("LOG IN");
        logInButton.setPrefWidth(100);
        logInButton.setPrefHeight(40);
        logInButton.setLayoutX(400);
        logInButton.setLayoutY(440);
        logInButton.setStyle("-fx-background-color:linear-gradient(from 0% 0% to 100% 0%, #252525,#1f1f1f); -fx-text-fill:#39ff14;-fx-font-size:18px;-fx-font-weight:bold;");
        logInButton.setOnMouseEntered(e->{
            logInButton.setStyle("-fx-background-color:#39ff14; -fx-text-fill:linear-gradient(from 0% 0% to 100% 0%, #252525,#1f1f1f);-fx-font-size:18px;-fx-font-weight:bold;");

        });
        logInButton.setOnMouseExited(e->{
            logInButton.setStyle("-fx-background-color:linear-gradient(from 0% 0% to 100% 0%, #252525,#1f1f1f); -fx-text-fill:#39ff14;-fx-font-size:18px;-fx-font-weight:bold;");

        });









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











        root.getChildren().addAll(draggableRectangle,logInPanel,logInButton,mainAppLogoView,openedEyeView,PanelTitle,passwordLabel,userNameLabel,passwordTextField,userNameTextField,titleApplication,dLine1,dLine2,dLine3,right,bottom,left,top,minimizeButton,exitButton);
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
        //System.out.println(javafx.scene.text.Font.getFamilies());

        launch();
    }




}
