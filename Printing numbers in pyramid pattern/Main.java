import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
    	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=1;
      for(int row_no=1;row_no<=n;row_no++)
      {
        for(int sp=1;sp<=(n-row_no);sp++)
        {
          System.out.print(" ");
        }
        for(int col_no=1;col_no<=row_no;col_no++)
        {
          System.out.print(num+" ");
          num=num+1;
        }
        System.out.print("\n");
      }
    }    
}