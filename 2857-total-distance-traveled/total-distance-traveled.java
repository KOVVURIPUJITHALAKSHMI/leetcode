class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
         int distance = 0;
        while (mainTank >= 5 && additionalTank > 0) {
            mainTank -= 5;       
            additionalTank -= 1;  
            mainTank += 1;      
            distance += 50;     
        }
        distance += mainTank * 10;
        return distance;
        
    }
}