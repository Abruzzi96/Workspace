package Ayberk;

import javax.crypto.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SymmetricKeyExample {
    public static String printBytes(byte[] data){
        StringBuilder sb = new StringBuilder();

        for(byte b : data){
            sb.append(String.format("%02X:",b));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String msg = "My name is Ayberk SAYGI.";
        byte[] plain_text;
        byte[] encrypted_text;
        byte[] decrypted_text;
        Cipher cipher;

        try {
            plain_text = msg.getBytes("UTF-8");
            System.out.println("Original Data: " + msg);
            System.out.println("Byte Array:" + printBytes(plain_text));

            // STEP 1: GENERATE THE KEYS
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            keyGenerator.init(256,secureRandom);
            SecretKey secretKey = keyGenerator.generateKey();

            // STEP 2: Get a Cipher for the desired transformation
            cipher = Cipher.getInstance("AES");

            // STEP 3: Choose a method
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);

            // STEP 4: Perform the operation
            encrypted_text = cipher.doFinal(plain_text);
            System.out.println("Encrypted Data: " + printBytes(encrypted_text));

            // STEP 5: Undo the operation
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            decrypted_text = cipher.doFinal(encrypted_text);
            System.out.println("Decrypted Data: " + printBytes(decrypted_text));
            System.out.println("Decrypted Text: " + new String(decrypted_text));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchPaddingException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        } catch (BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}
