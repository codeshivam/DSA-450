package Arrays;

import java.io.*;
import java.util.*;

public class MergeWithoutSpace {
    // Driver code
    public static void main(String[] args) throws Exception {
            //TakeInput t = new TakeInput();
            int arr1[] = TakeInput.takeInput();
            int arr2[] = TakeInput.takeInput();
            int n = arr1.length;
            int m = arr2.length;
            Solution.merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
}
// } Driver Code Ends


class Solution {

    public static void merge(int arr1[], int arr2[], int m, int n) {
        // code here
        int i = 0, j = 0, k = m - 1;
        while (i <= k && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    }
}
