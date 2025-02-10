class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int index=0;
        if(n==1){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[0]>arr[1]){
                    index=0;
                }
            }
            else if(i==n-1){
                if(arr[i]>arr[i-1]){
                    index=i;
                }
            }
            else{
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
               index=i;
            }

            }
            
        }
        return index;

        
    }
    
}