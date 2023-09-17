package onboarding.problem1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PageTest {
    @Test
    void 한_페이지의_최대_점수를_계산할_수_있다() {
        Page page = new Page(10);
        int score = page.calculate();

        assertThat(score).isEqualTo(1);
    }
}