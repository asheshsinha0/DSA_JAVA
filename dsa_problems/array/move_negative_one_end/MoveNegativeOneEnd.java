public class MoveNegativeOneEnd{


    //Time complexity is O(n) and space complexity is O(1)
    // Quick Sort partition approach 
    public static void moveNegOneEnd(int[] arr){


        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

    }
    public static void main(String[] args) {
        
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        moveNegOneEnd(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}