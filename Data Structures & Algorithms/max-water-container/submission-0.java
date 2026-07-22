class Solution {
    public int maxArea(int[] heights) {
        int l=0, r=heights.length-1;
        int maxWater = 0, water=0;
        while(l<r){
            water = (r-l)*(Math.min(heights[r],heights[l]));
            maxWater = Math.max(water, maxWater);
            if(heights[r]>heights[l])
                l++;
            else r--;
        }
        return maxWater;
    }
}
