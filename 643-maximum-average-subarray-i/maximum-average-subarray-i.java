class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        int windsum=0;
        for(int i=0;i<k;i++){
            windsum+=nums[i];
        }
        maxSum=windsum;
        for(int i=k;i<nums.length;i++){
            windsum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,windsum);
        }
        return maxSum/k;
        
    }
}