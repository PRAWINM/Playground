import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int a[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        a[i]=in.nextInt();
      }
      int s_e1=in.nextInt();
      int s_e2=in.nextInt();
      int c=0;
      for(int i=0;i<=arr_size-1;i++)
      {
        if(s_e1==a[i])
        {
          System.out.println(i);
          
        }
        else if(s_e2==a[i])
        {
          System.out.println(i);
          c=1;
        }
      }
      if(c==0)
      {
      System.out.print("-1");
      }
    }
}