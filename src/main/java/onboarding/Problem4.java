package onboarding;

import onboarding.problem4.Frog;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        answer = new Frog(word).say();
        return answer;
    }
}
