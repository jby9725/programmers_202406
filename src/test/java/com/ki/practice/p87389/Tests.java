package com.ki.practice.p87389;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// n	result
// 10	3
// 12	11

public class Tests {
    @Test
    @DisplayName("10 => 3")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(3);
    }

    @Test
    @DisplayName("12 => 11")
    void t2() {
        assertThat(new Solution().solution(12)).isEqualTo(11);
    }

}
