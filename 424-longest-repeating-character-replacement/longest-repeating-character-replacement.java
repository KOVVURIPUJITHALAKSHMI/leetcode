class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0,maxfreq=0,maxlen=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
            int window=right-left+1;
        if(window-maxfreq>k){
            freq[s.charAt(left) - 'A']--;
            left++;
        }
        maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
        
        
    }
}