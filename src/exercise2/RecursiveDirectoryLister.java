package exercise2;

import java.io.File;

public class RecursiveDirectoryLister {

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

        listDirectoryRecursive(dir);
    }

    private static void listDirectoryRecursive(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            System.out.println(file.getName());
            if (file.isDirectory()) {
                listDirectoryRecursive(file);
            }
        }
    }

}
