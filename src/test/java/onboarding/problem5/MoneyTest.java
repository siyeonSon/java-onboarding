package onboarding.problem5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {
    @Test
    void 큰_금액의_화폐_위주로_교환한다() {
        assertThat(Money.exchange(50237)).isEqualTo(List.of(1, 0, 0, 0, 0, 2, 0, 3, 7));
        assertThat(Money.exchange(15000)).isEqualTo(List.of(0, 1, 1, 0, 0, 0, 0, 0, 0));
    }
}