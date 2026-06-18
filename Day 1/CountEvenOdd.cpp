#include<iostream>
using namespace std;

int main(){
    int countEven = 0;
    int countOdd = 0;
    int start = 2;
    int end = 19;
    for(int i=start;i<=end;i++){
        if(i%2 == 0){
            countEven++;
        }
        else{
            countOdd++;
            
        }
    }
    cout<<"Count of Even Number: "<<countEven<<endl;
    cout<<"Count of Odd Number: "<<countOdd<<endl;
}