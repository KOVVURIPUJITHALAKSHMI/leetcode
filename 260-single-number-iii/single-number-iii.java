class Solution {
    public int[] singleNumber(int[] nums) {
        int value=0;
        for(int num:nums){
            value^=num;
        }
        int rightdiffbit=value & -value;
        int num1=0;
        int num2=0;
        for(int num:nums){
            if((num &rightdiffbit)!=0){
                num1^=num;
            }
            else{
                num2^=num;
            }
        }
        return new int[]{num1,num2};      
    }
}