class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result=new ArrayList<>();
        if(s.length()<p.length()){
            return result;
        }
        int scount[]=new int[26];
        int pcount[]=new int[26];
        int n=p.length();
        for(int i=0;i<n;i++){
            scount[s.charAt(i)-'a']++;
            pcount[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(scount,pcount)){
            result.add(0);
        }
        for(int i=n;i<s.length();i++){
            scount[s.charAt(i)-'a']++;
            scount[s.charAt(i-n)-'a']--;
            if(Arrays.equals(scount,pcount)){
            result.add(i-n+1);
        }
        }
        return result;
        
        
        
    }
}