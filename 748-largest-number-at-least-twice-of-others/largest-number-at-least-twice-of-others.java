class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=0;
        int index=0,flag=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=max){
                if(!(2*nums[i]<=max)){
                flag=1;
                
            }

            }
            
        }
        if(flag==0){
            return index;
        }
        else{
            return -1;

        }
        

        
    }
}