import java.util.Scanner;
class Main{
  public static void prime(int num)
  {
    int i,j;
    for(i=1;i<=num;i++)
    {
      int c=0;
    for(j=2;j<=i/2;j++)
    {
      if(i%j==0)
      {
      c++;
      break;
      }
    }
      if(c==0&&i!=1)
      {
        System.out.println(i);
      }
    }
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
      
	}
}