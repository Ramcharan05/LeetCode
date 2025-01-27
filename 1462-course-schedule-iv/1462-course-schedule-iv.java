class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean res[][]=new boolean[numCourses][numCourses];
        for(int[] p:prerequisites){
            res[p[0]][p[1]]=true;
        }
        for(int i=0;i<numCourses;i++){
            for(int j=0;j<numCourses;j++){
                for(int k=0;k<numCourses;k++){
                    if(res[j][i]&&res[i][k]){
                        res[j][k]=true;
                    }
                }
            }
        }
        List<Boolean> ans=new ArrayList<>();
        for(int[] q:queries){
            ans.add(res[q[0]][q[1]]);
        }
        return ans;
    }
}