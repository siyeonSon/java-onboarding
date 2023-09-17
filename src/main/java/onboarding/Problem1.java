package onboarding;

import onboarding.problem1.Pages;
import onboarding.problem1.Result;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        try {
            int pobiScore = new Pages(pobi).calculatePoint();
            int crongScore = new Pages(crong).calculatePoint();

            return Result.calculate(pobiScore, crongScore).getValue();
        }
        catch (IllegalArgumentException exception) {
            return Result.ERROR.getValue();
        }
    }
}