// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the Array Element: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    
    cout<<"Square of the Array Element: ";
    for(int i=0;i<n;i++){
        
        cout<<arr[i]*arr[i]<<" ";
    }
}