class Solution {
    public int minimumLength(String s) {
        int c=0;
        int a[]=new int[26];
        for(char ch:s.toCharArray()){
            a[ch-'a']++;
        }
        for(int x:a){
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