class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(String s:words2){
            sb.append(s);
        }
        System.out.println("words2 :"+sb.toString());
        for(String s:words1){
            int x=0;
            System.out.println("word1 :"+s);
            String str=s;
            for(int i=0;i<sb.length();i++){
                String ch=sb.charAt(i)+"";
                if(!str.contains(ch))break;
                else{
                    str=str.replaceFirst(ch,"");
                    System.out.println(str);
                    x++;
                }
            }
            if(x==sb.length()){
                res.add(s);
            }
            System.out.println();
        }
        return res;
    }
}