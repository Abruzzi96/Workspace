package Mert;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class AsymmetricEncryption {
    public static String printBytes(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        String data = "Mert";
        byte[] plainText;
        byte[] encryptedText;
        byte[] decryptedText;
        Cipher cipher;
        plainText = data.getBytes();
        System.out.println("Original data : " + data);
        System.out.println("Original byte[] :" + printBytes(plainText));

        //step1 generates keys

        byte[] keyBytes = Files.readAllBytes(new File("src/Keys/privateKey").toPath());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(spec);

        keyBytes = Files.readAllBytes(new File("src/Keys/publicKey").toPath());
        X509EncodedKeySpec spec1 = new X509EncodedKeySpec(keyBytes);
        PublicKey publicKey = keyFactory.generatePublic(spec1);

        //step2 create cipher
        cipher = Cipher.getInstance("RSA");

        //step3 choose a method
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);

        //step4 perform the op.
        encryptedText = cipher.doFinal(plainText);
        System.out.println("Encrypted data : " + printBytes(encryptedText));
        String msgBase64 = Base64.getEncoder().encodeToString(encryptedText);
        System.out.println("Base64 in type : " + msgBase64);

        //step5 decrypt the data
        cipher.init(Cipher.DECRYPT_MODE,privateKey);
        decryptedText = cipher.doFinal(encryptedText);
        System.out.println("Decrypted data : " + printBytes(decryptedText));
        System.out.println("Decrypted text : " + new String(decryptedText));
    }
}
