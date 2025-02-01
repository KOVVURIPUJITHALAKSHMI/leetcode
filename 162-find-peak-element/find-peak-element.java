class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int max=nums[n-1];
        int index=0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>=max){
                max=nums[i];
                index=i;
            }
        }
        return index;    
    }
}