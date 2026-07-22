class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String x : strs){
            int len = x.length();
            sb.append(len + "#" + x);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0,j=0;
        for(i=0; i<str.length(); i++){
            if(str.charAt(i)=='#'){
                int len = Integer.parseInt(str.substring(j, i));
                String s = str.substring(i+1, i+len+1);
                res.add(s);
                j = i+len+1;
                i = j;
                if(j>=str.length())
                    break;
            }
        }
        return res;
    }
}
