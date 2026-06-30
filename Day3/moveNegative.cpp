#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Time Complexity: O(N)
// Space Complexity: O(1) (In-place partition)
void moveNegatives(vector<int>& arr) {
    int left = 0;
    int right = arr.size() - 1;

    while (left <= right) {
        if (arr[left] < 0 && arr[right] < 0) {
            left++;
        } else if (arr[left] >= 0 && arr[right] < 0) {
            swap(arr[left], arr[right]);
            left++;
            right--;
        } else if (arr[left] >= 0 && arr[right] >= 0) {
            right--;
        } else {
            left++;
            right--;
        }
    }
}

int main() {
    int n;
    cout << "Enter array size: "; cin >> n;
    vector<int> arr(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) cin >> arr[i];

    moveNegatives(arr);
    cout << "Array after moving negatives: ";
    for (int val : arr) cout << val << " ";
    cout << endl;
    return 0;
}
