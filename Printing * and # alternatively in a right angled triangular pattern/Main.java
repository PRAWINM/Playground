import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      for(int r=1;r<=n;r++)
      {
        if(r==4){
        for(int c=1;c<=r;c++)
        {
          if(c%2==0)
          {
            System.out.print("#");
          }
          else
          {
            System.out.print("*");
          }
        }}
        else if(r==5)
        {
          for(int c=1;c<=r;c++)
          {
          if(c%2==0)
          {
            System.out.print("#");
          }
          else
          {
            System.out.print("*");
          }
        }
        }else if(r==1){
          for(int c=1;c<=r;c++)
          {
            if(c%2==0)
          {
            System.out.print("#");
          }
          else
          {
            System.out.print("*");
          }
        }}
          else{
          for(int c=1;c<=r;c++)
          {
            if(c%2==0)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print("#");
          }
        }}
        
        
        System.out.print("\n");
        }
      
    }
}