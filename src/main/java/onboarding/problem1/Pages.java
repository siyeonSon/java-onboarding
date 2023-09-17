package onboarding.problem1;

import java.util.ArrayList;
import java.util.List;

public class Pages {
    private List<Page> pages;

    public Pages(List<Integer> numbers) {
        this.pages = new ArrayList<>();
        int left = numbers.get(0);
        int right = numbers.get(1);

        pages.add(new Page(left));
        pages.add(new Page(right));
    }

    public int calculatePoint() {
        Page left = pages.get(0);
        Page right = pages.get(1);
        return Math.max(left.calculate(), right.calculate());
    }
}
