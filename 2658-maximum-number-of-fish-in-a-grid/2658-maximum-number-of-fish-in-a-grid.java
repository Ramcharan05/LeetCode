class Solution {
    int d[][]={{0,1},{0,-1},{1,0},{-1,0}};
    boolean v[][];
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0)continue;
                v=new boolean[n][m];
                max=Math.max(max,dfs(grid,i,j,n,m));
            }
        }
        return max;
    }
    public int dfs(int grid[][], int i, int j, int n, int m){
        v[i][j]=true;
        int cnt=0;
        if(grid[i][j]==0)return cnt;
        cnt+=grid[i][j];
        for(int x[]:d){
            int r=i+x[0];
            int c=j+x[1];
            if(r>=0 && r<n && c>=0 && c<m){
                if(!v[r][c]){
                    cnt+=dfs(grid,r,c,n,m);
                }
            }
        }
        return cnt;
    }
}