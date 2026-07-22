class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProd = new int[n];
        int prod = nums[0];
        prefixProd[0] = 1;
        for(int i=1; i<n; i++){
            prefixProd[i] = prod;
            prod*=nums[i];
        }
        int[] postProd = new int[n];
        prod = nums[n-1];
        postProd[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            postProd[i] = prod;
            prod*=nums[i];
        }
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = prefixProd[i] * postProd[i];
        }
        return res;
    }
}  
