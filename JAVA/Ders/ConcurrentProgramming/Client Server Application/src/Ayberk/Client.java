package Ayberk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    private Socket socket = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public Client(String address, int port){
        try {
            socket = new Socket(address,port);
            System.out.println("Connected!");

            in = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String line = "";
        while(!line.equals("Over")){
            try {
                System.out.print("Input: ");
                line = in.readLine();
                out.writeUTF(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            socket.close();
            in.close();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1",5000);
    }
}
