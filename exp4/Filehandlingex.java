import java.io.*;
import java.util.Scanner;
public class Filehandlingex {
    public static void main(String args[]) throws IOException
 {
   char[] array=new char[200];
   try{
    FileReader f3=new FileReader("/home/mec/rohithc3/file.txt");
    f3.read(array);
    System.out.println("The file Contains \n ");
    System.out.println(array);
    f3.close();
   }

    catch (FileNotFoundException e)
    {
      throw new FileNotFoundException("File Not Found"); 
    }
catch(IOException e)
    {   
       throw new IOException("Error Occured");
    }

    try{
        FileWriter f=new FileWriter("/home/mec/rohithc3/file.txt");
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ro be added ");
        str=sc.nextLine();
        f.write(str);
        sc.close();
        f.close();
        System.out.println("Succesfully written ");
    
       }
       catch (FileNotFoundException e)
       {
         throw new FileNotFoundException("File Not Found"); 
       }

       catch(IOException e){
        System.out.println("Error Occured");
         
       }

 char[] arr=new char[200];
 try{
  FileReader f3=new FileReader("/home/mec/rohithc3/file.txt");
  f3.read(arr);
  System.out.println("The file Contains \n --------------");
  System.out.println(arr);
  f3.close();
 }

  catch (FileNotFoundException e)
  {
    throw new FileNotFoundException("File Not Found"); 
  }
catch(IOException e)
  {   
     throw new IOException("Error Occured");
  }
 }
}
