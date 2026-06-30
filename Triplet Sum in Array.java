import java.util.*;
class Solution {
    int arr[] = {1, 4, 45, 6, 10, 8}, target = 13;
    // Output: true 
        int n = arr.length;
        Arrayssort(arr);
        boolean found = false;
        for(int i=0;i<n;i++){
            int j = i + 1;
            int  k = n - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target) found = true;
                else if(sum < target) j++;
                else k--;
            }
        }
        System.out.println(found);
}
