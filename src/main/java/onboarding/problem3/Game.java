package onboarding.problem3;

public class Game {
    private Game() {
    }

    public static int solve(int number) {
        int result = 0;
        for(int i = 3; i < number + 1; i++) {
            result += count(i);
        }
        return result;
    }

    private static int count(int number) {
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
