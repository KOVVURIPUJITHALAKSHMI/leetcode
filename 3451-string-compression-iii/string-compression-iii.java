class Solution {
    public String compressedString(String word) {
        int i=0;
        int count=0;
        int n=word.length();
        StringBuffer sb=new StringBuffer();
        while(i<n){
            char current=word.charAt(i);
            count=0;
            while(i<n && word.charAt(i)==current){
                count++;
                i++;
            }
            while(count>9){
                sb.append(9).append(current);
                count-=9;
            }
            if(count<=9){
                sb.append(count).append(current);
            }
            
            
        }
        return sb.toString();
    }
}