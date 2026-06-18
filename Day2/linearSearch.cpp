//Linear Search Algorithm in C++

#include<iostream>
using namespace std;

int main(){

    int target;
    cout<<"Enter the target element: ";
    cin>>target;
    int n;
    cout<<"Enter the array size: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the array elements: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    //Linear search Time complexity is o(n)
    for(int i=0;i<n;i++){
        if(arr[i] == target){
            cout<<"Element found at index: "<<i;
            return 0;
        }

    }
}