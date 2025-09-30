package exercise3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RecursiveDirectorySaver {
    private final String outputFile;

    public RecursiveDirectorySaver(String outputFile) {
        this.outputFile = outputFile;
    }

    public void save(List<FileInfo> files) throws IOException {
        File file = new File(outputFile);

        file.getParentFile().mkdirs();

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (FileInfo f : files) {
                String indent = " ".repeat(f.getLevel() * 2);
                String type = f.isDirectory() ? "(D)" : "(F)";
                String lastModified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                        .format(new Date(f.getLastModified()));

                writer.println(indent + f.getName() + " " + type + " " + lastModified);
            }
        }
    }
}
