package Day8;

public class maxConsecutiveOnes {

    //1004 - Leedcode
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int left = 0;
        int maxLen = Integer.MIN_VALUE;
        int zeroCount = 0;

        for(int right = 0; right < n ;right++){
            if(nums[right] == 0){
                zeroCount++;
            }

           
            while(zeroCount > k ){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);


        }
        return maxLen;

        
    }
    
}
