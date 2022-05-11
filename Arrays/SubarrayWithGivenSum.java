package Arrays;
import java.util.*;
public class SubarrayWithGivenSum {
    // { Driver Code Starts
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] m = TakeInput.takeInput();
            int s = sc.nextInt();
            int n = m.length;
            //Solution obj = new Solution();
            ArrayList<Integer> res = Solution.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
    }
}

// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> arrR = new ArrayList<Integer>();
        int c = 0, sum = 0;
        for(int i = 0; i<n; i++){
            sum +=arr[i];
            while(sum > s){
                sum -= arr[c];
                c++;
            }
           //System.out.println(sum);
            if(sum == s){
                  arrR.add(c+1);
                  arrR.add(i+1);
                  break;
            }
              
        }
    return arrR;
    }
       
}
