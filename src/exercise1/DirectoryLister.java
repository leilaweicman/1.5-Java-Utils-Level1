package exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the path to a directory as argument.");
            return;
        }

        File dir = new File(args[0]);
        printDirectoryContents(dir);

    }

    private static void printDirectoryContents(File dir) {
        String[] list = dir.list();
        if (list == null) {
            System.out.println("Invalid directory: " + dir.getPath());
            return;
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for (String file: list) {
            System.out.println(file);
        }
    }
}
