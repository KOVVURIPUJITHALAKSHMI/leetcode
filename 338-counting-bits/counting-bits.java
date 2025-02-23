class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            String binary = Integer.toBinaryString(i);
            
            char c[]=binary.toCharArray();
            int count=0;
            for(int j=0;j<c.length;j++){
                if(c[j]=='1'){
                    count+=1;
                }
            }
            ans[i]=count;
        }
        return ans;

        
    }
}