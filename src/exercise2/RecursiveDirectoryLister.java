package exercise2;

import common.FileInfo;
import common.RecursiveDirectoryService;

import java.io.File;
import java.util.List;

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

        RecursiveDirectoryService service = new RecursiveDirectoryService();
        RecursiveDirectoryPrinter printer = new RecursiveDirectoryPrinter();

        List<FileInfo> files = service.listRecursive(dir, 0);
        printer.print(files);
    }
}
