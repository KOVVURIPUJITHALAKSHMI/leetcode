class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> lastseen=new HashMap<>();
        int left=0,maxLen=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(lastseen.containsKey(ch)){
                left=Math.max(left,lastseen.get(ch)+1);
            }
            lastseen.put(ch,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}