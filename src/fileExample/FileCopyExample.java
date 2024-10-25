package fileExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * @author rajatsrivastava
 **/
public class FileCopyExample {
    public static void main(String[] args) {

        Path source = Paths.get("myFile.txt");
        Path dest = Paths.get("newMyFile.txt");
        try {
            //Files.copy(source,dest);
            Files.copy(source,dest,REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
