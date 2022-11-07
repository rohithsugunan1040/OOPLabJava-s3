


import java.io.*;
import java.util.Scanner;

public class primefile {
    public static void main(String args[]) throws IOException {
        File file = new File("abc.txt");
        boolean result;
        result = file.createNewFile();
        if (result) {
            System.out.println("File created ");

        } else {
            System.out.println("File exists ");
        }
        System.out.println("enter any no ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        String s;

        FileWriter fw = new FileWriter("abc.txt");
        try {
            for (i = 2; i <= n / 2; i++) {
                s = Integer.toString(i);
                fw.write(s);

            }
            fw.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("unknown error IOException ");
            e.printStackTrace();
        }

        FileReader fr = new FileReader("abc.txt");
        int st = fr.read();
        System.out.println(st);
        fr.close();

    }

}
