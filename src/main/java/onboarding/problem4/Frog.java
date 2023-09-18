package onboarding.problem4;

public class Frog {
    private String word;

    public Frog(String word) {
        this.word = word;
    }

    public String say() {
        StringBuilder result = new StringBuilder();
        for (char w : word.toCharArray()) {
            result.append(reverse(w));
        }
        return result.toString();
    }

    private char reverse(char word) {
        if (Character.isUpperCase(word)) {
            return (char) ('Z' - (word - 'A'));
        } else if (Character.isLowerCase(word)) {
            return (char) ('z' - (word - 'a'));
        }
        return word;
    }
}
