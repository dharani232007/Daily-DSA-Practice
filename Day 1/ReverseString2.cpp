#include<iostream>
using namespace std;
#include<string>

int main(){

     //using for Loop
    string str = "Dharani";
    for(int i = str.size()-1;i>=0;i--){
        cout<<str[i];
    }

    //  //using while Loop
    //  char temp;
    //  int start = 0;
    //  int end = str.size()-1;
    //  while(start<end){
    //     temp = str[start];
    //     str[start] = str[end];
    //     str[end] = temp;
    //     start ++;
    //     end--;
    //  }
    //  cout<<str;
}