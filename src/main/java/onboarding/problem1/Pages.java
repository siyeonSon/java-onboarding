package onboarding.problem1;

import java.util.ArrayList;
import java.util.List;

public class Pages {
    private List<Page> pages;

    public Pages(List<Integer> numbers) {
        this.pages = new ArrayList<>();
        int left = numbers.get(0);
        int right = numbers.get(1);

        isValidate(left, right);

        pages.add(new Page(left));
        pages.add(new Page(right));
    }

    public int calculatePoint() {
        Page left = pages.get(0);
        Page right = pages.get(1);
        return Math.max(left.calculate(), right.calculate());
    }

    private void isValidate(int left, int right) {
        isInRange(left, right);

        isStart(left);
        isStart(right);
    }

    private void isInRange(int left, int right) {
        if (left < 1 || right > 400) {
            throw new IllegalArgumentException("페이지 범위를 벗어났습니다");
        }
    }

    private void isStart(int number) {
        if (number <= 1) {
            throw new IllegalArgumentException("시작 면이 나올 수 없습니다");
        }
    }
}
