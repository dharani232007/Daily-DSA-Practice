#include<iostream>
using namespace std;

// Sum of first n natural number using recursion
// Time complexity of this function is o(n) because it makes a single recursive call for each non-base case, leading to a linear growth in the number of calls as n increases.
int recursionSum(int n){
    if(n==0){
        return 0;
    }
    
    return n+recursionSum(n-1);   

}

// Factorial of a number using recursion
// Factorial time complexity is o(n) because it makes a single recursive call for each non-base case, leading to a linear growth in the number of calls as n increases.
int factorial(int n){
    if(n ==0){
        return 0;
    }
    if(n ==1){
        return 1;
    }
    return n*factorial(n-1);
}

//Fibonacci series using recursion
//Fibonacci series time complexity is o(2^n) because it makes two recursive calls for each non-base case, leading to an exponential growth in the number of calls as n increases.
int fibonacci(int n){
    if(n == 0){
        return 0;
    }
    if(n == 1){
        return 1;
    }

    return fibonacci(n+1)+factorial(n-2);


}
/*Fibonacci using iteration O(n)
Fibonacci using Dynamic Programming (Memoization) O(n)
Fibonacci using Space Optimization O(1) */

int main(){
    int n;
    cout<<"Enter the number: ";
    cin>>n;
    cout<<"Sum of the Element: "<<recursionSum(n);
    cout<<"\nFactoraial of the Element: "<<factorial(n);
    cout<<"\nFibonacci of the Element: "<<fibonacci(n);
}