package onboarding.problem5;

import java.util.ArrayList;
import java.util.List;

public class Money {
    private static final List<Integer> denominations = List.of(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);

    private Money() {
    }

    public static List<Integer> exchange(int money) {
        List<Integer> result = new ArrayList<>();
        for (Integer denomination : denominations) {
            result.add((int) money / denomination);
            money = money % denomination;
        }
        return result;
    }
}
