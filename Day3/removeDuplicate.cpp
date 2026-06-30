#include <iostream>
#include <vector>

using namespace std;

// Time Complexity: O(N)
// Space Complexity: O(1)
int removeDuplicates(vector<int>& nums) {
    if (nums.empty()) return 0;
    
    int uniqueIdx = 0;
    for (int i = 1; i < nums.size(); i++) {
        if (nums[i] != nums[uniqueIdx]) {
            uniqueIdx++;
            nums[uniqueIdx] = nums[i];
        }
    }
    return uniqueIdx + 1;
}

int main() {
    int n;
    cout << "Enter sorted array size: "; cin >> n;
    vector<int> nums(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) cin >> nums[i];

    int k = removeDuplicates(nums);
    cout << "Unique element count: " << k << "\nModified array: ";
    for (int i = 0; i < k; i++) cout << nums[i] << " ";
    cout << endl;
    return 0;
}
