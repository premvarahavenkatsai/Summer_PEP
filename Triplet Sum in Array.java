import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 13; // Output: true
        int n = arr.length;
        Arrays.sort(arr);
        boolean found = false;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    found = true;
                    break;
                } else if (sum < target) j++;
                else k--;
            }
            if (found) break;
        }
        System.out.println(found);
    }
}
