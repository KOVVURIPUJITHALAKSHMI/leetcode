class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        // int max=nums[n-1];
        // int index=0;
        // for(int i=n-1;i>=0;i--){
        //     if(nums[i]>=max){
        //         max=nums[i];
        //         index=i;
        //     }
        // }
        // return index; 
        int index=0;
        if(n==1){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[0]>nums[1]){
                    index=i;
                }
            }
            else if(i==n-1){
                if(nums[i]>nums[i-1]){
                    index=i;
                }
            }
            else{
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    index=i;
                }
            }
        } 
        return index;  
    }
}