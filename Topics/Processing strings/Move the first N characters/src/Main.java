import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] inputAsArray = inputString.split(" ");
        String word = inputAsArray[0];
        int num = Integer.parseInt(inputAsArray[1]);

        if (num > word.length()) {
            System.out.println(word);
        } else {
            String[] separatedStringArray = {"", ""};
            for (int i = 0; i < word.length(); i++) {
                if (i < num) {
                    separatedStringArray[1] += word.charAt(i);
                } else {
                    separatedStringArray[0] += word.charAt(i);
                }
            }
            String Result = String.join("", separatedStringArray);
            System.out.println(Result);
        }
    }
}