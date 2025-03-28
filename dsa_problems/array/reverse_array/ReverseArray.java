package array;

public class ReverseArray {

    // 1. Naive Approach using temporary array
    // Time complexity is --> O(n) and space complexity is O(n) 
    public static int[] reversedArray(int[] arr){

	// extra space of size n is taken so auxiliary space is O(n)
        int[] temp = new int[arr.length];
        int index=0;
        for(int i=arr.length - 1; i >= 0; i--){
            temp[index++] = arr[i];

        }

        return temp;
    }

    public static void main(String[] args) {
        // array to reverse with length 5
        int[]   arr = {2,1,5,7,9};

        int[] newArray = reversedArray(arr);
        for(int i : newArray){
            System.out.print(i+" ");
        }

    }
}
