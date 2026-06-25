class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int l = 0, r = n - 1;
        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum == target){
                ans[0] = l+1;
                ans[1] = r+1;
                break;
            }else if(sum > target) r--;
            else l++;
        }
        return ans;
    }
}
