
import java.util.*;

public class tUf {
    public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    }

    public static int maxProfits(int[] prices) {

        int max = 0;
        int minvALUE = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minvALUE = Math.min(minvALUE, prices[i]);
            max = Math.max(max, prices[i] - minvALUE);
        }
        return max;
    }
    public static int nCr(int n,int r) {
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int) res;
    }

        public static List<List<Integer>> pascalsTriangle(int n) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int r=0;r<=n;r++){
            List<Integer> tempList = new ArrayList<>();
            for(int c=1;c<=r;c++){
                tempList.add(nCr(r-1,c-1));
            }
            ans.add(tempList);
        }
        return ans;
    }


    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] prices= {3,2,6,5,0,3};
//        int n = arr.length;
//        int maxSum = maxSubarraySum(arr, n);
//        int profit=maxProfits(prices);
//        System.out.println("The maximum subarray sum is: " + profit);

        int n = 5;
        List<List<Integer>> ans = pascalsTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

}

