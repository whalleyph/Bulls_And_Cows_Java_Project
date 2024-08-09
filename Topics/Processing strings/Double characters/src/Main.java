import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String newString = "";
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        for (int i = 0; i < inputString.length(); i++) {
            newString += inputString.charAt(i);
            newString += inputString.charAt(i);
        }
        System.out.println(newString);
    }
}