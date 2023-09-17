package onboarding.problem1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ResultTest {

    @Test
    void 두_사람의_점수를_비교하여_승자를_정한다() {
        Assertions.assertThat(Result.calculate(12, 10)).isEqualTo(Result.POBI);
        Assertions.assertThat(Result.calculate(12, 12)).isEqualTo(Result.DRAW);
        Assertions.assertThat(Result.calculate(10, 12)).isEqualTo(Result.CRONG);
    }
}