class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=First(nums,target);
        ans[1]=Last(nums,target);
        return ans;

       
    }
    public int First(int[] nums,int target){
        int n=nums.length;
        int start=0;int end=n-1;
        int firstIndex=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                firstIndex=mid;
                end=mid-1;

            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return firstIndex;
        
    }
    public int Last(int[] nums,int target){
        int n=nums.length;
        int start=0;int end=n-1;
         int lastIndex=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                lastIndex=mid;
                start=mid+1;

            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return lastIndex;
        
    }
}