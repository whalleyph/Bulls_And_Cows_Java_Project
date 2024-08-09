import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner instance to read input
        Scanner scanner = new Scanner(System.in);

        // read the number of elements
        int n = scanner.nextInt();

        // create your array here
        int[] numArray = new int[n];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }
        // use a loop to read the array elements
        int sum = 0;
        for (int j: numArray) {
            if (j%3 == 0) {
                sum += j;
            }
        }
        // use a loop to calculate the sum of elements that are multiples of 3

        // close the scanner
        scanner.close();
        System.out.println(sum);
    }
}