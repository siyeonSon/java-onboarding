package onboarding.problem1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PagesTest {
    @Test
    void 최대_점수를_계산할_수_있다() {
        List<Integer> numbers = List.of(123, 124);
        int point = new Pages(numbers).calculatePoint();
        assertThat(point).isEqualTo(8);
    }
}