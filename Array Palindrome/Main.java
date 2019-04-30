import java.util.Scanner;
class Main
 { 
  

static int palindrome(int arr[], int begin, int end) 
{ 
     
    if (begin >= end) { 
        return 1; 
    } 
    if (arr[begin] == arr[end]) { 
        return palindrome(arr, begin + 1, end - 1); 
    } 
    else { 
        return 0; 
    } 
} 
  

    public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
    int arr_size = sc.nextInt(); 


    int arr[] = new int[arr_size]; 
     
    for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }

  
    if (palindrome(arr, 0, arr_size - 1) == 1) 
        System.out.print( "Yes"); 
    else
        System.out.println( "No"); 
    } 
} 