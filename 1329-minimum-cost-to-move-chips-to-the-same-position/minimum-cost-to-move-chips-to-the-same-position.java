class Solution {
    public int minCostToMoveChips(int[] position) {
        int n=position.length;
        int mcost=0;
        int ncost=0;
        for(int i=0;i<n;i++){
            if(position[i]%2==0){
                mcost+=1;
            }
            else{
                ncost+=1;
            }
        }
        if(mcost>ncost){
            return ncost;
        }
        else{
            return mcost;

        }
        
        
    }
}