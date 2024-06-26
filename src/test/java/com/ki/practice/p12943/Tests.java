package com.ki.practice.p12943;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// n	    result
// 6	    8
// 16	    4
// 626331	-1

public class Tests {
    @Test
    @DisplayName("6 => 8")
    void t1() {
        assertThat(new Solution().solution(6)).isEqualTo(8);
    }

    @Test
    @DisplayName("16 => 4")
    void t2() {
        assertThat(new Solution().solution(16)).isEqualTo(4);
    }

    @Test
    @DisplayName("626331 => -1")
    void t3() {
        assertThat(new Solution().solution(626331)).isEqualTo(-1);
    }
}
