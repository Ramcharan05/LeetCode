class Solution {
    public int[][] merge(int[][] intervals) {
        int m=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> li=new ArrayList<>();
        li.add(new ArrayList<>(List.of(intervals[0][0],intervals[0][1])));
        int j=1;
        for(int i=1;i<m;i++){
            int x=li.get(j-1).get(1);
            int y=intervals[i][0];
            int z=intervals[i][1];
            if(y<=x && z<=x)continue;
            else if(y<=x){
                li.get(j-1).set(1,intervals[i][1]);
            }
            else{
                li.add(new ArrayList<>(List.of(intervals[i][0],intervals[i][1])));
                j++;
            }
        }
        int res[][]=new int[li.size()][2];
        for(int i=0;i<li.size();i++){
            res[i][0]=li.get(i).get(0);
            res[i][1]=li.get(i).get(1);
        }
        return res;
    }
}