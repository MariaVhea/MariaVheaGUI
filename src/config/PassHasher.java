
package config;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


public class PassHasher {
    
  public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(hashBytes);
    }

    public static boolean verifyPassword(String inputPassword, String storedHash) {
        try {
            String hashedInput = hashPassword(inputPassword); 
            return hashedInput.equalsIgnoreCase(storedHash); 
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
