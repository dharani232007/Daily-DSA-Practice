//Time Complexity: O(N X K)
    // static boolean isVowel(char ch){
    //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'||ch == 'u'){
    //         return true;
    //     }
    //     return false;
    //  }
    // public int maxVowels(String s, int k) {

    //     int maxCount = 0;
    //     int n = s.length();

    //     for(int i=0 ; i<=n-k ;  i++){
    //         int count = 0;
    //         for(int j =i ; j<k+i ; j++){
    //             if(isVowel(s.charAt(j))){
    //                 count++;
    //             }
    //         }
    //         maxCount = Math.max(count, maxCount);
    //     }
    //     return maxCount;
        
    // }

        //    int vCount = 0;

        //    for(int i=0;i<k;i++){
        //         if(isVowel(s.charAt(i))){
        //             vCount+;+
        //         }
        //     }
        //     int maxCount = vCount;

        //     for(int i = k ; i<n ; i++){
        //         if(isVowel(s.charAt(i))){
        //             vCount++;
        //         }
        //         if(isVowel(s.chatAt(i-k))){
        //             vCount--;
        //         }
        //         maxCount = Math.max(vCount, maxCount);
        //     }
        //     return maxCount;

// Input: s = "abciiidef", k = 3
// Output: 3

   //Time Complexity - O(N)
    static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'||ch == 'u'){
            return true;
        }
        return false;
     }
    public int maxVowels(String s, int k) {

        int maxCount = 0;
        
        int n = s.length();
        int VCount = 0;
        int i = 0;
        int j = 0;


        while(j<n){
            
            if(isVowel(s.charAt(j))){
                VCount++;
            }

            if(j-i+1 < k){
                j++;
            }
            
            else if(j-i+1 == k){
                maxCount = Math.max(VCount , maxCount);

                if(isVowel(s.charAt(i))){
                    VCount--;
                }
                j++;
                i++;
            }

        }
        return maxCount;
    }