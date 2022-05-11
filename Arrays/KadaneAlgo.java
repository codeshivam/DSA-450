package Arrays;

public class KadaneAlgo {
	public static void main (String[] args){
		
		int arr[] = TakeInput.takeInput();
        int n = arr.length;
		    
		//calling maxSubarraySum() function
		System.out.println(maxSubarraySum(arr, n));
		
	}
    public static int maxSubarraySum(int arr[], int n){
        
        // Your code here
         //int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < n; i++)
        {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
        
    }
}
