// Thanks John Ghidiu
// https://github.com/hal313/JavaFX-Networking-Threading-Concepts

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {

    private int port;

    public ReverseServer(int listenPort) {
        this.port = listenPort;
    }

    public void start() throws IOException {
        System.out.printf("Starting the server on port %d\n", port);
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("The server is listening...");

        while (true) {
            System.out.println("Waiting for a connection");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            System.out.println("Launching new thread to handle client connection.");
            startSocketConnectionAsThread(socket);

        }

    }


    private void startSocketConnectionAsThread(Socket socket) {

        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {

                    System.out.println("Handling client connection");
                    handleSocketConnection(socket);

                } catch (Exception exception) {
                    System.err.printf("There was a problem with a connection: %s", exception.getMessage());
                    exception.printStackTrace(System.err);
                }
            }
        });

        thread.start();
    }

    private void handleSocketConnection(Socket socket) throws IOException {

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = socketReader.readLine();
        System.out.printf("Read message '%s'\n", message);

        String response = "";
        for (int i = message.length()-1; i >= 0; i--) {
            response += message.charAt(i);
        }

        response += "\n";

        BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        System.out.printf("Sending response '%s'", response);
        socketWriter.write(response);

        socketWriter.flush();
        socketWriter.close();
        socketReader.close();

        socket.close();
        System.out.println("Close client connection");

    }

    public static void main (String[] args) {
        try {
            new ReverseServer(1234).start();
        } catch (Exception exception) {
            System.err.printf("There was a problem establishing a connection: %s", exception.getMessage());
            exception.printStackTrace(System.err);
        }
    }





}













