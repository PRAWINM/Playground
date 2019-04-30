import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    // Type your code here
    Scanner in=new Scanner(System.in);
    String str1=in.nextLine();
    String str2=in.nextLine();
    
  
    int count = 0, fromIndex = 0;
     while ((fromIndex = str1.indexOf(str2, fromIndex)) != -1 ){
 
            //System.out.println(fromIndex);
            count++;
            fromIndex++;
            
        }
        
        System.out.println(count);
    
  } 
}