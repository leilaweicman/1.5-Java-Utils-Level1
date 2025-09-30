package exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RecursiveDirectoryPrinter {
    public void print(List<FileInfo> files) {
        for (FileInfo file : files) {
            String indent = " ".repeat(file.getLevel() * 2);
            String type = file.isDirectory() ? "(D)" : "(F)";
            String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .format(new Date(file.getLastModified()));
            System.out.println(indent + file.getName() + " " + type + " " + lastModified);
        }
    }
}
