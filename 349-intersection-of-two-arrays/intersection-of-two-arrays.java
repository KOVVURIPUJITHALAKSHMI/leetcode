class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums2[j]);
                }
            }
        }
       int[] ans = new int[list.size()];
    int index = 0;
        for (int num : list) {
            ans[index++] = num;
        }
        return ans;
        
    }
}