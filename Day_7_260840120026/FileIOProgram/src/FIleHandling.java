import java.io.File;
import java.util.Scanner;
import java.io.*;

public class FIleHandling {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CREATE_NEW_FILE = 1;
        final int DECRYPT_FILE = 2;
        final int EXIT = 3;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Create and Encrypt File");
            System.out.println("2. Decrypt File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case CREATE_NEW_FILE:
                    System.out.print("Enter file name: ");
                    String fileName1 = scanner.nextLine();
                    System.out.print("Enter text to encrypt: ");
                    String text = scanner.nextLine();
                    EncryptionandDecryption.encryptAndSaveFile(fileName1, text);
                    break;
                case DECRYPT_FILE:
                    System.out.print("Enter file name to decrypt: ");
                    String fileName2 = scanner.nextLine();
                    EncryptionandDecryption.readAndDecryptFile(fileName2);
                    break;
                case EXIT:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

}
