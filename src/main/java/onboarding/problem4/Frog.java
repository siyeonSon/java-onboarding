package onboarding.problem4;

public class Frog {
    private Frog() {
    }

    public static String say(String word) {
        StringBuilder result = new StringBuilder();
        for (char w : word.toCharArray()) {
            result.append(reverse(w));
        }
        return result.toString();
    }

    private static char reverse(char word) {
        if (Character.isUpperCase(word)) {
            return (char) ('Z' - (word - 'A'));
        } else if (Character.isLowerCase(word)) {
            return (char) ('z' - (word - 'a'));
        }
        return word;
    }
}
