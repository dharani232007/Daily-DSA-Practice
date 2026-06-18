#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter a Number: ";
    cin>>n;
    int arr[n];
    cout << "Enter the Elements of the Array: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }   
    int lar = -1;
    int SecondLar = -1;
    for(int i=0;i<n;i++){
        if(arr[i]>lar){
            lar = arr[i];
        }
    }

    for(int i=0;i<n;i++){
        if(arr[i]>SecondLar && arr[i] != lar){
            SecondLar = arr[i];
        }
    }

    cout<<"Largest Element: "<<lar<<endl;
    cout<<"Second Largest Element: "<<SecondLar<<endl;
}