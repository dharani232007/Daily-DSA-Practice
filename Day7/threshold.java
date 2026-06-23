package Day7;



public class threshold {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
       //Time Complexity : O(N^2)

        // int n = arr.length;
        // int average = 0;
        // int count = 0;

        // for(int i=0 ; i<=n-k ; i++) {
        //     int sum = 0;
        //     for(int j = i ; j<i+k ; j++){
        //         sum += arr[j];
        //     }
        //     average = sum/k;
        //     if(average >= threshold){
        //         count++;
        //     }
        // }
        // return count;


        int count = 0;
        int sum = 0;
        int average = 0;
        int n = arr.length;

        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        average = sum/k;
        if(average >= threshold){
            count++;
        }

        for(int i = k ; i < n ;i++){
            sum += arr[i] - arr[i-k];

            average = sum/k;
            if(average >= threshold){
                count++;
            }
        }
        return count;

    }
    
}
