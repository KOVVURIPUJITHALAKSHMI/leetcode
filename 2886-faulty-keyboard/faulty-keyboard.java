class Solution {
    
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        char[] c=s.toCharArray();
        for(char num:c){
            if(num=='i'){
                sb.reverse();
            }
            else{
                sb.append(num);
            }
        }
        return sb.toString();
    }
}