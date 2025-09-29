package exercise4;

import java.io.File;

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
    }
}
