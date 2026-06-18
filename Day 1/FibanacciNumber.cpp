
#include <iostream>
using namespace std;

int main() {
    
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    int f0 = 0;
    int f1 = 1;

    if(n<=0){
        cout<<-1;
    
    }
    if(n==1){
        cout<<f0;
    }
     if(n==2){
        cout<<f0  <<f1;
    }
    
    cout<<f0<<" "<<f1<<" ";
    for(int i=2;i<n;i++){
        int sum = f0+f1;
        cout<<sum<<" ";
        f0 = f1;
        f1 = sum;
    }
    
    
}