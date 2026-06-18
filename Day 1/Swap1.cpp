// Swap Two Number
#include <iostream>
using namespace std;

int main()
{
    int a = 10;
    int b = 5;
    cout << "Before Swapping: a =" << a << " b = " << b << endl;
    int temp = a;
    a = b;
    b = temp;
    cout << "After Swapping: a =" << a << " b = " << b << endl;
}