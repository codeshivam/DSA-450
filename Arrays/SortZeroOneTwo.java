package Arrays;

import java.util.Scanner;

public class SortZeroOneTwo{
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    private static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void sortZeroOneTwo(int[] arr) {
        int low = 0, mid = 0,hi = arr.length-1;
        int temp = 0;
        while(mid<=hi){
            if(arr[mid] == 0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                mid++;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        sortZeroOneTwo(arr);
        printArray(arr);
    }
    
}