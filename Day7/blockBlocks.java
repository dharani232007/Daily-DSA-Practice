package Day7;

public class blockBlocks {

    public int minimumRecolors(String blocks, int k) {

        //Time COmplexity = O(N)
//         Input: blocks = "WBBWWBBWBW", k = 7
// Output: 3

        int n = blocks.length();

        int min = Integer.MAX_VALUE;
        int count = 0;

        for(int i = 0 ; i<k ; i++){
            if(blocks.charAt(i) == 'W'){
                count++;
            }
        }
        min = Math.min(count,min);

        for(int i=k ; i<n ; i++){
            if(blocks.charAt(i) == 'W'){
                count++;
            }
            if(blocks.charAt(i-k) == 'W'){
                count--;
            }
            min = Math.min(count, min);
        }
        return min;
        
    }
    
}
