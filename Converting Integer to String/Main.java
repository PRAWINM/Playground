import java.util.Scanner;
public class Main {    
    public static void main (String args[])
    {
       Scanner in=new Scanner(System.in);
       String s1=in.nextLine();
       int output= stringToint(s1);
       System.out.println(output);
    }
    
    
    public static int stringToint( String str ){
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = str.length();
        if(str.charAt(0)=='-'){
            isNegative = true;
            i = 1;
        }
        while(i<len){
            number *= 10;
            number+=(str.charAt(i++)-'0');
        }
        if(isNegative)
        number=-number;
        return number;
    }   
}