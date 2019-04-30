import java.util.Scanner;
class Main{
	public static void main(String args[])
    {
	Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String sr=in.nextLine();
    String sub=in.nextLine();
	System.out.println(str.replace(sr,sub));	
	}
}