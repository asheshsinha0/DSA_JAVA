public class Sort_01_2 {

    public static void sort012(int[] arr){
        
        int low = 0, mid = 0, high = arr.length - 1;

        // Time complexity O(n) and space complexity is O(1) 
        // loop runs until mid crosses high
        while(mid <= high){
            // mid is traversing through array
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }else if (arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
       
        
    }
    public static void main(String[] args) {
        // System.out.println("hello world");
        int[] arr = {1,0,2,0,2,1};

        sort012(arr);
        for(int i : arr){
                System.out.print(i+" ");
        }

    }
    
}
