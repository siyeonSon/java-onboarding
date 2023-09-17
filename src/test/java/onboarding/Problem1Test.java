package onboarding;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Problem1Test {
    @Test
    void 두_사람의_점수_비교에_성공한다() {
        List<Integer> pobi = List.of(3, 4);
        List<Integer> crong = List.of(5, 6);
        int result = Problem1.solution(pobi, crong);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void 두_사람의_점수_비교에_실패하여_예외가_발생한다() {
        List<Integer> pobi = List.of(1, 3);
        List<Integer> crong = List.of(3, 4);
        int result = Problem1.solution(pobi, crong);
        Assertions.assertThat(result).isEqualTo(-1);
    }
}