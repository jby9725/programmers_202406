package com.ki.practice.p12912;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// a	b	return
// 3	5	12
// 3	3	3
// 5	3	12

public class Tests {
    @Test
    @DisplayName("3, 5 => 12")
    void t1() {
        assertThat(new Solution().solution(3, 5)).isEqualTo(12L);
    }

    @Test
    @DisplayName("3, 3 => 3")
    void t2() {
        assertThat(new Solution().solution(3, 3)).isEqualTo(3L);
    }

    @Test
    @DisplayName("5, 3 => 12")
    void t3() {
        assertThat(new Solution().solution(5, 3)).isEqualTo(12L);
    }

}
