package inputOutput.bufferedReaderExample;


import java.io.*;

/**
 *
 * @author bethan
 */
public class BufferedReaderExample {

    public static void main(String[] args) {
        File myFile = new File("example.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
