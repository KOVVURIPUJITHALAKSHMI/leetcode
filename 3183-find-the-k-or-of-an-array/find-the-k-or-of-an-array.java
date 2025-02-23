class Solution {
    public int findKOr(int[] nums, int k) {
        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        int numBits = Integer.toBinaryString(maxNum).length();
        int[] counts = new int[numBits];
        for (int num : nums) {
            for (int i = 0; i < numBits; i++) {
                if ((num & (1 << i)) != 0) {
                    counts[i]++;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < numBits; i++) {
            if (counts[i] >= k) {
                result |= (1 << i); 
            }
        }
        return result;
    }
}

