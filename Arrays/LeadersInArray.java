package Arrays;
import java.util.*;
public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();
        int n = arr.length;
        ArrayList<Integer> list = leaders(arr, n);
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code her
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        for(int i = n-1; i<=0; i--){
            if(max < arr[i]){
                max = arr[i];
                if(i == n-1){
                  continue;  
                }
                list.add(max);
            }
        }
        //Reverse the arrayList
        Collections.reverse(list);
        // int k =0;
        // int j = list.size() - 1;
        // while(k<j){
        //     int temp = list.get(k);
        //     list.set(k, list.get(j));
        //     list.set(j, temp);
        //     k++;
        //     j--;
        // }
        return list;
    }
}
