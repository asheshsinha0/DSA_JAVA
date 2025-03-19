package array.max_min_element;

public class MaxMinElementInArray {

    // time complexity is O(n) and space complexity is O(1)
    public static int minimum(int[] arr){

        // one extra space;
        int min = Integer.MAX_VALUE;

        // loop runs for n times
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    // time complexity is O(n) and space complexity O(1) as one extra space is taken
    public static int maximum(int[] arr){

        // one extra space is used
        int max = Integer.MIN_VALUE;

        // loop runs for n times
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int[] arr = {-1000,3,5,1,7,6,7854689};

/*
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for(int i=0; i<arr.length; i++){

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }

        }

        System.out.println("min is: "+min);
        System.out.println("max is: "+max);
*/

        System.out.println("Minimum value in array is: "+minimum(arr));
        System.out.println("Maximum value in array is: "+maximum(arr));


    }
}
