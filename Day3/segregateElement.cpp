#include <iostream>
#include <vector>

using namespace std;

// Time Complexity: O(N)
// Space Complexity: O(N) to preserve order
void segregateElements(vector<int>& arr) {
    vector<int> positives;
    vector<int> negatives;

    for (int val : arr) {
        if (val >= 0) positives.push_back(val);
        else negatives.push_back(val);
    }

    int idx = 0;
    for (int val : positives) arr[idx++] = val;
    for (int val : negatives) arr[idx++] = val;
}

int main() {
    int n;
    cout << "Enter array size: "; cin >> n;
    vector<int> arr(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) cin >> arr[i];

    segregateElements(arr);
    cout << "Segregated array: ";
    for (int val : arr) cout << val << " ";
    cout << endl;
    return 0;
}
