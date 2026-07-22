class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];
        for(int i=0; i<s1.length(); i++){
            charCount1[s1.charAt(i)-'a']++;
            charCount2[s2.charAt(i)-'a']++;
        }
        int matches = 0;
        for(int i=0; i<26; i++){
            if(charCount1[i]==charCount2[i])
                matches++;
        }
        int l = 0;
        for(int r = s1.length(); r<s2.length(); r++){
            if(matches==26){
                return true;
            }
            int x = s2.charAt(r)-'a';
            charCount2[x]++;
            if(charCount2[x]==charCount1[x])
                matches++;
            else if (charCount2[x] == charCount1[x] + 1)
                matches--;
            x = s2.charAt(l)-'a';
            charCount2[x]--;
            if(charCount2[x]==charCount1[x])
                matches++;
            else if (charCount2[x] == charCount1[x] - 1)
                matches--;
            l++;
        }
        return matches==26;
    }
}
