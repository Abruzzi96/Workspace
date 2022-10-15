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
            System.out.println("RECEIVED : " + line);
            String[] lineArray = line.split("_");
            line = decrypt(lineArray[0],lineArray[1]);
            System.out.println("DECRYPTED : " + line);
        }
        System.out.println("Connection is closing now!");
        server.close();
        socket.close();
        in.close();
    }

    private String decrypt(String str, String offset) {
        int offSet = Integer.parseInt(offset);
        char[] strChars = str.toCharArray();

        for(int i = 0; i<strChars.length; i++){
            int currentChar = (int)strChars[i];
            currentChar -= offSet;

            if(currentChar < 65)
                currentChar = currentChar + 26;
            strChars[i] = (char) currentChar;
        }
        return new String(strChars);
    }

    public static void main(String[] args) throws IOException {
        new Server(5000);
    }
}
