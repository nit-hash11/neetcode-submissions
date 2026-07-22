class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> count = new HashMap<>();
    List<Integer>[] freq = new List[nums.length + 1];

    for(int i=0; i<freq.length; i++)
        freq[i] = new ArrayList<>();
    for(int n: nums)
        count.put(n, count.getOrDefault(n,0) + 1);
    for(int x : count.keySet())
        freq[count.get(x)].add(x);
    int[] res = new int[k];
    int ind = 0;
    for(int i=freq.length-1; i>0 && ind<k; i--){
        for(int n: freq[i])
            res[ind++] = n;
            if(ind==k)
                return res;
    }
    return res;
    }
}
