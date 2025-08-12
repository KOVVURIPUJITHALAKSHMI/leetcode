class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> result=new ArrayList<>();
        String prev=" ";
        for(String word:words){
            char[] sorrt=word.toCharArray();
            Arrays.sort(sorrt);
            String sorted=new String(sorrt);
            if(!sorted.equals(prev)){
                result.add(word);

            }
            prev=sorted;
        }
        return result;
        
        
    }
}