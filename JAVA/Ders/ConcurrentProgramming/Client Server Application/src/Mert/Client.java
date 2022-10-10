package Mert;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    Socket socket;
    DataInputStream in;
    DataOutputStream out;

    public Client(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Connected!");
        in = new DataInputStream(System.in);
        out = new DataOutputStream(socket.getOutputStream());
        String line = "";
        while (!line.equals("Over")){
            System.out.print("root:~# ");
            line = in.readLine();
            out.writeUTF(line);
        }

        in.close();
        out.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        new Client("127.0.0.1", 5000);
    }
}
