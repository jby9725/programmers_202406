package com.ki.practice.p12947;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// x	return
// 10	true
// 12	true
// 11	false
// 13	false

public class Tests {
    @Test
    @DisplayName("10 => true")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(true);
    }

    @Test
    @DisplayName("12 => true")
    void t2() {
        assertThat(new Solution().solution(12)).isEqualTo(true);
    }

    @Test
    @DisplayName("11 => false")
    void t3() {
        assertThat(new Solution().solution(11)).isEqualTo(false);
    }

    @Test
    @DisplayName("13 => false")
    void t4() {
        assertThat(new Solution().solution(13)).isEqualTo(false);
    }
}
