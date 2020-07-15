// doggo.jpg came from: https://unsplash.com/photos/vT9SSvrAncY

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {

    public static void main(String[] args) {
        System.out.println("TESTING JAVAFX");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Sweet, sweet text
        Text scenetitle = new Text("Welcome!");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 30)); // Fashion
        grid.add(scenetitle,0,0,2,1);


        // Sweet, sweet label
        Label userName = new Label("User Name:");
        grid.add(userName,0,1);

        // Sweet, sweet text field
        TextField userTextField = new TextField();
        grid.add(userTextField,1,1);

        Label pw = new Label("Password:");
        grid.add(pw,0,2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox,1,2);

        Image img = new Image("doggo.jpg");
        ImageView imgView = new ImageView(img);
        grid.add(imgView,0,3,2,1);

        Button btn = new Button("Login");
        HBox hbBtn = new HBox(10);
        hbBtn.getChildren().add(btn);

        Button btn2 = new Button("Tip of the day");
        hbBtn.getChildren().add(btn2);

        Button btn3 = new Button("Quit");
        hbBtn.getChildren().add(btn3);

        grid.add(hbBtn,0,4,2,1);

        Label actiontarget = new Label();
        grid.add(actiontarget,0,5,2,1);


        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                System.out.println("'Login' PRESSED");
                actiontarget.setText("Incorrect username or password.");
            }

        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                System.out.println("'Tip-O-The-Day' PRESSED");
                actiontarget.setStyle("-fx-padding:10px; -fx-border-color:red; -fx-background-color:lightblue;");
                actiontarget.setText("Make coffee cubes for iced coffee.");
            }

        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                System.out.println("'QUIT' PRESSED");
                System.exit(0);
            }

        });













        Scene scene = new Scene(grid, 500, 775);
        primaryStage.setScene(scene);
        primaryStage.show();











    }
}

