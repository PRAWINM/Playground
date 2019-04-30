import java.util.Scanner;
class Main
{ 
    
  static boolean areRotations(String st1, String st2) 
    {    
     if (st1.length() != st2.length())
      {  
            return false;  
      }  
      String st3 = st1 + st1;  
      if (st3.contains(st2))  
          return true;  
      else  
          return false;  
    } 
      
  
    public static void main (String[] args) 
    { 
        Scanner in=new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        if(areRotations(str1, str2))
         {
            System.out.print("Yes");
         } 
        else
        {
            System.out.print("No"); 
        }
    } 
} 