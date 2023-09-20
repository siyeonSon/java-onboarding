package onboarding;

import onboarding.problem5.Money;

import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();
        answer = Money.exchange(money);
        return answer;
    }
}
