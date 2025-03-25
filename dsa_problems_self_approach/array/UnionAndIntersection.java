import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionAndIntersection {

    public static Set<Integer> union(int[] A, int[] B){
        Set<Integer> temp = new HashSet<>();

        for(int i = 0; i < A.length; i++){

            for(int j = 0; j < B.length; j++){
                if(A[i] == B[j] || A[i] != B[j]){
                    temp.add(A[i]);
                }
            }

        }

        return temp;
    }

    public static Set<Integer> intersection(int[] A, int[] B){
        Set<Integer> temp = new LinkedHashSet<>();

      
        int n = A.length;
        int m = B.length;
       
      
            for(int i = 0; i < n; i++){

                for(int j = 0; j < m; j++){
                    if(A[i] == B[j]){
                        temp.add(A[i]);
                    }
                }
            }

        return temp;

    }

    public static void main(String[] args) {
       
        int[] A = {1,2,5,3};
        int[] B = {1,5,3};

        Set<Integer> intersectionSet = intersection(A,B);

        System.out.println("Intersection is: "+intersectionSet);

        Set<Integer> unionSet = union(A, B);
        System.out.println("Union is: "+unionSet);

    }
    
}
