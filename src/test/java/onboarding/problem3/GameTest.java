package onboarding.problem3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    @Test
    void 일부터_number까지_쳐야_할_손벽의_개수를_구한다() {
        assertThat(new Game(1).solve()).isEqualTo(0);
        assertThat(new Game(6).solve()).isEqualTo(2);
        assertThat(new Game(13).solve()).isEqualTo(4);
        assertThat(new Game(33).solve()).isEqualTo(14);
    }
}