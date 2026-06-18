#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter a Number: ";
    cin>>n;
    string str = to_string(n);
    cout<<"Length of the Digit: "<<str.size()<<endl;
}