package cycle4;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 

public class filehandlingex{
 
    
    public static void main(String[] args)
    {
 
        // Try block to check for exceptions
        try {
 
            FileReader fr = new FileReader("file1.txt");
 
            
            FileWriter fw = new FileWriter("gfgOutput.txt");
 
            
            String str = "";
 
            int i;
 
         
            while ((i = fr.read()) != -1) {
 
                // Storing every character in the string
                str += (char)i;
            }
 
            
            System.out.println(str);
 
            
            fw.write(str);
 
            
            fr.close();
            fw.close();
 
            // Display message
            System.out.println(
                "File reading and writing both done");
        }
 
        // Catch block to handle the exception
        catch (IOException e) {
 
            
            System.out.println(
                "There are some IOException");
        }
    }
}