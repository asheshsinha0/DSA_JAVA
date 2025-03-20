public class MoveNegativeOneEndTwoPassApproach {

    public static int[] moveNeg(int[] arr){

        int count = 0;
        // counting negative numbers
        for(int i : arr){
            if(i < 0){
                count++;
            }
        }

        int i = 0;

        for(int j=0; j<count; j++){
            while (i < arr.length && arr[i] >= 0) {
                    i++;
            }

            // swap values
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        
        // int[] arr = {-6,5,-3,-2,1};
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.print("Original array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }

        int[] updatedArray = moveNeg(arr);

        System.out.print("\nUpdated array: ");
        for(int i : updatedArray){
            System.out.print(i+" ");
        }



    }
}
