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
      int val=in.nextInt();
      pair(arr,n,val);
    }
  public static void pair(int arr[],int n,int val)
  {
    for(int i1=0;i1<=(n-1);i1++)
    {
      int f=arr[i1];
      for(int i2=i1+1;i2<=(n-1);i2++)
      {
        int s=arr[i2];
        if((f+s)==val)
        {
          System.out.println(arr[i1]+", "+arr[i2]);
        }
      }
    }
  }
}
