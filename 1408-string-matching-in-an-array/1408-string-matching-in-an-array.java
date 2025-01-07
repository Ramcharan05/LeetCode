class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            for(int j=0;j<words.length;j++){
                if(words[j].contains(str) && i!=j){
                    if(!li.contains(str)){
                        li.add(str);
                    }
                }
            }
        }
        return li;
    }
}