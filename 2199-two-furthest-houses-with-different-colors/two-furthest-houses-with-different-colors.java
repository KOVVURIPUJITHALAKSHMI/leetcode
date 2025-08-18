class Solution {
    public int maxDistance(int[] colors) {
        int maxDist=0;
        for(int i=colors.length-1;i>=0;i--){
            if(colors[i]!=colors[0]){
                maxDist=Math.max(maxDist,i-0);
                break;
            }
        }  
        for(int i=0;i<colors.length;i++){
            if(colors[i]!=colors[colors.length-1]){
                maxDist=Math.max(maxDist,colors.length-1-i);
                break;
            }
        }
        return maxDist;
    }
}