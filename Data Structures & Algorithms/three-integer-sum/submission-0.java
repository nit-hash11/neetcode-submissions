class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    List<Integer> subset = new ArrayList<>();
                    subset.add(nums[i]);
                    subset.add(nums[j]);
                    subset.add(nums[k]);
                    res.add(subset);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                } else if(sum<0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
