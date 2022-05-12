package Hashmap;
import Arrays.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FindKduplicate {
    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();
        int n = arr.length;
        int k = new Scanner(System.in).nextInt();
        int res = firstElementKTime(arr, n, k);
        System.out.println(res);
    }
    public static int firstElementKTime(int[] arr, int n, int k) { 
        HashMap<Integer,Integer> map = new HashMap<>();
        //int res = 0;
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else
                map.put(arr[i], 1);
            if(map.get(arr[i]) == k){
                return arr[i];
                //break;
            }
            
        }
        return -1;
    } 
}
