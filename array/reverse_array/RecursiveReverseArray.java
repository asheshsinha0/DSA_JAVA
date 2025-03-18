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


//        System.out.print("arr is : ");
//       for(int i : arr){
//           System.out.print(i+" ");
//       }
//        System.out.println();

        return revArray(arr, l+1, r-1);

//       ------------------------------------------------------------------
 /*
         Difference between this approach and above approach
        int[] smallOutput = revArray(arr, l+1, r-1);
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return smallOutput;
 */
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        System.out.print("Original array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

        int[] newArr = revArray(arr,0,arr.length - 1);

        System.out.print("\nReversed array: ");
        for(int i : newArr){
            System.out.print(i+" ");
        }

    }
}
