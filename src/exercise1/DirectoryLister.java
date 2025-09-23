package exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void main(String[] args) {

        File dir = new File(args[0]);
        String[] list = dir.list();
        System.out.println(Arrays.toString(list));

    }
}
