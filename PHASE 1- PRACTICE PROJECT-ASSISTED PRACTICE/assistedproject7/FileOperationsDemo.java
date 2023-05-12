package assistedproject7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperationsDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("example.txt");

        try {
            // Create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter(file);
            System.out.print("Enter text to write to file: ");
            String text = input.nextLine();
            writer.write(text);
            writer.close();
            System.out.println("Text written to file.");

            // Read from the file
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

            // Update the file
            writer = new FileWriter(file, true); // Set append mode to true
            System.out.print("Enter text to append to file: ");
            text = input.nextLine();
            writer.write("\n" + text); // Add a new line before appending
            writer.close();
            System.out.println("Text appended to file.");

            // Delete the file
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}