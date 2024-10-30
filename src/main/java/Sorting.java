import java.util.Arrays;

public class Sorting
{
    public static void main(String[] args) {

        int[] arr = {21,11,12,23,43,56,1,16,0,99,2,823,123,12,23,45,667,89,0};
        //bubblesort(arr,arr.length);
        selectionsort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }


    private static void bubblesort(int[] arr, int n) {

        boolean swapped;

        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    private static void selectionsort(int[] arr, int n) {

        for(int j=0;j<n-1;j++) {
            int smallest = j;

            for (int i = j + 1; i < n; i++) {
                if (arr[i] < arr[smallest])
                    smallest = i;
            }
            int temp = arr[smallest];
            arr[smallest]=arr[j];
            arr[j]=temp;

        }
    }

    private static void insertionsort(int[] arr, int n) {

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
        }
    }

    private static void sort(int[] arr){


        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){

            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;

            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;

                high--;

            }
        }

    }

    }
