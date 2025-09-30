package exercise2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveDirectoryService {
    public List<FileInfo> listRecursive(File dir, int level) {
        List<FileInfo> result = new ArrayList<>();
        File[] files = dir.listFiles();
        if (files == null) return result;

        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

        for (File file : files) {
            result.add(new FileInfo(file.getName(), file.isDirectory(), file.lastModified(), level));
            if (file.isDirectory()) {
                result.addAll(listRecursive(file, level + 1));
            }
        }
        return result;
    }
}
