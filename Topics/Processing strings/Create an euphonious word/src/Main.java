import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int discordantCounter = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "aeiouy";
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < vowels.length(); j++) {
                if(word.charAt(i) == vowels.charAt(j)) {
                    isVowel = true;
                    vowelCount++;
                    consonantCount=0;
                }
            }
            if (!isVowel) {
                consonantCount++;
                vowelCount = 0;
            }
            if ((vowelCount > 1 && vowelCount%2 != 0) || (consonantCount > 1 && consonantCount%2 != 0)) {
                discordantCounter++;
            }
        }
        System.out.println(discordantCounter);
    }
}