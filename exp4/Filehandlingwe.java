import java.io.*;
import java.util.*;

public class Filehandlingwe {
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        try {
            Scanner reader = new Scanner(System.in);
            String readfile = reader.nextLine();
            String writefile = reader.nextLine();
            InputStream rFile = new FileInputStream(readfile);
            OutputStream wFile = new FileOutputStream(writefile);

            int i = rFile.read();
            while (i != -1) {
                wFile.write(i);
                i = rFile.read();
            }
            rFile.close();
            wFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNot found");
            throw e;
        } catch (IOException e) {
            System.out.println("IO exception");
            throw e;
        }
    }
}
