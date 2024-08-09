import java.util.Scanner;

// TODO: Define the Package class with a private member variable 'weight' and a constructor

// TODO: Implement the 'getShippingCost' method to calculate the shipping cost based on the package weight

class Package {
    private double weight;

    public Package(double weight) {
        this.weight = weight;
    }

    public double getShippingCost() {
        if (weight <= 5.0) {
            return 5.0;
        } else {
            return Math.ceil(weight);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read the package weight from the user
        double weight = scanner.nextDouble();
        // TODO: Create an instance of the Package class with the entered weight
        Package pkg = new Package(weight);
        // TODO: Print the shipping cost
        System.out.println(pkg.getShippingCost());
    }
}