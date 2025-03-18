package array;

public class ReverseArrayBySwappingElements {

    // 3. swapping two elements
    // time complexity is O(n) and space complexity is O(1) only one auxiliary space is used
    public static int[] reverseBySwappingElements(int[] arr){

        int n = arr.length;

        // loop runs for n/2 times
        for(int i=0; i < n/2; i++){

            // one extra space is used
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;

        }

        return arr;
    }
    public static void main(String[] args) {

        int[] arr = {1,3,2,4,5,12};

        int[] newArr = reverseBySwappingElements(arr);

        for(int i : newArr){
            System.out.print(i+" ");
        }

    }
}
