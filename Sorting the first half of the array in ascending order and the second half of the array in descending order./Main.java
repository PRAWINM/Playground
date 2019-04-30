import java.util.Arrays;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
   
    int num = input.nextInt();
    int array[] = new int[num];
    int i;
   
 
    for (i = 0; i < num; i++) 
      array[i] = input.nextInt();
        sortedArrayInTwoOrder(array);
	}
	
	public static void sortedArrayInTwoOrder(int[] arr){
        
        int len=arr.length;
        int[] arr1 = new int[len/2];
        int[] arr2 = new int[len-len/2];
        for(int i=0;i<len/2;i++)
        {
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        for(int j=len-1,k=0;j>=len/2 && k<=len-len/2;j--,k++)
        {
            arr2[k] =arr[j];
        }
        Arrays.sort(arr2);
        for(int i=0;i<len;i++)
        {
            if(i<len/2)
            {
                arr[i]=arr1[i];
            }
            if(i>=len/2)
            {    
                arr[i]=arr2[(len-i)-1];
            }
        }
        for (int var : arr) {
            System.out.print(var+" ");
        }
    }
}