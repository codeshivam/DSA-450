package Arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int arr[] = TakeInput.takeInput();
            int n = arr.length;
            int key = sc.nextInt();
            System.out.println(binarysearch(arr, n, key));
        
    }
    static int binarysearch(int arr[], int n, int k) {
        // code 
        int l = 0, r = n-1;
        while(l<=r){
            int mid = (l + r)/2;
            if(arr[mid] == k)
                return mid;
            else if(arr[mid]>k)
                r = mid - 1;
            else
                l = mid + 1;
        }
    return -1;
    }
}

