import java.util.Arrays;

public class RotateArrayCyclicallyByOne {

    public static void rotateArray(int[] arr){

        int temp = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;


    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};


        // original array
        System.out.println("Original arrays: "+Arrays.toString(A));
        
        //array rotated
        rotateArray(A);

        // final rotated array
        System.out.println("Rotated array: "+Arrays.toString(A));

    }

    
}
