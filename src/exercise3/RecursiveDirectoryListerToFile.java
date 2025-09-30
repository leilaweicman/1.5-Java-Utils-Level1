package exercise3;

import common.FileInfo;
import common.RecursiveDirectoryService;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RecursiveDirectoryListerToFile {

    private static final String OUTPUT_FILE = "exercise3" + File.separator + "output.txt";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the path to a directory as argument.");
            return;
        }

        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("The provided path is not a valid directory.");
            return;
        }

        RecursiveDirectoryService service = new RecursiveDirectoryService();
        RecursiveDirectorySaver saver = new RecursiveDirectorySaver(OUTPUT_FILE);

        try {
            List<FileInfo> files = service.listRecursive(dir, 0);
            saver.save(files);
            System.out.println("Directory contents saved to " + OUTPUT_FILE);
        } catch (IOException e) {
            System.out.println("An error occurred while saving directory contents.");
            e.printStackTrace();
        }
    }


}
