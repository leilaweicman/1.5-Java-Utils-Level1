package exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryService {

    public String[] listDirectory(File dir) {
        if (!dir.exists() || !dir.isDirectory()) {
            throw new IllegalArgumentException("The provided path is not a valid directory: " + dir.getPath());
        }

        String[] list = dir.list();
        if (list == null) {
            throw new IllegalStateException("Error accessing directory: " + dir.getPath());
        }

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }
}
