package onboarding.problem3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    @Test
    void 일부터_number까지_쳐야_할_손벽의_개수를_구한다() {
        assertThat(Game.solve(1)).isEqualTo(0);
        assertThat(Game.solve(6)).isEqualTo(2);
        assertThat(Game.solve(13)).isEqualTo(4);
        assertThat(Game.solve(33)).isEqualTo(14);
    }
}