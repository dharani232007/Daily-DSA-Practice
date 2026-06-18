#include<iostream>
using namespace std;
#include<vector>

int main(){
    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;

    int arr[n];
    cout<<"Enter the array element: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int c0 = 0;
    vector<int>ans;
    for(int i=0;i<n;i++){
        if(arr[i] == 0){
            c0++;
        }
        else{
            ans.push_back(arr[i]);
        }
    }
    
    for(int i=0;i<c0;i++){
        ans.push_back(0);
    }
     
    cout<<"Move all Zeros to end: ";
    for(int i=0 ; i<n ;i++){
        cout<<ans[i]<<" ";
    }

    //Time complexity - O(N^3)
    //Space complexity - O(N)



}