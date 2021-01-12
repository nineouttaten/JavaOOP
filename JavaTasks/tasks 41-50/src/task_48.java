import java.nio.charset.StandardCharsets;
import java.security.*;
public class task_48 {
    public static String getSha256Hash(String a) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(a.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b: hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            return "Error";
        }
    }
    public static void main(String[] args) {
        System.out.println(getSha256Hash("password123") );
        System.out.println(getSha256Hash("Fluffy@home")  );
        System.out.println(getSha256Hash("Hey dude!")  );
    }
}
