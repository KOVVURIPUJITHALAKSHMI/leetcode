class Solution {
    public int maximumDifference(int[] nums) {
        // int maxSum=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j]-nums[i]>maxSum){
        //             maxSum=nums[j]-nums[i];
        //         }
        //     }
        // }
        // return maxSum==0 ? -1:maxSum;
        int minValue=nums[0];
        int maxSum=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>minValue){
                maxSum=Math.max(maxSum,nums[i]-minValue);
            }
            else{
                minValue=nums[i];
            }
        }
        return maxSum;
        
    }
}