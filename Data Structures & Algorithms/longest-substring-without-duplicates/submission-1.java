class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> posMap = new HashMap<>();
        int n = s.length();
        int longest = 0;
        int l = 0;
        for(int r=0; r<n; r++){
            if(posMap.containsKey(s.charAt(r))){
                l = Math.max(posMap.get(s.charAt(r)) + 1,l);
            }
            longest = Math.max(r-l+1, longest);
            posMap.put(s.charAt(r), r);
        }
        return longest;
    }
}
