class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i){
                    sum+=i;
                }
                else{
                    sum+=i+(num/i);

                }
                
            }
        }
        sum-=num;
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
        
    }
}