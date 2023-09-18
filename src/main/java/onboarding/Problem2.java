package onboarding;

import onboarding.problem2.Cryptograph;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        answer = new Cryptograph(cryptogram).decode();
        return answer;
    }
}
