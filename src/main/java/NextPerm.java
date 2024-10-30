public class NextPerm {
        static int[] permutate(int[] arr) {
    int indexEle = -1;
    int n = arr.length;

    // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
            indexEle = i;
            break;
        }
    }

    // Step 2: If no such element is found, reverse the entire array
        if (indexEle == -1) {
        reverseArray(arr, 0, n - 1);
            return arr;
    }

    // Step 3: Find the element just larger than arr[indexEle] and swap
        for (int i = n - 1; i > indexEle; i--) {
        if (arr[i] > arr[indexEle]) {
            int temp = arr[i];
            arr[i] = arr[indexEle];
            arr[indexEle] = temp;
            break;
        }
    }

    // Step 4: Reverse the part of the array after indexEle
    reverseArray(arr, indexEle + 1, n - 1);
            return arr;
        }

// Helper function to reverse an array or part of it
private static void reverseArray(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}



//    static int[] permutate(int[] arr) {
//
//        int indexEle=-1;
//        int n= arr.length;
//        for(int i=arr.length-2;i>=0;i--){
//            if(arr[i]<arr[i+1]){
//                indexEle= i;
//                break;
//            }
//        }
//        // If break point does not exist:
//        if (indexEle == -1) {
//            // reverse the whole array:
//            Collections.reverse(Collections.singletonList(arr));
//            return arr;
//        }
//
//        for (int i = n- 1; i > indexEle; i--) {
//            if (arr[i] > arr[indexEle]) {
//                int temp = arr[i];
//                arr[i]=arr[indexEle];
//                arr[indexEle]=temp;
//                break;
//            }
//        }
//
//        // Step 3: reverse the right half:
//        int[] sublist = Arrays.copyOfRange(arr,indexEle+1,n);
//        Collections.reverse(Collections.singletonList(sublist));
//
//        return arr;
//    }


    // Main function
    public static void main(String[] args) {
        // Example array
//        int[] array = {2,1,5,4,3,0,0};

        int[] array={3,2,1};
        // List to store the result
        int[] result = new int[array.length];


        int[] arr= permutate(array);
        // Print all permutations
        System.out.println("Permutation of the array:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
