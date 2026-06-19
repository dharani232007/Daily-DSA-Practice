#include<iostream>
using namespace std;

int pivotIndex(int n, int*arr){

   //Brut force Approch (TC: O(N^2), SC: O(1))
     
    for(int i=0 ; i<n ; i++){
        int left_sum = 0;
        int right_sum = 0;

        if(i-1>=0){
            for(int j=0;j<i;j++){
                left_sum += arr[j];
            }
        }

        for(int k = i+1 ; k<n ; k++){
            right_sum += arr[k];
        }

        if(left_sum == right_sum){
            return i;
        }
    }
    return -1;

    //Optimize the code(Time complexity: O(N), space complexity O(N))


    // int n = nums.size();
    //     int total_sum = accumulate(nums.begin(),nums.end(),0);
        
    //     for(int i=0;i<n;i++){

    //         int leftS = 0;
    //         int rightS = 0;

            
    //         rightS = total_sum - leftS - nums[i];

    //         if(rightS == leftS){
    //             return i;
    //         }
            
    //         leftS += nums[i]
    //     }
    //     return -1;
        
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

    cout<<"Pivot Index of the array is "<<pivotIndex(n,arr);

}