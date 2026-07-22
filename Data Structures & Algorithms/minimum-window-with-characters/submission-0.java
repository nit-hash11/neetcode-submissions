class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        Map<Character, Integer> freqMap = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(char ch: t.toCharArray())
            freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);
        int countChar = 0;
        int reqdChar = freqMap.size();
        int[] res = {-1,-1};
        int resLen = Integer.MAX_VALUE;
        int l = 0;
        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            window.put(ch, window.getOrDefault(ch,0) + 1);
            if(freqMap.containsKey(ch) && window.get(ch).equals(freqMap.get(ch)))
                countChar++;
            while(countChar==reqdChar){
                if(r-l+1 < resLen){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar)-1);
                if(freqMap.containsKey(leftChar) && window.get(leftChar)<freqMap.get(leftChar))
                    countChar--;
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE? "" : s.substring(res[0], res[1]+1);
    }
}
