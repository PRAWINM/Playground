import java.util.Scanner;

class Main 
{
  public static void main(String []args) 
  {
    int num, i, j, temp;
    Scanner input=new Scanner(System.in);
   
    num = input.nextInt();
    int array[] = new int[num];
   
 
    for (i = 0; i < num; i++) 
      array[i] = input.nextInt();
 
    for (i = 0; i <num/2; i++) {
      for (j = 0; j < (num/2)- 1; j++) {
        if (array[j] > array[j+1]) 
        {
           temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
        }
      }
    }
 
 
    for (i = 0; i < num; i++) 
      System.out.print(array[i]+" ");
  }
}