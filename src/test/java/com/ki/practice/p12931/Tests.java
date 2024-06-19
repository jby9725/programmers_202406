package com.ki.practice.p12931;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// n	answer
// 123	6
// 987	24

public class Tests {
    @Test
    @DisplayName("123 => 6")
    void t1() {
        assertThat(new Solution().solution(123)).isEqualTo(6);
    }

    @Test
    @DisplayName("987 => 24")
    void t2() {
        assertThat(new Solution().solution(987)).isEqualTo(24);
    }
}
