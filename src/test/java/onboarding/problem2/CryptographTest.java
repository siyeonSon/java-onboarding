package onboarding.problem2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CryptographTest {
    @Test
    void 연속하는_중복_문자들을_제거한다() {
        assertThat(new Cryptograph("aaabaaaba").decode()).isEqualTo("a");
        assertThat(new Cryptograph("baaaba").decode()).isEqualTo("a");
        assertThat(new Cryptograph("a").decode()).isEqualTo("a");
        assertThat(new Cryptograph("abc").decode()).isEqualTo("abc");
    }

}