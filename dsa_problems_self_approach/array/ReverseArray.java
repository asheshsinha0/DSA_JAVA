import java.util.Arrays;

public class ReverseArray{

    public static void reverse_array(int[] A,int n){


        // time complexity is O(2n) i.e O(n) and space complexity is O(n) also as it takes another array of size n. 

        int[] temp = new int[n];
        int index = 0;

        for(int i = n-1; i >= 0; i--){

            temp[index++] = A[i];

        }


        // A = temp;

        for(int i = 0; i < temp.length; i++){
            A[i] = temp[i];
        }

    }

    public static void main(String[] args) {

        int[] A = {5,4,3,2,1};
        int n = A.length;
       reverse_array(A,n);

        System.out.println(Arrays.toString(A));

        
    }
}