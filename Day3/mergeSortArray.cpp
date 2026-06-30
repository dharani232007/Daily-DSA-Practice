#include <iostream>
#include <vector>

using namespace std;

// Time Complexity: O(N + M)
// Space Complexity: O(N + M) for the merged result
vector<int> mergeSortedArrays(const vector<int>& arr1, const vector<int>& arr2) {
    int n = arr1.size();
    int m = arr2.size();
    vector<int> result;
    result.reserve(n + m);

    int i = 0, j = 0;
    while (i < n && j < m) {
        if (arr1[i] <= arr2[j]) {
            result.push_back(arr1[i++]);
        } else {
            result.push_back(arr2[j++]);
        }
    }

    while (i < n) result.push_back(arr1[i++]);
    while (j < m) result.push_back(arr2[j++]);

    return result;
}

int main() {
    int n, m;
    cout << "Enter size of first sorted array: "; cin >> n;
    vector<int> arr1(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) cin >> arr1[i];

    cout << "Enter size of second sorted array: "; cin >> m;
    vector<int> arr2(m);
    cout << "Enter elements: ";
    for (int i = 0; i < m; i++) cin >> arr2[i];

    vector<int> merged = mergeSortedArrays(arr1, arr2);
    cout << "Merged sorted array: ";
    for (int val : merged) cout << val << " ";
    cout << endl;
    return 0;
}
