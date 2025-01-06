class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2)return false;
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<n1;i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n2;i++){
            b[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
}