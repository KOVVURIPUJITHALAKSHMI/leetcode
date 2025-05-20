class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count=0,maxlen=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==1){
                count++;
                maxlen=Math.max(maxlen,count);
            }
            else{
                count=0;
            }
        }
        return maxlen;
        
    }
}