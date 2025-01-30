class Solution {
    public int maximumWealth(int[][] accounts) {
        int max[]=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max[i]=sum;
        }
        int m=0;
        for(int k=0;k<accounts.length;k++){
            if(max[k]>=m){
                m=max[k];
            }
        }
        return m;
        
    }
}