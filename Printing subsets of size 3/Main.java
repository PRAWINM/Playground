import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      sub(arr,n);
    }
  public static void sub(int arr[],int n)
  {
    for(int i1=0;i1<=(n-2);i1++)
    {
      for(int i2=i1+1;i2<=(n-1);i2++)
      {
        for(int i3=i2+1;i3<=(n-1);i3++)
        {
          System.out.print("("+arr[i1]+","+" "+arr[i2]+","+" "+arr[i3]+")"+" ");
        }
      
      }
       System.out.print("\n");
    }
  }
}
