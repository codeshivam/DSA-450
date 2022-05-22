/*
Given an array having both positive and negative integers. 
The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, where n is the size of the array A and returns the length of the largest subarray with 0 sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 105
-1000 <= A[i] <= 1000, for each valid i
*/
package Arrays;

import java.util.HashMap;

public class MaxSubarraySumIsEqualToZero {
    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();
        int n = arr.length;
        int res = maxLen(arr, n);
        System.out.println(res);
    }
    
    static int maxLen(int arr[], int n)
    {
        // Your code here
        int sum = 0;
        int max_len = 0;
        //int prev_i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n; i++){
            sum += arr[i];
            if(arr[i] == 0 && max_len== 0)
                max_len = 1;
            if(sum == 0)
                max_len = i+1;
            if(map.containsKey(sum)){
                Integer prev_i = map.get(sum);
                max_len = Math.max(max_len, i-prev_i);
            }
            else
                map.put(sum, i);
        }
    return max_len;
    }
}
