class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> posMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(posMap.containsKey(target-nums[i])){
                return new int[]{posMap.get(target-nums[i]),i};
            }
            posMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
