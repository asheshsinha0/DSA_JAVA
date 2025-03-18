package array.rverse_array;

public class RecursiveReverseArray {

    // 4. Recursive approach to reverse an array
    // Time complexity is O(n) and space complexity is O(n) because we are using recursion stack
    public static int[] revArray(int[] arr, int l, int r){

       if(l >= r){
           return arr;
       }

       int temp = arr[l];
       arr[l] = arr[r];
       arr[r] = temp;

        return revArray(arr, l+1, r-1);
    }

    public static void main(String[] args) {

        int[] arr = {3,4,1,9,5,8};

        System.out.print("Original arrays: ");
        for(int i : arr){
            System.out.print(i+" ");
        }

        int[] newArr = revArray(arr,0,arr.length - 1);

        System.out.print("\nReversed arrays: ");
        for(int i : newArr){
            System.out.print(i+" ");
        }

    }
}
