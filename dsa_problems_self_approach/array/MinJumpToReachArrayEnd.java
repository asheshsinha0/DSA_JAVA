public class MinJumpToReachArrayEnd {

    public static int minJump(int[] A){

        // 1,4,3,2,6,2
        // length = 5

        int index = 0, count = 0;
        int noOfLoops = 0;

        for(int i = 0; i < A.length; i++){

            if(A[i] == 0){
                return -1; 
            }else if(index < A.length){ 
                index = i + A[i];
                count++;            
            }

            noOfLoops++;
            if(index == A.length-1){
                break;
            }

            
        }

        System.out.println("Loops run: "+noOfLoops);

        return count;
    }

    public static void main(String[] args) {

        int[] A = {1,4,3,2,6,2};

        int jump = minJump(A);

        System.out.println("Minimum jumps to reach an array end : "+jump);
        
    }
    
}
