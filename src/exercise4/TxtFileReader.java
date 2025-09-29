package exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReader {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the path to a .txt file as argument.");
            return;
        }

        File file = new File(args[0]);

        if (!file.exists() || !file.isFile()) {
            System.out.println("The provided path is not a valid file.");
            return;
        }

        if (file.length() == 0) {
            System.out.println("The file is empty.");
            return;
        }

        readFileAndPrint(file);
    }

    private static void readFileAndPrint(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

}
