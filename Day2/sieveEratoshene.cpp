#include<iostream>

using namespace std;
//Time complexity of this function is o(nlog(logn)) because it uses a nested loop structure where the outer loop runs up to the square root of n and the inner loop marks multiples of prime numbers, leading to a logarithmic growth in the number of operations as n increases.
int main(){
    int n=5;
    bool isPrime[n+1] =  {true,true,true,true,true,true};
    isPrime[0] = false;
    isPrime[1] = false;
    for(int i=2;i*i<=n;i++){
        if(isPrime[i] == true){
            for(int j = i*i; j<=n;j+=i){
                isPrime[j] = false;
            }
        }
    }
    for(int i=0;i<n;i++){
        if(isPrime[i] == true){
            cout<<i<<" ";
        }
    }
}