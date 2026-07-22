class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0, n = nums.length-1;
        while(i<n){
            if(nums[i]+nums[n]==target){
                return new int[]{i+1, n+1};
            } else if(nums[i]+nums[n]<target)
                i++;
            else
                n--;
        }
        return new int[]{};
    }
}
