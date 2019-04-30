import java.util.Scanner;
class Main{
  public static int power(int b,int e)
  {
    int i,pow=1;
    for(i=1;i<=e;i++)
    {
      pow=pow*b;
    }
    return pow;
  }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int ex=in.nextInt();
    int re;
    re=power(base,ex);
    System.out.println(re);
  }
}
