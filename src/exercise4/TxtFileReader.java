package exercise4;

import common.FileValidator;

import java.io.File;
import java.io.IOException;

public class TxtFileReader {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the path to a .txt file as argument.");
            return;
        }

        File file = new File(args[0]);

        if (!FileValidator.isNonEmptyFile(file) && !FileValidator.isValidFile(file)) {
            return;
        }

        TxtFileService service = new TxtFileService();
        try {
            service.readAndPrint(file);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

}
