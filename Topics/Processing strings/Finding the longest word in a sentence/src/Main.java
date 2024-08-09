import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        // Your code here
        String[] wordArray = sentence.split(" ");
        String resultString = "";
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > resultString.length()) {
                resultString = wordArray[i];
            }
        }
        System.out.println(resultString);
    }
}