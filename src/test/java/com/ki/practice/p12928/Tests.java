package com.ki.practice.p12928;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// n	return
// 12	28
// 5	6

public class Tests {
    @Test
    @DisplayName("12 => 28")
    void t1() {
        assertThat(new Solution().solution(12)).isEqualTo(28);
    }

    @Test
    @DisplayName("5 => 6")
    void t2() {
        assertThat(new Solution().solution(5)).isEqualTo(6);
    }
}
