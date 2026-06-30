#include <iostream>
#include <vector>
#include <climits>
#include <algorithm>

using namespace std;

// Time Complexity: O(N)
// Space Complexity: O(1)
int maxSubArray(vector<int>& nums) {
    int maxSum = INT_MIN;
    int currentSum = 0;

    for (int num : nums) {
        currentSum += num;
        maxSum = max(maxSum, currentSum);
        
        if (currentSum < 0) {
            currentSum = 0;
        }
    }
    return maxSum;
}

int main() {
    int n;
    cout << "Enter array size: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter array elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Maximum subarray sum is: " << maxSubArray(nums) << endl;
    return 0;
}
