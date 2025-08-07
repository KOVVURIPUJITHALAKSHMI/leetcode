class Solution {
    public int[] decompressRLElist(int[] nums) {
        int totallength=0;
        for(int i=0;i<nums.length;i+=2){
            totallength+=nums[i];
        }
        int index=0;
        int result[]=new int[totallength];
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int value=nums[i+1];
            for(int j=0;j<freq;j++){
                result[index++]=value;
            }
            
        }
        return result;
        
    }
}