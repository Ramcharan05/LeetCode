class Solution {
    public long gridGame(int[][] grid) {
        long sum=0;
        for(int i=0;i<grid[0].length;i++){
            sum+=grid[0][i];
        }
        System.out.println("Sum :"+sum);
        long c=0;
        long res=Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            sum-=grid[0][i];
            res=Math.min(res,Math.max(sum,c));
            c+=grid[1][i];
        }
        return res;
    }
}