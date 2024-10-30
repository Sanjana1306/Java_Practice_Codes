import java.util.Arrays;
import java.util.Vector;

import static java.lang.StringTemplate.STR;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class Java_Vector {

    public static void main(String[] args) {

        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8};
        long X = 9;
        long N=A.length;
        long M=B.length;
        pair[] ans=allPairs(A,B,N,M,X);
        int sz=ans.length;
        for(int i=0;i<sz;i++){
            System.out.println(STR."\{ans[i].first},\{ans[i].second}");
        }
    }

    private void vector_fuctn(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Accessing elements using index
        System.out.println("First element: " + vector.get(0));

        // Iterating through the Vector
        System.out.println("All elements:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Removing an element
        vector.remove("Banana");

        // Checking the size of the Vector
        System.out.println("Size of vector after removal: " + vector.size());
    }

    public static pair[] allPairs(long A[], long B[], long N, long M, long X) {
        Arrays.sort(A);
        Arrays.sort(B);

        //Declaration of Vectors
        Vector<pair[]> pairs = new Vector<>();

        int i = 0;
        int j = (int) M - 1; // Convert M to int

        while (i < N && j >= 0) {
            if (A[i] + B[j] == X) {
                // Create a new pair array and add it to the Vector
                pairs.add(new pair[]{new pair(A[i], B[j])});
                i++;
                j--;
            } else if (A[i] + B[j] < X) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(pairs);

        // Convert Vector to array of pairs
        pair[] result = new pair[pairs.size()];
        for (int k = 0; k < pairs.size(); k++) {
            result[k] = pairs.get(k)[0];
        }
        return result;
    }
}


