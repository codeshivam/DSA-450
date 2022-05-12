package Hashmap;
import Arrays.TakeInput;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckTwoArrayEquals {
    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();
        int arr1[] = TakeInput.takeInput();
        int n = arr.length;
        System.out.println(check(arr, arr1, n));
    }

    public static boolean check(int A[],int B[],int N)
    {
        //Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0;i<N;i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }
            else
                map.put(A[i], 1);
        }
        for(int i = 0;i<N;i++){
            if(map2.containsKey(B[i])){
                map2.put(B[i], map2.get(B[i]) + 1);
            }
            else
                map2.put(B[i], 1);
        }
        // for(int i = 0; i<N; i++){
        //     if(!map.containsKey(B[i]))
        //         return false;
        //     else if(map.get(B[i]).equals() 1)
        //         map.remove(B[i]);
        //     else{
        //         map.get(B[i] -1);
        //     }
        // }
        if(map.equals(map2))
            return true;
    return false;
    }
}
