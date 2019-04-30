import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int temp,rem,sum=0,fact,i;
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      for(temp=num;temp>0;temp=temp/10)
      {
        fact=1;
        rem=temp%10;
        for(i=1;i<=rem;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
      }
      if(num==sum)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}