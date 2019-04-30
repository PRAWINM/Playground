import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int r=n;r>=1;r--)
      {
        int num=r;
        for(int c=1;c<=r;c++)
        {
          System.out.print(num);
          num=num-1;
        }
        System.out.print("\n");
      }
	}
}