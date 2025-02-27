class Solution {
    public boolean isPerfectSquare(int num) {
        int temp=num;
        int sqrt=(int)Math.sqrt(num);
        if(sqrt*sqrt==temp){
            return true;
        }
        else{
            return false;
        }

        
    }
}