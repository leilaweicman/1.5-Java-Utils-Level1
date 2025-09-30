package common;

import java.io.File;

public class FileValidator {
    public static boolean isValidDirectory(File dir) {
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("The provided path is not a valid directory.");
            return false;
        }
        return true;
    }

    public static boolean isValidFile(File file) {
        if (!file.exists() || !file.isFile()) {
            System.out.println("The provided path is not a valid file.");
            return false;
        }
        return true;
    }

    public static boolean isNonEmptyFile(File file) {
        if (!isValidFile(file)) {
            return false;
        }
        if (file.length() == 0) {
            System.out.println("The file is empty.");
            return false;
        }
        return true;
    }
}
