import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        int letterCount = 1;
        String resultString =  Character.toString(inputString.charAt(0));
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputString.charAt(i - 1)) {
                letterCount++;
            } else {
                resultString += letterCount;
                letterCount = 1;
                resultString += inputString.charAt(i);
            }
        }
        resultString += letterCount;
        System.out.println(resultString);
    }
}