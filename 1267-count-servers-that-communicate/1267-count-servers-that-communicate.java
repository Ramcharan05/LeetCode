class Solution {
    public int countServers(int[][] grid) {
        HashMap<Integer, Integer> r=new HashMap<>();
        HashMap<Integer, Integer> c=new HashMap<>();
        int n=grid.length;
        int m=grid[0].length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    r.put(i,r.getOrDefault(i,0)+1);
                    c.put(j,c.getOrDefault(j,0)+1);
                    res++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && (r.get(i)==1 && c.get(j)==1)){
                    res--;
                }
            }
        }
        return res;
    }
}