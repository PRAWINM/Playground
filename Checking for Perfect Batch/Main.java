import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    sum(arr,n);
  }
  public static void sum(int arr[],int n)
  {
    int sum1=0,sum2=0;
    if(n%2==0){
    for(int i=0;i<n/2;i++)
    {
      sum1=sum1+arr[i];
    }
    for(int i=n/2;i<n;i++)
    {
      sum2=sum2+arr[i];
    }}
    else{
   for(int i=0;i<=n/2;i++)
    {
      sum1=sum1+arr[i];
    }
    for(int i=n/2;i<n;i++)
    {
      sum2=sum2+arr[i];
    }}
    if(sum1==sum2)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
  } 
}