import java.util.Scanner;

public class Main {    
    public static void main (String args[])
    {
       Scanner in=new Scanner(System.in);
       String s1=in.nextLine();
       float f = Float.valueOf(s1);
       
       System.out.print(f);
    }
}