class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(solve(words[i],words[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public boolean solve(String s1, String s2){
        if(s2.length()<s1.length())return false;
        if(s2.startsWith(s1) && s2.endsWith(s1))return true;
        return false;
    }
}