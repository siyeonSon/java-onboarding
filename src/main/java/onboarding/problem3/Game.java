package onboarding.problem3;

public class Game {
    private final int number;

    public Game(int number) {
        this.number = number;
    }

    public int solve() {
        int result = 0;
        for(int i = 3; i < number + 1; i++) {
            result += count(i);
        }
        return result;
    }

    private int count(int number) {
        int result = 0;
        while (number > 0) {
            if (number % 10 != 0 && number % 10 % 3 == 0) {
                result += 1;
            }
            number /= 10;
        }
        return result;
    }
}
