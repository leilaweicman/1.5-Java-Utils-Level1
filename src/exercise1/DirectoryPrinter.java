package exercise1;

public class DirectoryPrinter {
    public void printFiles(String[] files) {
        if (files.length == 0) {
            System.out.println("The directory is empty.");
        } else {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }
}
