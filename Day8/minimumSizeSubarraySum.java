package Day8;

public class minimumSizeSubarraySum {
    //209(LeetCode)


    public int minSubArrayLen(int target, int[] nums) {
         
        int left = 0;
        int min_length = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;

        for(int right = 0; right<n ; right++){

            sum += nums[right];

            while(sum >= target){

                int currentWindowSize = right-left+1;

                min_length = Math.min(currentWindowSize, min_length);

                sum -= nums[left];
                left++;

            }

        }
        return min_length == Integer.MAX_VALUE? 0 : min_length;
   
    }
    
}
