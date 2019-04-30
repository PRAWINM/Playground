import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int c=1;
    for(int i=1;i<=n;i++)
    {
      if(c==3)
      {
      System.out.print(c+",");
      }
      else if(c==6)
      {
        System.out.print(c+",");
      }
      else if(c==9)
      {
        System.out.print(c+",");
      }
      else if(c==12)
      {
        System.out.print(c+",");
      }
      else
      {
        System.out.print(c);
      }
      
      c++;
    }
    
  }
}