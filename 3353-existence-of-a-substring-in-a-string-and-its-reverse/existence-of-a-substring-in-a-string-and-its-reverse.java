class Solution {
    public boolean isSubstringPresent(String s) {
        String r=new StringBuffer(s).reverse().toString();
        for(int i=0;i<=s.length()-2;i++){
            String sub=s.substring(i,i+2);
            if(r.contains(sub)){
                return true;
            }
            
        }
        return false;
    }   
}