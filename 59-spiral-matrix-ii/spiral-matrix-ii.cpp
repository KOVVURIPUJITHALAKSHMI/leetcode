class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        // Create an n x n matrix
        vector<vector<int>> matrix(n, vector<int>(n));
        // Initialize start row, start column, end row, end column
        int r1 = 0, c1 = 0, r2 = n - 1, c2 = n - 1;
        // Initialize counter
        int num = 1;
        // Loop while start row is less than or equal to end row and start column is less than or equal to end column
        while (r1 <= r2 && c1 <= c2) {
            // Loop from start column to end column
            for (int c = c1; c <= c2; c++) {
                // Set current element to counter
                matrix[r1][c] = num;
                // Increment counter
                num++;
            }
            // Increment start row
            r1++;
            // Loop from start row to end row
            for (int r = r1; r <= r2; r++) {
                // Set current element to counter
                matrix[r][c2] = num;
                // Increment counter
                num++;
            }
            // Decrement end column
            c2--;
            // Loop from end column to start column
            for (int c = c2; c >= c1; c--) {
                // Set current element to counter
                matrix[r2][c] = num;
                // Increment counter
                num++;
            }
            // Decrement end row
            r2--;
            // Loop from end row to start row
            for (int r = r2; r >= r1; r--) {
                // Set current element to counter
                matrix[r][c1] = num;
                // Increment counter
                num++;
            }
            // Increment start column
            c1++;
        }
        // Return matrix
        return matrix;
    }
};