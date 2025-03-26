public class FindDuplicateElement {

    public static int dupEle(int[] A, int n){

        for(int i = 0; i < n - 1; i++){

            // checking index i with all others indices one by one
           for(int j = i + 1; j < n; j++){
            // checking if number is reepeated
                if(A[i] == A[j]){
                    return A[i];
                }
           }
        }

        return -1;


    }
    public static void main(String[] args) {
        
        int arr[] = {3,3,3,3,3};
        // int arr[] = {8,3,1,3,4,2};

        int dup = dupEle(arr, arr.length);

        System.out.println("Duplicate element is: "+dup);

    }
}
