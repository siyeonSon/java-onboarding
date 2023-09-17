package onboarding.problem1;

public enum Result {
    POBI(1), DRAW(0), CRONG(2), ERROR(-1);

    private final int value;

    private Result(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Result calculate(int pobiScore, int crongScore) {
        if (pobiScore > crongScore) {
            return POBI;
        }
        else if (pobiScore == crongScore) {
            return DRAW;
        }
        else {
            return CRONG;
        }
    }
}
