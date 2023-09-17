package onboarding.problem1;

public class Page {
    private int number;

    public Page(int number) {
        this.number = number;
    }

    private int plus(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
