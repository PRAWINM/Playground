import java.util.Scanner;
class Main{
  
    public static void main(String[] args)  
    { 
        Scanner in=new Scanner(System.in);
        int n1 = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n1];
        for(int i = 0; i < n1; i++)
        {
         arr[i] = in.nextInt();
        }
        int i = 0; 
        while (i<n1)  
        { 
            if(arr[i] <= 0)  
            { 
                i++; 
                continue; 
            } 
            int elementIndex = arr[i] - 1; 
  
            if (arr[elementIndex] > 0)  
            { 
                arr[i] = arr[elementIndex]; 
  
                 
                arr[elementIndex] = -1; 
            }  
            else 
            { 
                arr[elementIndex]--;   
                arr[i] = 0; 
                i++; 
            } 
        }  
        for(int j=0;j<k; j++) 
          System.out.println(j+1+" "+Math.abs(arr[j]));       
    } 
} 