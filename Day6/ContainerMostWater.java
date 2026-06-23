package Day6;

import java.util.Scanner;

public class ContainerMostWater{

    public static int maxContainer(int[] height){
        //Time Complexity: O(N)
        //Space Complexity: O(1)

        int maxWater = 0;  //O(1)
        int n = height.length;  //O(1)
        int start = 0; //O(1)
        int end = n-1;  //O(1)

        while(start<end){ //O(N)
           int width = end - start;  //O(1)
           int minheight = Math.min(height[start],height[end]); //O(1)

           if(maxWater < width * minheight){
                maxWater = width * minheight;
           }

           if(height[start]<height[end]){
               start++;    
           }

           else{
                end--;
           }
        }
        return maxWater;

    }


    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the array size: ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    System.out.print("Enter the array: ");

    for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
    }


    System.out.println("Maximum amount of the water is "+ maxContainer(arr));


}

}
