class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2)return false;
        Map<Character, Integer> mp1=new HashMap<>();
        for(char c:s.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }
        Map<Character, Integer> mp2=new HashMap<>();
        for(char c:t.toCharArray()){
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }
        for(char k:mp1.keySet()){
            int x=mp1.get(k);
            if(!mp2.containsKey(k)){
                return false;
            }
            else if(mp2.containsKey(k)){
                int y=mp2.get(k);
                if(x!=y)return false;
            }
        }
        return true;
    }
}