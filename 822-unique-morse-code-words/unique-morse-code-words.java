class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet transformed=new HashSet<>();
        for(String word:words){
            StringBuffer sb=new StringBuffer();
            for(char c:word.toCharArray()){
                sb.append(morse[c-'a']);
            }
            transformed.add(sb.toString());

        }
        return transformed.size();
        
    }
}