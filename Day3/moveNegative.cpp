#include<iostream>
using namespace std;
#include<vector>
#include<utility>

int main(){

    //Brutforce approach

    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;

    int arr[n];
    cout<<"Enter the array element(postive and negative): ";
    for(int i=0;i<n ; i++){
        cin>>arr[i];
    }

    vector<int>pos;
    vector<int>neg;
    for(int i = 0 ; i<n ; i++){
        if(arr[i]<0){
            neg.push_back(arr[i]);
        }
        else{
           pos.push_back(arr[i]);
        }
        
    }

    for(int i=0;i<neg.size(); i++){
        pos.push_back(neg[i]);
    }

    cout<<"Move the negative element in end of the array: ";
    for(int i=0 ; i<n ; i++){
        cout<<pos[i]<<" ";
    }

    //Time complexity: O(N^3)
    //Space complexity: O(N)

    //optimize code

    int start = 0;
    int end = n-1;

    while(start<end){
        if(arr[start]>0){
            start++;
        }
        else if(arr[end]<0){
            end--;
        }
        else{
            // int temp = arr[start];
            // arr[start] = arr[end];
            // arr[end] = temp;
            swap(arr[start], arr[end]);
        }
    }
    cout<<"Move the negative element in end of the array: ";
    for(int i=0 ; i<n ; i++){
        cout<<arr[i]<<" ";
    }

    //Time complexity: O(N^2);
    //space complexityL O(1);

}