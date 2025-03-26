import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeArray(int[] arr1, int[] arr2){

        int m = arr1.length; 
        int n = arr2.length;
        int[] temp = new int[m + n];

        int i = 0, j = 0, k = 0;

        // If number from first array repeats in second array then we should consider or not
        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                temp[k] = arr1[i];
                i++;
                k++;
            }else{
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < m){
            temp[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n){
            temp[k] = arr2[j];
            j++;
            k++;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] A = {1,6,7,9};
        int [] B = {1,3,4,5};
        // int m = A.length;
        // int n = B.length;
        // int [] C = new int[m + n];
       int[] C = mergeArray(A,B);

        System.out.println(Arrays.toString(C));
    }
    
}
