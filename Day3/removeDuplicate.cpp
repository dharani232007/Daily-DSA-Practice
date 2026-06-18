#include <iostream>
#include<vector>
using namespace std;

int main() {
    
    int n;
    cout<<"Enter the array size: ";
    cin>>n;

    vector<int>arr(n);
    cout<<"Enter the array in sort format: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int i=0;
    for(int j=1;j<n;j++){
        if(arr[j] != arr[i]){
            i++;
            arr[i] = arr[j];
        }
    }
    
    cout<<"Original Array to remove the Duplicate: ";
    for(int k=0 ; k<i+1 ; k++){
        cout<<arr[k]<<" ";
    }
    

    
}