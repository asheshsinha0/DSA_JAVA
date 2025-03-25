public class MaxMinEle {

    // public static int minVal(int[] A, int n){
    //     int min = Integer.MAX_VALUE;

    //     for(int i = 0; i < n; i++){
    //         if(A[i] < min){
    //             min = A[i];
    //         }
    //     }

    //     return min;
    // }

    public static int minVal(int[] A, int n){
        int min = A[0];

        for(int i = 1; i < n; i++){
            if(A[i] < min){
                min = A[i];
            }
        }

        return min;
    }

    public static int maxVal(int[] A, int n){
        int max = Integer.MIN_VALUE;

        for(int i=0; i < n; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] A = {8,5,3,9,6, 5000,-1000};
        int n = A.length;

        int minimum = minVal(A, n);
        System.out.println("Minimum value is: "+minimum);

        int maximum = maxVal(A, n);
        System.out.println("Maximum value: "+maximum);

       
    }
    
}
