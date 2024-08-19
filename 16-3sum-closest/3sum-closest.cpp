class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        int min_diff = abs(result - target);
        // sort the array
        sort(nums.begin(), nums.end());
        // fix the smallest number as nums[i]
        for (int i = 0; i < nums.size() - 2; i++) {
            // start from i + 1
            int left = i + 1;
            // end at nums.size() - 1
            int right = nums.size() - 1;
            // until left meets right
            while (left < right) {
                // calculate the sum
                int sum = nums[i] + nums[left] + nums[right];
                // update the result if it's closer to the target
                if (abs(sum - target) < min_diff) {
                    result = sum;
                    min_diff = abs(sum - target);
                }
                // if the sum is too small, move left
                if (sum < target) {
                    left++;
                }
                // if the sum is too large, move right
                else {
                    right--;
                }
            }
        }
        return result;
    }
};