#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Time Complexity: O(N)
// Space Complexity: O(1)
void moveZeroes(vector<int>& nums) {
    int insertPos = 0;
    for (int i = 0; i < nums.size(); i++) {
        if (nums[i] != 0) {
            swap(nums[insertPos], nums[i]);
            insertPos++;
        }
    }
}

int main() {
    int n;
    cout << "Enter array size: "; cin >> n;
    vector<int> nums(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) cin >> nums[i];

    moveZeroes(nums);
    cout << "Array after moving zeroes: ";
    for (int val : nums) cout << val << " ";
    cout << endl;
    return 0;
}
