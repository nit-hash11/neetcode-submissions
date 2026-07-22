class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int mid;
        int res = 0;
        while(l<=r){
            mid = (l+r)/2;
            int totTime = 0;
            for(int p : piles){
                totTime += Math.ceil((double)p/mid);
            }
            if(totTime<=h){
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
