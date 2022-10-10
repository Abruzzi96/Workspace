package Ayberk;

import com.sun.security.jgss.GSSUtil;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class AsymmetricEncryption {
    public static String printBytes(byte[] bytes){
        StringBuilder depo = new StringBuilder();
        for (byte b : bytes){
            depo.append(String.format("%02X:", b));
        }
        return depo.toString().substring(0,depo.toString().length()-1);
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        String msg = "Ayberk";
        byte[] plainText;
        byte[] encryptedText;
        byte[] decryptedText;
        Cipher cipher;

        plainText = msg.getBytes();
        System.out.println("Original Data: " + msg);
        System.out.println("Original Byte Array: " + printBytes(plainText) + "\n");

        // STEP1 Generate the Keys
        byte[] keyBytes = Files.readAllBytes(new File("KeyStore/privateKey").toPath());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = kf.generatePrivate(spec);

        keyBytes = Files.readAllBytes(new File("KeyStore/publicKey").toPath());
        X509EncodedKeySpec spec1 = new X509EncodedKeySpec(keyBytes);
        PublicKey publicKey = kf.generatePublic(spec1);

        // STEP 2: Get a Cipher for the desired transformation
        cipher = Cipher.getInstance("RSA");

        // STEP 3: Choose a method
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);

        // Step 4: Perform the operation
        encryptedText = cipher.doFinal(plainText);
        System.out.println("Encyrpted Data: " + printBytes(encryptedText));
        String msgBase64 = Base64.getEncoder().encodeToString(encryptedText);
        System.out.println("Base64 Encoded String: " + msgBase64);

        // STEP 5: Undo the operation

        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        decryptedText = cipher.doFinal(encryptedText);
        System.out.println("Decrypted Data: " + printBytes(decryptedText));
        System.out.println("Decrypted Text: " + new String(decryptedText));

    }
}
