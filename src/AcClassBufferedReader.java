import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class AcClassBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age ::");
        int age=s.nextInt();
        System.out.println("Enter yor String::");
        String  str=b.readLine();
        System.out.println("my age is :"+age);
        System.out.println(str);
        System.out.println(str.length());
        String name=System.console().readLine();;
        System.out.println("your enter string is"+name);
    }
}
