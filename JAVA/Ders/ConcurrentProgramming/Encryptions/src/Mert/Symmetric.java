package Mert;

import javax.crypto.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Symmetric {
    public static String printBytes(byte[] bytes) {
        StringBuilder depo = new StringBuilder();
        for (byte b : bytes) {
            depo.append(String.format("%02X:", b));
        }
        return depo.toString().substring(0, depo.toString().length() - 1);
    }

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        String pass = "Aldo";
        byte[] plainText;
        byte[] encText;
        byte[] decText;
        Cipher cipher;

        plainText = pass.getBytes();
        System.out.println("Pass: " + pass);
        System.out.println("Byte Pass : " + printBytes(plainText) + "\n");

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secure = new SecureRandom();
        keyGen.init(256,secure);
        SecretKey secretKey = keyGen.generateKey();

        cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        encText = cipher.doFinal(plainText);
        System.out.println("Encrypted Data : " + printBytes(encText));
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        decText = cipher.doFinal(encText);
        System.out.println("Decrypted Data : " + printBytes(decText));
        System.out.println("Decrypted Text : " + new String(decText));
    }
}
