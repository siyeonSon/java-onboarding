package onboarding.problem4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogTest {
    @Test
    void 청개구리_사전을_참고하여_단어를_반대로_반환한다() {
        Assertions.assertThat(new Frog("A").say()).isEqualTo("Z");
        Assertions.assertThat(new Frog("z").say()).isEqualTo("a");
        Assertions.assertThat(new Frog(" ").say()).isEqualTo(" ");
        Assertions.assertThat(new Frog("I love you").say()).isEqualTo("R olev blf");
    }

}