class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupSet = new HashSet<>();
        for(int x:nums){
            if(dupSet.contains(x))
                return true;
            dupSet.add(x);
        }
        return false;
    }
}