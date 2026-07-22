class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        s1 = s1.toLowerCase();
        int n = s1.length()-1;
        int i=0;
        while(i<n){
            if(s1.charAt(i)==s1.charAt(n)){
                i++;
                n--;
            } else {
                return false;
            }
        }
        return true;
    }
}
