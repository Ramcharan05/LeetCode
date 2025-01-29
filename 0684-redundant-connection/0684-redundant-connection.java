class Solution {
    int[] p, r;
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        p=new int[n+1];
        r=new int[n+1];
        for(int i=0;i<=n;i++){
            p[i]=i;
            r[i]=1;
        }
        r[0]=0;
        for(int[] e:edges){
            int x=e[0];
            int y=e[1];
            if(!union(x,y))return e;
        }
        return new int[0];
    }
    public int find(int x){
        if(p[x]!=x){
            p[x]=find(p[x]);
        }
        return p[x];
    }
    public boolean union(int x, int y){
        int rx=find(x);
        int ry=find(y);
        if(rx==ry)return false;
        if(r[rx]>r[ry]){
            p[ry]=rx;
        }
        else if(r[rx]<r[ry]){
            p[rx]=ry;
        }
        else{
            p[ry]=rx;
            r[rx]++;
        }
        return true;
    }
}