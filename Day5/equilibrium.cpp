#include<iostream>
#include<numeric>
#include<vector>
using namespace std;

int findEquilibrium(vector<int> &arr) {
    
        
        
    // //Time complexity - O(N)
    // //Space Complexity - O(N)
    // int n= arr.size();
    // vector<int>prefix(n);
    // vector<int>suffix(n);
        
    // prefix[0] = arr[0];
    // for(int i=1;i<n;i++){
             
    //      prefix[i] = prefix[i-1] + arr[i];
    // }
        
    // suffix[n-1] = arr[n-1];
    // for(int i=n-2;i>=0;i--){
            
    //     suffix[i] = suffix[i+1]+arr[i];
    // }
        
    // for(int i=0;i<n;i++){
    //     if(prefix[i] == suffix[i]){
    //         return i;
    //     }
    // }
    // return -1;
        
        
    //TIme complexity : O(N)
    //Space complexity : O(1)
    int n = arr.size();
    int total_sum = accumulate(arr.begin(),arr.end(),0);
        
    int left_sum = 0;
        for(int i=0;i<n;i++){
            int right_sum = total_sum - left_sum - arr[i];
            
            if(left_sum == right_sum){
                return i;
            }
            left_sum += arr[i];
            
        }
        
        return -1;
        
        
    }

int main(){
    int n;
    cout<<"Enter the array size: ";
    cin>>n;

    vector<int>arr(n);
    cout<<"Enter the array Element: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Equilibrium Index: "<<findEquilibrium(arr)<<endl;
}