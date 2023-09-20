package onboarding.problem4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogTest {
    @Test
    void 청개구리_사전을_참고하여_단어를_반대로_반환한다() {
        Assertions.assertThat(Frog.say("A")).isEqualTo("Z");
        Assertions.assertThat(Frog.say("z")).isEqualTo("a");
        Assertions.assertThat(Frog.say(" ")).isEqualTo(" ");
        Assertions.assertThat(Frog.say("I love you")).isEqualTo("R olev blf");
    }
}