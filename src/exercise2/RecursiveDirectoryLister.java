package exercise2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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

        listDirectoryRecursive(dir, 0);
    }

    private static void listDirectoryRecursive(File dir, int level) {
        File[] files = dir.listFiles();
        if (files == null) return;

        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

        for (File file : files) {
            printFileInfo(file, level);
            if (file.isDirectory()) {
                listDirectoryRecursive(file, level + 1);
            }
        }
    }

    private static void printFileInfo(File file, int level) {
        String indent = " ".repeat(level * 2);
        String type = file.isDirectory() ? "(D)" : "(F)";
        String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(new Date(file.lastModified()));
        System.out.println(indent + file.getName() + " " + type + " " + lastModified);
    }

}
