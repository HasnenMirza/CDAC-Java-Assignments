package createClasses.java;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

class FieldInfo {
    String modifier;
    String type;
    String name;

    public FieldInfo(String modifier, String type, String name) {
        this.modifier = modifier;
        this.type = type;
        this.name = name;
    }
}

public class CreateJavaClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter package name (e.g., com.example): ");
        String packageName = scanner.nextLine().trim();

        System.out.print("Enter class access modifier (public, default [press Enter for default]): ");
        String classModifier = scanner.nextLine().trim();

        System.out.print("Enter class name (e.g., Person): ");
        String className = scanner.nextLine().trim();

        System.out.print("Enter the number of variables to add: ");
        int varCount = 0;
        try {
            varCount = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered. Defaulting to 0 variables.");
        }

        List<FieldInfo> fields = new ArrayList<>();
        for (int i = 0; i < varCount; i++) {
            System.out.println("\n--- Variable " + (i + 1) + " ---");
            System.out.print("Enter access modifier (private, public, protected, or press Enter for default): ");
            String mod = scanner.nextLine().trim();

            System.out.print("Enter data type (e.g., String, int, double): ");
            String type = scanner.nextLine().trim();

            System.out.print("Enter variable name: ");
            String name = scanner.nextLine().trim();

            fields.add(new FieldInfo(mod, type, name));
        }

        // Construct source code structure
        StringBuilder sourceCode = new StringBuilder();

        if (!packageName.isEmpty()) {
            sourceCode.append("package ").append(packageName).append(";\n\n");
        }

        if (!classModifier.isEmpty()) {
            sourceCode.append(classModifier).append(" ");
        }
        sourceCode.append("class ").append(className).append(" {\n\n");

        // Write class member variables
        for (FieldInfo field : fields) {
            sourceCode.append("    ");
            if (!field.modifier.isEmpty()) {
                sourceCode.append(field.modifier).append(" ");
            }
            sourceCode.append(field.type).append(" ").append(field.name).append(";\n");
        }

        sourceCode.append("}\n");

        // Write content to <className>.java file
        String fileName = className + ".java";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(sourceCode.toString());
            System.out.println("\n[Suc cess] Generated file: " + fileName);
        } catch (IOException e) {
            System.err.println("[Error] Failed to write file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}