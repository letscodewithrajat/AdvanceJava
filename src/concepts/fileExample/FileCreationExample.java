package concepts.fileExample;

import java.io.File;
import java.io.IOException;

/**
 * @author rajatsrivastava
 **/
public class FileCreationExample {

    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        try {
           boolean fileCreated =  myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException e) {

        }
    }
}
