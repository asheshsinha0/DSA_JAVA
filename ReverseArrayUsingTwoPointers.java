package array;

public class ReverseArrayUsingTwoPointers {

    // 2. Using 2 pointers
    // time complexity is O(n)  and space complexity O(1) having one auxiliary space
    public static int[] reversedArray(int[] arr){

        // arr = 1,2,3,4,5,6

        int left = 0;
        int right = arr.length - 1;

        // loop runs for n/2 times for size n
        while(left < right){

            // one extra space is taken
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


        return arr;
    }

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6};

        int[] revArr = reversedArray(arr);

        for(int i : revArr){
            System.out.print(i+" ");
        }

    }
}
