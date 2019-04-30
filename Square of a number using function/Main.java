import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int s;
    s=num*num;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      n=square(n);
      System.out.print(n);
	} 
}