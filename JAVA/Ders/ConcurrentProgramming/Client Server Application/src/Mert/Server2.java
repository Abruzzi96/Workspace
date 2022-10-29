package Mert;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    Socket socket;
    ServerSocket server2;
    DataInputStream in;

    public Server2(int port) throws IOException {
        server2 = new ServerSocket(port);
        System.out.println("Server started successfully !");
        socket = server2.accept();
        System.out.println("Client accepted successfully !");
        in = new DataInputStream(new DataInputStream(socket.getInputStream()));

        String line2 = "";

        while (!line2.equals("Over")){
            line2 = in.readUTF();
            System.out.println("RECEIVED : " + line2);
            String[] lineArray2 = line2.split("_");
            line2 = decrypt(lineArray2[0],lineArray2[1]);
            System.out.println("DECRYPTED : " + line2);
        }
        System.out.println("Connection is closing..!");
        server2.close();
        socket.close();
        in.close();
    }
    private String decrypt(String str, String offset) {
        int offSet2 = Integer.parseInt(offset);
        char[] strChars = str.toCharArray();

        for (int i = 0; i<strChars.length; i++){
            int currentChar2 = (int)strChars[i];
            currentChar2 -= offSet2;

            if (currentChar2 < 65)
                currentChar2 = currentChar2 + 26;
            strChars[i] = (char) currentChar2;
        }
        return new String(strChars);
    }

    public static  void main(String[] args) throws IOException {
        new Server(5000);
    }

}
