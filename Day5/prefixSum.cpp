#include<iostream>
#include<vector>
using namespace std;

int prefixsum(vector<int>&prefix,int i, int j){

    
    return(prefix[j]-prefix[i-1]);
}

int main(){
    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the array element: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int q;
    
    cout<<"Enter the Query: ";
    cin>>q;

    vector<int>prefix(n);

    prefix[0] = arr[0];

    for(int i=1;i<n;i++){
       prefix[i] = prefix[i-1]+arr[i];
    }

    while(q--){
        int start,end;
        cout<<"Enter the start and End index: ";
        cin>>start>>end;

        cout<<prefixsum(prefix,start,end)<<endl;
        
    }

    
}