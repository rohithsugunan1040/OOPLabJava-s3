package cycle4;
//import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {
    static void createFile() {
        File file = new File("/home/mec/rohithc3/exp4/text_files/abc.txt");
        boolean result;
        try {
          result = file.createNewFile();
          if (result) {
            System.out.println("file created");
          } else
            System.out.println("File exists ");
        } catch (IOException exception) {
          System.out.println("unexepected error occured ");
        }
      }
    
      static void writeFile(String str) {
        try {
          FileWriter fw = new FileWriter("/home/mec/rohithc3/exp4/text_files/abc.txt");
          fw.write(str);
          fw.close();
        } catch (IOException exception) {
          System.out.println("unexepected error occured ");
        }
      }
    
      static void readFile() {
        try {
          FileReader fr = new FileReader("/home/mec/rohithc3/exp4/text_files/abc.txt");
          int ro = fr.read();
          while (ro != -1) {
            System.out.println((char) ro);
            ro = fr.read();
          }
          fr.close();
        } catch (IOException exception) {
          System.out.println("unexpected error ocured");
        }
      }
    
      public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        str = sc.nextLine();
        createFile();
        writeFile(str);
        readFile();
        sc.close();
    
      }
    
    }

