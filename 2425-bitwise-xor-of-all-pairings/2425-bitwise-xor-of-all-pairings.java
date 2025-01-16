class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        long xor=0;
        for(int n:nums1){
            if(nums2.length%2==0){
                xor^=0;
            }
            else{
                xor^=n;
            }
        }
        for(int n:nums2){
            if(nums1.length%2==0){
                xor^=0;
            }
            else{
                xor^=n;
            }
        }
        return (int) xor;
    }
}