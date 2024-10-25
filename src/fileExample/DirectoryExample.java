package fileExample;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author rajatsrivastava
 **/
public class DirectoryExample {
    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName)->{
            return  fileName.contains(".");
        };

        String[] contents = new File(".").list(filter);
        for (String file : contents) {
            System.out.println(file);
        }
        new File("myDirectory").mkdir();
    }
}
