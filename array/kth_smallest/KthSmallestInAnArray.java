package array.kth_smallest;

public class KthSmallestInAnArray {

    // time complexity of this program is O(n^2) and space complexity is O(1)
    public static int kthSmallest(int[] arr, int k){

        int temp = 0;
        // Outer loop runs n times
        if(k > 0 && k <= arr.length){
            for(int i=0; i<arr.length; i++){
                // Inner loop runs n times for each iteration of outer loop
                for(int j=i; j<arr.length; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr[k - 1];
        }else{
            return -1;
        }



    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};

        
        int k = 6;

       int element =  kthSmallest(arr,k);
        System.out.println(k+"th smallest element is: "+element);

    }
}
