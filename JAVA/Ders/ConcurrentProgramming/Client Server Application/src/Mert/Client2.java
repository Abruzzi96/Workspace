package Mert;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.SecureRandom;

public class Client2 {
    Socket socket;
    DataInputStream in;
    DataOutputStream out;

    public Client2(String address, int port) throws IOException {
        socket = new Socket(address,port);
        System.out.println("Connection success !");
        in = new DataInputStream(System.in);
        out = new DataOutputStream(socket.getOutputStream());
        String line2 = "";
        while (!line2.equals("Over")) {
            System.out.println("root: ");
            line2 = in.readLine();
            System.out.println("Entered ::" + line2);
            line2 = caesarCipher(line2, 5);
            line2 += "_5_";
            System.out.println("Ciphered Text : " + line2);
            System.out.println();
            out.writeUTF(line2);
        }

        in.close();
        out.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        new Client2("127.0.0.1", 5000);
    }
    static String caesarCipher(String str, int offset) {
        str = str.toUpperCase();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++){
            int currentChar2 = (int)chars[i];
            currentChar2 += offset;
            currentChar2 %= 90;

            if (currentChar2 < 65)
                currentChar2 = currentChar2 + 64;

            chars[i] = (char)currentChar2;
        }
        return new String(chars);
    }
}
