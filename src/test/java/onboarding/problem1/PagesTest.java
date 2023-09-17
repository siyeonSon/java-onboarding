package onboarding.problem1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PagesTest {
    @Test
    void 최대_점수를_계산할_수_있다() {
        List<Integer> numbers = List.of(123, 124);
        int point = new Pages(numbers).calculatePoint();
        assertThat(point).isEqualTo(8);
    }

    @Test
    void 범위_내의_페이지이다() {
        List<Integer> numbers = List.of(-1, 0);
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Pages(numbers));
        assertEquals(e.getMessage(), "페이지 범위를 벗어났습니다");
    }
}