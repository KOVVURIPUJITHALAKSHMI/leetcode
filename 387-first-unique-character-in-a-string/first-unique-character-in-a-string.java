class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] c=s.toCharArray();
        for(char ch:c){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(c[i])==1){
                return i;
            }
        }
        return -1;
        
    }
}