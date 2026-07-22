class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int i:nums)
            numSet.add(i);
        for(int i:numSet){
            if(!numSet.contains(i-1)){
                int len = 1;
                while(numSet.contains(i+len)){
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }
}
