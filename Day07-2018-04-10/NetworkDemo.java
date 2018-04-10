// Thanks John Ghidiu

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

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

public class NetworkDemo extends Application {
    public static void main (String[] args) {
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception {

        primaryStage.setTitle("AOL IM 2.0");
        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20,20,20,20));

        Label messageLabel = new Label("MESSAGE:");
        grid.add(messageLabel,0,0);

        TextField messageTextField = new TextField();
        grid.add(messageTextField,0,1);

        Label responseLabel = new Label("RESPONSE");
        grid.add(responseLabel,1,0);

        TextField responseTextField = new TextField();
        responseTextField.setDisable(true);
        grid.add(responseTextField,1,1);

        Button doItButton = new Button("SEND");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(doItButton);
        grid.add(hbBtn,1,2);


        doItButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                try {
//                responseTextField.setText(messageTextField.getText().toUpperCase());
                    String host = "localhost";
                    int port = 1234;

                    Socket socket = new Socket(host, port);
                    BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    socketWriter.write(messageTextField.getText() + "\n");
                    socketWriter.flush();

                    String response = socketReader.readLine();
                    responseTextField.setText(response);

                    socketWriter.close();
                    socketReader.close();
                    socket.close();

                } catch (Exception exception) {
                    responseTextField.setText("ERROR: " + exception.getMessage());
                    exception.printStackTrace(System.err);
                }

            }
        });


        Scene scene = new Scene(grid,275,175);
        primaryStage.setScene(scene);

        primaryStage.show();

        System.err.print("TEST ERROR");


    }
}









