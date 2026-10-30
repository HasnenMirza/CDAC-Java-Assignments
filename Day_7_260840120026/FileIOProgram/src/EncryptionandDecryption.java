import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptionandDecryption {
	public static void encryptAndSaveFile(String fileName, String text) {
        int key = 5;
        String encryptedText = "";

        for (int i = 0; i < text.length(); i++) {
            char c = (char) (text.charAt(i) + key);
            encryptedText += c;
        }

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(encryptedText);
            writer.close();
            System.out.println("File created and encrypted successfully!");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public static void readAndDecryptFile(String fileName) {
        int key = 5;
        String encryptedText = "";

        try {
            FileReader reader = new FileReader(fileName);
            int ch;
            while ((ch = reader.read()) != -1) {
                encryptedText += (char) ch;
            }
            reader.close();

            String decryptedText = "";
            for (int i = 0; i < encryptedText.length(); i++) {
                char c = (char) (encryptedText.charAt(i) - key);
                decryptedText += c;
            }

            System.out.println("Decrypted Content:");
            System.out.println(decryptedText);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
