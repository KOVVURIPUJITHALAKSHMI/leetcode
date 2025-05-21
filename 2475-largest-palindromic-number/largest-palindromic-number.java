class Solution {
    public String largestPalindromic(String num) {
        int[] count=new int[10];
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            count[ch-'0']++;
        }
        StringBuffer left=new StringBuffer();
        for(int i=9;i>=0;i--){
            int paircount=count[i]/2;
            if (i == 0 && left.length() == 0) continue;
            for(int j=1;j<=paircount;j++){
                left.append(i);
            }
            count[i]%=2;
        }
        String centre="";
        for(int i=9;i>=0;i--){
            if(count[i]>0){
                centre=""+i;
                break;
            }
        }
        String right=new StringBuffer(left).reverse().toString();
        String result=left+centre+right;
        return result;
        
    }
}