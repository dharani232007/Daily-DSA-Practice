#include<iostream>
using namespace std;
;
int main(){
    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the Array Element";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int target;
    cout<<"Enter the target element: ";
    cin>>target;
    int start = 0;
    int end = n-1;
    while(start<=end){
        int mid = (start+end)/2;
        if(arr[mid] == target){
            cout<<"Element found at index: "<<mid;
            return 0;
        }
        else if(arr[mid]<target){
            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
    cout<<"Element not found in the array";

}

