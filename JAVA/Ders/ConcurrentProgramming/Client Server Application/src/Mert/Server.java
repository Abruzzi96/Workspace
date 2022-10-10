package Mert;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Socket socket;
    ServerSocket server;
    DataInputStream in;

    public Server(int port) throws IOException {
        server = new ServerSocket(port);
        System.out.println("Server Started ! ");
        socket = server.accept();
        System.out.println("Client accepted!");
        in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        String line = "";

        while (!line.equals("Over")){
            line = in.readUTF();
            System.out.println("Client Says : " + line);
        }
        System.out.println("Connection is closing now!");
        server.close();
        socket.close();
        in.close();
    }

    public static void main(String[] args) throws IOException {
        new Server(5000);
    }
}
