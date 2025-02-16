class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int countp=0,countn=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                countp+=1;
            }
            else if(nums[i]<0){
                countn+=1;
            }
            
        }
        return Math.max(countp,countn);
        
    }
}