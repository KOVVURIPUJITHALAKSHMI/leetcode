class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1count=new int[26];
        int[] s2count=new int[26];
        if(s2.length()<s1.length()) return false;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            char ch1=s2.charAt(i);
            s1count[ch-'a']++;
            s2count[ch1-'a']++;
        }
        if (Arrays.equals(s1count, s2count)) return true;
        for(int i=s1.length();i<s2.length();i++){
            char ch=s2.charAt(i);
            s2count[ch-'a']++;
            s2count[s2.charAt(i-s1.length())-'a']--;
            if (Arrays.equals(s1count, s2count)) return true;
            
        }
        return false;
        
    }
}