public class Sort012CountintApproach {

    // Time complexity O(n) (Two passes: one for counting one for overwriting)
    // Space complexity O(1) (No extra array is used)
    public static void sort012Counting(int[] arr){

        int zero = 0, one = 0, two = 0;

        //---------------------------------------------------------
        /* 
                int index=0;
                while(index <= arr.length - 1){
        
                    if(arr[index] == 0){
                        zero++;
                    }else if(arr[index] == 1){
                        one++;
                    }else{
                        two++;
                    }
        
                    index++;
                }
        
            */
        // ------------------------------------------------------------
           /*  for(int num : arr){
                if(num == 0){
                    zero++;
                }else if(num == 1){
                    one++;
                }else{
                    two++;
                }
            } */
        
            // --------------------------------------------------------------

            for(int i = 0; i < arr.length; i++){
               if(arr[i] == 0) {
                zero++;
               }else if(arr[i] == 1){
                one++;
               }else{
                two++;
               }
                     
            }       
        
            
        
        
        
                System.out.println("\nzero is: "+zero);
                System.out.println("one is: "+one);
                System.out.println("two is: "+two);


// -----------------------------------------------------------------------------------
        /* 
                int i = 0;
                while(zero > 0){
                    arr[i] = 0;
                    i++;
                    zero--;
                }
                // i = 0;
                while(one > 0){
                    arr[i] = 1;
                    i++;
                    one--;
                }
                // i = 0;
                while(two > 0){
                    arr[i] = 2;
                    i++;
                    two--;
                } 
        */
// ---------------------------------------------------------------------------------------
        
                int i=0;
               while(zero-- > 0 ){
                    arr[i++] = 0;
               }
        
               while(one-- > 0){
                    arr[i++] = 1;
               }
        
               while(two-- > 0){
                    arr[i++] = 2;
               }

    }
    public static void main(String[] args) {
        
        int[] arr = {2, 0, 2, 1, 1, 0, 2, 2, 0, 0, 0, 1, 0, 2};

        System.out.print("Before sorting: ");
        for(int i : arr){
            System.out.print(i+" ");
        }


        
       sort012Counting(arr);



       System.out.print("After sorting: ");
       for(int j : arr){
            System.out.print(j+" ");
       }


    }
}
