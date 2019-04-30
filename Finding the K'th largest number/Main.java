import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int array[] =new int[arr_size];
       for(int i=0;i<arr_size;i++)
       {
         array[i]=in.nextInt();
       }
       int k=in.nextInt();
       int temp;
      for(int i = 0; i<arr_size; i++ ){
         for(int j = i+1; j<arr_size; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println(array[arr_size-k]);
   }
}