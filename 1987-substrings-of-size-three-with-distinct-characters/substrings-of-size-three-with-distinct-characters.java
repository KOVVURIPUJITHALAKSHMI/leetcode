class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        HashMap<Character,Integer> result=new HashMap<>();
        int count=0;
        for(int i=0;i<3;i++){
            char ch=s.charAt(i);
            result.put(ch,result.getOrDefault(ch,0)+1);
        }
        if(result.size()==3){
            count++;
        }
        for(int i=3;i<s.length();i++){
            char left=s.charAt(i-3);
            result.put(left,result.get(left)-1);
            if(result.get(left)==0){
                result.remove(left);
            }
            char right=s.charAt(i);
            result.put(right,result.getOrDefault(right,0)+1);
            if(result.size()==3){
                count++;
            }
        }
        return count;
        
    }
}