class Solution {
    public static boolean wordPattern(String word,String pattern){
        if(word.length()!=pattern.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> reversemap=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
            char p=pattern.charAt(i);
            if(map.containsKey(w)){
                if(!map.get(w).equals(p)){
                    return false;
                }
            }
            else{
                map.put(w,p);
            }
            if(reversemap.containsKey(p)){
                if(!reversemap.get(p).equals(w)){
                    return false;
                }
            }
            else{
                reversemap.put(p,w);
            }
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(wordPattern(words[i],pattern)){
                result.add(words[i]);
            }
        }
        return result;
        
    }
}