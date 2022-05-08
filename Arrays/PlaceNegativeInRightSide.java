package Arrays;
import java.util.Scanner;
public class PlaceNegativeInRightSide {
    
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
    //place negative in Right side of array
    public static void negativeInRightSide(int[] arr) {
        int j = arr.length;
        for(int i = arr.length-1; i>=0; i--) {
            if(arr[i] < 0){
                j--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        negativeInRightSide(arr);
        printArray(arr);
    }
}
