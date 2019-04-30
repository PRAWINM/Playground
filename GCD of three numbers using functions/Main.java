import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int n4=gcd_of_2_no(n1,n2);
      System.out.println(gcd_of_2_no(n4,n3));
	}
  public static int gcd_of_2_no(int n1,int n2)
  {
    int min_element,gcd=0;
    if(n1<n2)
    {
      min_element=n1;
    }
    else
    {
      min_element=n2;
    }
    while(min_element>=1)
    {
      if((n1%min_element==0)&&(n2%min_element==0))
      {
        gcd=min_element;
        break;
      }
      min_element--;
    }
    return gcd;
  }
}