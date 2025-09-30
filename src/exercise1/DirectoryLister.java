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
        DirectoryService service = new DirectoryService();
        DirectoryPrinter printer = new DirectoryPrinter();

        try {
            String[] files = service.listDirectory(dir);
            printer.printFiles(files);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
