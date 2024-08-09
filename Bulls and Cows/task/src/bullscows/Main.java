package bullscows;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    static char[] chars = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int digits = sc.nextInt();
            int possibleSymbols = sc.nextInt() - 1;
            boolean gameInProgress = true;
            if (digits > 36 || possibleSymbols > 35) {
                System.out.println("error");
                return;
            }
            if (possibleSymbols < digits) {
                System.out.println("error");
                return;
            }
            if (digits < 1) {
                System.out.println("error");
                return;
            }
            String secretCode = randomCode(digits, possibleSymbols);
            String maskedSecret = "*".repeat(secretCode.length());
            String possibleSymbolString = possibleSymbols < 10 ? String.format("(0-%c)", chars[possibleSymbols]) : String.format("(0-9, a-%c)", chars[possibleSymbols]);
            System.out.println("The secret is prepared: " + maskedSecret + " " + possibleSymbolString);

            while (gameInProgress) {
                String guess = sc.next();
                if (!(guess.length() == digits)) {
                    System.out.println("error");
                    return;
                }
                System.out.println(grader(secretCode, guess));
                if (Objects.equals(guess, secretCode)) {
                    gameInProgress = false;
                    System.out.println("Congratulations! You guessed the secret code.");
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public static String randomCode(int digits, int possibleSymbols) {
            StringBuilder secretCode = new StringBuilder();
            for (int i = 0; secretCode.length() < digits; i++) {
                int randomNumber = (int) (Math.random() * possibleSymbols);

                char randomNumberAsChar = chars[randomNumber];
                boolean numberIsUnique = true;
                for (int j = 0; j < secretCode.length(); j++) {
                    if (randomNumberAsChar == secretCode.charAt(j)) {
                        numberIsUnique = false;
                        break;
                    }
                }
                if (numberIsUnique) {
                    secretCode.append(randomNumberAsChar);
                }
            }
            return secretCode.toString();
    }

    public static String grader(String secretCode, String guess) {
            int bulls = 0;
            int cows = 0;
            String grade;
            for (int i = 0; i < secretCode.length(); i++) {
                if (secretCode.charAt(i) == guess.charAt(i)) {
                    bulls++;
                } else {
                    boolean cowIsPresent = false;
                    for (int j = 0; j < secretCode.length(); j++) {
                        if (secretCode.charAt(i) == guess.charAt(j)) {
                            cowIsPresent = true;
                            break;
                        }
                    }
                    if (cowIsPresent) {
                        cows++;
                    }
                }
            }

            if (bulls == 0 && cows == 0) {
                grade = "none";
            } else if (bulls == 0) {
                grade = cows + " cow(s)";
            } else if (cows == 0) {
                grade = bulls + " bull(s)";
            } else {
                grade = bulls + " bull(s) and " + cows + " cow(s)";
            }
            return grade;
    }
}