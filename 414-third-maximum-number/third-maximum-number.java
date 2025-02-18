class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.size()<3){
            return Collections.max(set);
        }
        else{
             List<Integer> list = new ArrayList<>(set);
             Collections.sort(list, Collections.reverseOrder());
             return list.get(2);
        }   
    }
}