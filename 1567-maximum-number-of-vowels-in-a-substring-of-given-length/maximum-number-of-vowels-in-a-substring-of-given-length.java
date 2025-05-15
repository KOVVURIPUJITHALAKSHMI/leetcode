class Solution {
    public boolean vowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    int count=0;
    int maxCount=0;
    public int maxVowels(String s, int k) {
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                count++;

            }   
        }
        maxCount=count;
        for(int i=k;i<s.length();i++){
            if(vowel(s.charAt(i-k))){
                count--;
            }
            if(vowel(s.charAt(i))){
                count++;
                
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
        
    }
}