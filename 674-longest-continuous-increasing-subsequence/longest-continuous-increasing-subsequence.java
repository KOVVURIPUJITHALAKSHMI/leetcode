class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxlen=1;
        int currentlen=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                currentlen++;
                maxlen=Math.max(maxlen,currentlen);
            }
            else{
                currentlen=1;
            }
        }
        return maxlen;
        
    }
}