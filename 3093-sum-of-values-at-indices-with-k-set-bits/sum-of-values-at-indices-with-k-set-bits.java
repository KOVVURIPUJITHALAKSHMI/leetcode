class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            if(Count(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
        
    }
    public int Count(int number){
        String binary=Integer.toBinaryString(number);
        char c[]=binary.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='1'){
                count+=1;
            }
        }
        return count;
    }
}