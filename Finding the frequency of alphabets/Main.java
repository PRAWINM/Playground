import java.util.Scanner;
 
class Main
{
 public static void main(String args[])
 {
  
  int count=0,len=0,flag=0;
 
  Scanner sc=new Scanner(System.in);
  
  String str;
  str=sc.nextLine();
  len=str.length();
  str=str.toLowerCase();
  for(int i=0;i<len;++i)
  {
   count=0;
   for(int j=0;j<len;++j)
    if(str.charAt(j)==str.charAt(i))
     count++;
 
   for(int k=0;k<i;++k)
    if(str.charAt(k)==str.charAt(i))
     flag=1;
 
   if(flag!=1)
    System.out.print(str.charAt(i)+""+count+" ");
 
   flag=0;
  }
 }
}  