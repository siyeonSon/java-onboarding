package onboarding;

import onboarding.problem3.Game;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        answer = new Game(number).solve();
        return answer;
    }
}
