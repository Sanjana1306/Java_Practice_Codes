import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        separateString();
//        reverseString();

        //missingNumber

//        int arr[]= {1} ;
//        int n=2;
//        missingNumber(arr,n);

        //EquilibirumPoint

//        long arr[]={1,3,5,2,2};
//        int n=arr.length;
//        System.out.println(equilibriumPoint(arr,n));

//        long n=3;
//        long a[]={1,1,3};
//        long b[]={6,5,4};
//        System.out.println(minValue(a,b,n));

//        int[] A = {1, 2, 3, 4,5,6,7,8};
//        int[] B = {1,2,3,1};
//
//        if (isSubset(A, B)) {
//            System.out.println("B is a subset of A");
//        } else {
//            System.out.println("B is not a subset of A");
//        }
    }

    public static boolean isSubset(int[] a1, int[] a2) {

        Map<Long, Integer> frequencyMap = new HashMap<>();

        // Populate frequencyMap for array A
        for (long num : a1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check if all elements of B are present in A with appropriate frequency
        for (long num : a2) {
            if (!frequencyMap.containsKey(num) || frequencyMap.get(num) == 0) {
                return false; // Element not found in A or frequency exhausted
            }
            frequencyMap.put(num, frequencyMap.get(num) - 1); // Reduce frequency count
        }

        return true;
    }

    public static long minValue(long a[], long b[], long n)
    {
        long mul=0;
        Arrays.sort(a);
        Arrays.sort(b);

        int i=0;
        for(int j = (int) n-1; j>=0; j--){

            mul+=a[i]*b[j];
            i++;
        }
        return mul;
    }

    private static int equilibriumPoint(long arr[], int n) {

        long totalSum=0;
        long leftSum=0;

        for(long i:arr){
            totalSum+=i;
        }

        for(int i=0;i<n;i++){

            totalSum-=arr[i];
            if(leftSum==totalSum){
                return i+1;
            }

            leftSum+=arr[i];
        }

        return -1;
    }
    private static void missingNumbers(int[] array, int n) {

        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(array);

        for (int i = 0; i < n-1; i++) {

            if (array[i] != i + 1 ) {
                res.add(i + 1);
                break;
            }
        }

        for (Integer re : res) {
            System.out.println(re);
        }
    }

    private static void missingNumber(int arr[], int n) {

        int totalSum = (n * (n + 1)) / 2;

        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        System.out.println(totalSum - arrSum);

    }

    private static void reverseString(){

        String originalSentence = "Hello, how are you today?";

        String[] words = originalSentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        System.out.println( reversedSentence.toString().trim());

        String Str="Hh";
        String[] reversed=Str.split("\\.");

        StringBuilder reversedSentence2 = new StringBuilder();

        for (int i = reversed.length - 1; i >= 0; i--) {
            reversedSentence2.append(reversed[i]).append(" ");
        }
        System.out.println(reversedSentence2.toString().trim());

    }
    private static void separateString(){
        String str
                = "GeeksforGeeks:A:Computer:Science:Portal";
        String[] arrOfStr = str.split(":");

        for (String a : arrOfStr)
            System.out.println(a);
    }

}