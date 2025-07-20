import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class PasswortTresor {

    private static final String SCHLUESSEL = "1234567890123456"; // 16-Byte AES-Schlüssel (nur Demo)

    // Verschlüsselt einen Text mit AES und gibt Base64 zurück
    public static String verschluesseln(String daten) throws Exception {
        SecretKeySpec schluessel = new SecretKeySpec(SCHLUESSEL.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, schluessel);
        return Base64.getEncoder().encodeToString(cipher.doFinal(daten.getBytes()));
    }

    // Entschlüsselt einen zuvor verschlüsselten Base64-Text
    public static String entschluesseln(String verschluesselt) throws Exception {
        SecretKeySpec schluessel = new SecretKeySpec(SCHLUESSEL.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, schluessel);
        return new String(cipher.doFinal(Base64.getDecoder().decode(verschluesselt)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🔐 Sicherer Passwort-Tresor");
        System.out.print("Geben Sie ein Passwort zur Verschlüsselung ein: ");
        String eingabe = scanner.nextLine();

        try {
            String verschluesselt = verschluesseln(eingabe);
            System.out.println("Verschlüsselt: " + verschluesselt);

            String entschluesselt = entschluesseln(verschluesselt);
            System.out.println("Entschlüsselt: " + entschluesselt);
        } catch (Exception e) {
            System.err.println("Verschlüsselungsfehler: " + e.getMessage());
        }
    }
}
