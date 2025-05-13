class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean present[]=new boolean[n+1];
        ArrayList<Integer> result=new ArrayList<>(); 
        for(int num:nums){
            if(num>=1 && num<n+1){
                present[num]=true;
            }
        }
        for(int k=1;k<n+1;k++){
            if(!present[k]){
                result.add(k);
            }
        }
        return result;
        
    }
}