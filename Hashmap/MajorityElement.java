package Hashmap;
import Arrays.*;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = TakeInput.takeInput();
        int n = arr.length;
        System.out.println(majorityElement(arr, n));
    }
    static int majorityElement(int a[], int n)
    {
        // your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }else
                map.put(a[i], 1);
            if(map.get(a[i]) > n/2)
                return a[i];
        }
        return -1;
    }
}
