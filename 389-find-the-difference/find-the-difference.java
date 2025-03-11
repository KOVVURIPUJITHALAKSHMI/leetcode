class Solution {
    public char findTheDifference(String s, String t) {
        int value=0;
        for(char ch:s.toCharArray()){
            value^=ch;
        }
        for(char ch:t.toCharArray()){
            value^=ch;
        }
        return (char)value;
        
        
    }
}