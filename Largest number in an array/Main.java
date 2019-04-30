import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i]=in.nextInt();
      }
      int t;
      for(int i=0;i<=n-1;i++)
      {
        for(int j=i+1;j<=n-1;j++)
        {
          if(a[i]>a[j])
          {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
          }
        }
      }
      System.out.print(a[n-1]);
    }
}