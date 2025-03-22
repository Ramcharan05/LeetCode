class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> al=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++)al.add(new ArrayList<>());
        for(int e[]:edges){
            al.get(e[0]).add(e[1]);
            al.get(e[1]).add(e[0]);
        }
        boolean v[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!v[i]){
                List<Integer> li=new ArrayList<>();
                dfs(al,li,v,i);
                res.add(li);
            }
        }
        int c=0;
        for(List<Integer> li:res){
            int s=li.size();
            int e=0;
            for(int nd:li){
                e+=al.get(nd).size();
            }
            if((e/2)==((s)*(s-1))/2){
                c++;
            }
        }
        return c;
    }
    void dfs(List<List<Integer>> al, List<Integer> li, boolean v[], int x){
        v[x]=true;
        li.add(x);
        for(int i:al.get(x)){
            if(!v[i]){
                dfs(al,li,v,i);
            }
        }
    }
}