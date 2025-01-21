class Solution {
    public long gridGame(int[][] grid) {
        long sum=0;
        for(int i=0;i<grid[0].length;i++){
            sum+=grid[0][i];
        }
        System.out.println("Sum :"+sum);
        long c1=0;
        long c2=0;
        long res=Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            c1+=grid[0][i];
            long t=sum-c1;
            if(i>0){
                c2+=grid[1][i-1];
            }
            res=Math.min(res,Math.max(t,c2));
        }
        return res;
    }
}