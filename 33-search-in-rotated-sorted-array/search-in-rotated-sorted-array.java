class Solution {
    public int search(int[] nums, int target) {
        int pivot=pivot(nums);
        int n=nums.length;
        if(binarySearch(0,pivot,nums,target)!=-1){
            return binarySearch(0,pivot,nums,target);
        }
        else {
            return binarySearch(pivot+1,n-1,nums,target);
        }   
    }
    public int binarySearch(int start,int end,int[] nums,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public int pivot(int nums[]){
        int start=0;
        int n=nums.length;
        int end=n-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else { 
                end = mid;
            }
        }
        return -1;
    }
}