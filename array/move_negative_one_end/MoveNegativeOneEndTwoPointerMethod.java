public class MoveNegativeOneEndTwoPointerMethod {

    public static int[] moveNegAtOneEnd(int[] arr){

        int left = 0, right = arr.length - 1;

       while(left < right){

        while(left < right && arr[left] < 0){
            left++;
        }

        while(right > left && arr[right] > 0){
            right--;
        }

        if(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

       }

        return arr;
    }
    public static void main(String[] args) {
        
        // int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] arr = {-6, 5, -3, -2, 1};

        System.out.print("Original array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }

        int[] updatedArray = moveNegAtOneEnd(arr);

        System.out.print("\nUpdated array: ");
        for(int i : updatedArray){
            System.out.print(i+" ");
        }

    }
}
