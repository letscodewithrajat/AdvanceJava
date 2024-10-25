package fileExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author rajatsrivastava
 **/
public class PathClassExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Path path2 = Paths.get("AdvanceJava.iml");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
    }
}
