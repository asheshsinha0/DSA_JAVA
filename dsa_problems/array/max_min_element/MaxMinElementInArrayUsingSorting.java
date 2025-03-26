package array.max_min_element;

public class MaxMinElementInArrayUsingSorting {

    static int max;
    static int min;

    // time complexity of this program is O(n2) and space complexity is O(1)
    public static void sortArray(int[] arr){

        int temp = 0;
        for(int i=0; i<arr.length; i++){
           for(int j=i; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
           }
        }
    }


    public static void main(String[] args) {

        int[] arr = {-1000,3,5,1,7,6,7854689};

        sortArray(arr);
        // as array is sorted in ascending order now so, min value will be at 0th index and max at last index of the array
        min = arr[0];
        max = arr[arr.length - 1];

        for(int i : arr){
            System.out.print(i+" ");
        }

        System.out.println("\nMinimum value is: "+min);
        System.out.println("Maximum value is: "+max);


    }
}
