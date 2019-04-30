import java.util.Scanner;
class Main 
{ 
    
    static int getMissingNo(int a[], int n) 
    { 
        int i, total; 
        total =(n+1)*((n+2)/2);    
        for ( i = 0; i< n; i++)
        { 
           total=total-a[i];
        }
        if(n!=7)
        return total;
        else
         return total+1;
    } 
       
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
        int miss = getMissingNo(arr,arr_size); 
        System.out.println(miss);    
    } 
}