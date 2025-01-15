class Solution {
    public int minimizeXor(int num1, int num2) {
        int c=Integer.bitCount(num2);
        int res=0;
        for(int i=31;i>=0 && c>0;i--){
            if((num1 & (1<<i))!=0){
                res|=(1<<i);
                c--;
            }
        }
        if(c>0){
            for(int i=0;i<=31 && c>0;i++){
                if((res & (1<<i))==0){
                    res|=(1<<i);
                    c--;
                }
            }
        }
        return res;
    }
}