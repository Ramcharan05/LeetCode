class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mp=new TreeMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int x=-1;
        int cnt=0;
        int max=0;
        for(int k:mp.keySet()){
            if((x+1)!=k){
                x=k;
                cnt=1;
            }
            else{
                x=k;
                cnt++;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}