package Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class MoveNegativeWithOrder {
//Initial Template for Java

	public static void main(String[] args)
	{
	       int arr[] = TakeInput.takeInput();
            int n = arr.length;
            segregateElements(arr, n);
            
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
             System.out.println();
    }
    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        // int arr2[] = arr;
        // int k = 0;
        // for(int i = 0; i<n; i++){
        //     if(arr2[i] >= 0){
        //         arr[k] = arr2[i];
        //         k++;
        //     }
        // }
        // //System.out.println(k);
        // for(int i = 0; i<n && k<n; i++){
        //     if(arr2[i] < 0){
        //         arr[k] = arr2[i];
        //         k++;
        //     }
        // }

        //2nd approach
        int arr2[] = new int[n];
        int m = n - 1;
        
        int k = 0;
        for(int i = 0,j=n-1; i<n || j>=0 ; i++,j--){
            if(arr[i] > 0){
                arr2[k] = arr[i];
                k++;
            }
            if(arr[j] < 0){
                arr2[m--] = arr[j];
            }
        }
        //System.out.println(k);
        for(int i = 0; i<n; i++){
           arr[i] = arr2[i];
        }
    }
}


