package Arrays;
import java.io.*;
import java.util.*;
public class MinimizeSumOfProduct {
    public static void main(String[] args) {
        int a[] = TakeInput.takeInput();
        int b[] = TakeInput.takeInput();
        int n = a.length;
        System.out.println(minValue(a, b, n));
    }
    public static int minValue(int a[], int b[], int n) 
    {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int m = n -1;
        int min = 0;
        for(int i = 0; i<n ; i++){
            min += a[i] * b[m--];
        }
    return min;
    }
}
