class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int lmax=height[l], rmax=height[r];
        int totalWater=0;
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax = Math.max(lmax, height[l]);
                totalWater += lmax-height[l];
            }
            else{
                r--;
                rmax = Math.max(rmax, height[r]);
                totalWater+=rmax-height[r];
            }
        }
        return totalWater;
    }
}
