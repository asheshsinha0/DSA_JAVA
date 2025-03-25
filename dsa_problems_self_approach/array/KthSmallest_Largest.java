import java.util.Arrays;

public class KthSmallest_Largest {


    public static int kthSmallest(int[] A, int k){

        // Arrays.sort(A);

        // System.out.println(Arrays.toString(A));

        // Can this sortring technique be called bubble sort.
        int n = A.length;
        for(int i = 0; i < n - 1; i++){

            for(int j = i+1; j < n; j++){
                if(A[i] > A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }

        }


        return A[k - 1];
    }

    public static int kthLargest(int [] A, int k){

        // time complexity is O(n logn)
        Arrays.sort(A);

        return A[A.length - k];
    }

    public static void main(String[] args) {
        
        int[] A = {8,5,3,9,6};

        int k = 2;

        int kth_smallest = kthSmallest(A,k);

        System.out.println(Arrays.toString(A));

        System.out.println(k+"th smallest element is: "+kth_smallest);

        int k_largest = kthLargest(A, k);
        System.out.println(k+"th largest element is: "+k_largest);

    }
    
}
