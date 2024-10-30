import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KarelSalesman {

    public static void main(String[] arg) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        List<Long> results = new ArrayList<>(); // To store results
        List<Long> resultUpdated = new ArrayList<>(); // To store results

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read n and x
            int n = scanner.nextInt(); // Number of different models
            int x = scanner.nextInt(); // Max number of cars per customer

            // Create an array to hold the number of cars for each model
            long[] cars = new long[n]; // Using long to handle large numbers

            // Read the number of cars for each model
            for (int j = 0; j < n; j++) {
                cars[j] = scanner.nextLong(); // Read the number of cars for model j
            }
            long totalCustomers = calculateMinimumCustomer(cars, x);
            long totalCustomer = calculateMinimumCustomers(cars, x);
            results.add(totalCustomers); // Store the result
            resultUpdated.add(totalCustomer);
        }


        for (long result : results) {
            System.out.println(result);
        }
        for (long result : resultUpdated) {
            System.out.println(result);
        }

        scanner.close();
    }

    static long calculateMinimumCustomer(long[] cars,int x) {

        long sum = 0;
        long maxCar=0;
        for (long k : cars) {
            sum += k;
            maxCar = Math.max(k,maxCar);
        }


        long numner_of_cust = (long) Math.ceil(sum / x) +1 ;

        return Math.max(numner_of_cust, maxCar);
    }

    static long calculateMinimumCustomers(long[] cars,int x){
        long totalCars = 0;
        long maxModelCars = 0;

        // Calculate total cars and find the maximum cars of any single model
        for (long count : cars) {
            totalCars += count;
            maxModelCars = Math.max(maxModelCars, count);
        }


        // Calculate the number of customers needed for total cars
        long totalCustomers = (totalCars + x - 1) / x; // Using ceiling without floating-point division

        // The number of customers needed is at least as much as the maximum model's cars
        return (long) Math.max(totalCustomers, maxModelCars);
    }

}
