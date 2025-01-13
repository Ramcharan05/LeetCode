class Solution {
    public int minimumLength(String s) {
        int c=0;
        Map<Character, Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int x:mp.values()){
            if(x<3){
                c+=x;
            }
            else{
                if(x%2==0){
                    c+=2;
                }
                else{
                    c+=1;
                }
            }
        }
        return c;
    }
}