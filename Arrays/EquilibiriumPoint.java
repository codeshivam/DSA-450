/*
Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

*/


package Arrays;

public class EquilibiriumPoint {
    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();
        int n = arr.length;
        int res = equilibriumPoint(arr, n);
        System.out.println(res);
    }
    public static int equilibriumPoint(int arr[], int n) {
        int sum = 0;
        int leftSum = 0;
        for(int i = 0; i<n; i++)
            sum += arr[i];
        //sum - arr[i] will be rightSum for i
        for(int i = 0; i<n; i++){
            sum -= arr[i];
            if(sum == leftSum)
                return i+1;
            leftSum+=arr[i];
        }
        return -1;
    }
    
}
