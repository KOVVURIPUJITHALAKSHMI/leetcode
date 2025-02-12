/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */ 
class Solution {
    public int peak(MountainArray mountainArr){
        int start=0;
        int n=mountainArr.length();
        int end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peak(mountainArr);
        int n=mountainArr.length();
        int firsttry=binarySearch(target,mountainArr,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        else{
            int secondtry=binarySearch(target,mountainArr,peak+1,n-1);
            return secondtry;
        }
    }
    public int binarySearch(int target,MountainArray mountainArr,int start,int end){
        boolean IsAsc=mountainArr.get(start)<mountainArr.get(end);
        while(start<=end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)==target){
            return mid;
        }
        if(IsAsc){
            if(mountainArr.get(mid)>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        else{
            if(mountainArr.get(mid)<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }

        }
        return -1;
        

    }
    

}