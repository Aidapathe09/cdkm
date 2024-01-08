import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class Authentification {
    private static final int SALT_LENGH = 16;
    private static final String HASH_ALGORITHM = "SHA-256";


    public static byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[SALT_LENGH];
        random.nextBytes(salt);
        return salt;
    }



}
