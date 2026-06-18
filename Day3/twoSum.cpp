#include<iostream>
using namespace std;
#include<vector>
#include<algorithm>

vector<int>sumTwo(const vector<int>& nums, int target){
        //BrustForce Approach
        
        // int n = nums.size();
        
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j] == target){
        //            return{i,j};
        //         }
                
        //     }

        // }
        // return {};


        //Optimize the Code

        int n =nums.size();

        vector<pair<int,int>>arr;
        for(int i=0;i<n;i++){
            arr.push_back({nums[i],i});
        }
        sort(arr.begin(), arr.end());

        int s=0;
        int e = n-1;
        while(s<e){
            
            if(arr[s].first + arr[e].first == target){
                return{arr[s].second , arr[e].second};
            }

            else if(arr[s].first + arr[e].first < target){
                s++;
            }
            else{
                e--;
            }
        }
        return{};
        
}

int main(){

    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;
    vector<int> nums(n); 
    cout<<"Enter the elements of the array: ";
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
    int target;
    cout<<"Enter the target: ";
    cin>>target;

    vector<int> result = sumTwo(nums, target);

    if (!result.empty()) {
        cout << "Indices found: [" << result[0] << ", " << result[1] << "]" << endl;
    } else {
        cout << "No two sum solution found." << endl;
    }

    return 0;



}