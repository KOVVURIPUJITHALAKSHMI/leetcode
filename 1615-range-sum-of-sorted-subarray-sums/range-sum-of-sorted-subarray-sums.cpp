class Solution {
public:
    int rangeSum(std::vector<int>& nums, int n, int left, int right) {
        const int MOD = 1e9 + 7;
        std::vector<int> subarraySums;

        for (int i = 0; i < n; ++i) {
            int sum = 0;
            for (int j = i; j < n; ++j) {
                sum += nums[j];
                subarraySums.push_back(sum);
            }
        }

        std::sort(subarraySums.begin(), subarraySums.end());

        long long result = 0;
        for (int i = left - 1; i < right; ++i) {
            result = (result + subarraySums[i]) % MOD;
        }

        return static_cast<int>(result);
    }
};