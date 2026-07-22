class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupAnagram = new HashMap<>();
        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String keyStr = new String(charArr);
            if(groupAnagram.containsKey(keyStr)){
                groupAnagram.get(keyStr).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                groupAnagram.put(keyStr, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String x : groupAnagram.keySet()){
            res.add(groupAnagram.get(x));
        }
        return res;
    }
}
