#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Time Complexity: O(N)
// Space Complexity: O(1)
int findMaxConsecutiveOnes(vector<int>& nums) {
    int maxCount = 0;
    int currentCount = 0;

    for (int num : nums) {
        if (num == 1) {
            currentCount++;
            maxCount = max(maxCount, currentCount);
        } else {
            currentCount = 0;
        }
    }
    return maxCount;
}

int main() {
    int n;
    cout << "Enter array size: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter elements (0s and 1s): ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    cout << "Max consecutive ones: " << findMaxConsecutiveOnes(nums) << endl;
    return 0;
}
