package Mert;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.SecureRandom;

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
        while (!line.equals("Over")) {
            System.out.print("root:~# ");
            line = in.readLine();
            System.out.println("Entered Line: " + line);
            line = caesarCipher(line,5);
            line += "_5_";
            System.out.println("Ciphered Line: " + line);
            System.out.println();
            out.writeUTF(line);
        }

        in.close();
        out.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        new Client("127.0.0.1", 5000);
        throws Exception
        {
            SecretKey Symmetrickey
                    = createAESKey();
            System.out.println("Output");
            System.out.print("The Symmetric Key is :"
                    + DatatypeConverter.printHexBinary(
                    Symmetrickey.getEncoded()));
        }
    }

    static String caesarCipher(String str, int offset) {
        str = str.toUpperCase();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int currentChar = (int)chars[i];
            currentChar += offset;
            currentChar %= 90;

            if(currentChar < 65)
                currentChar = currentChar + 64;

            chars[i] = (char)currentChar;
        }

        return new String(chars);
    }

    public class symmmetric {
        public static final String AES = "AES";

        public static SecretKey createAESKey()
            throws exception
        {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keygenerator = KeyGenerator.getInstance(AES);

            keygenerator.init(256, securerandom);
            SecretKey key = keygenerator.generateKey();
            return key;
        }

        }
    }


}
