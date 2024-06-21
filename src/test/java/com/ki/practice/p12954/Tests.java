package com.ki.practice.p12954;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// x	n	answer
// 2	5	[2,4,6,8,10]
// 4	3	[4,8,12]
// -4	2	[-4, -8]

public class Tests {
    @Test
    @DisplayName("2, 5 => [2,4,6,8,10]")
    void t1() {
        assertThat(new Solution().solution(2, 5)).isEqualTo(new int[]{2, 4, 6, 8, 10});
    }

    @Test
    @DisplayName("4, 3 => [4,8,12]")
    void t2() {
        assertThat(new Solution().solution(4, 3)).isEqualTo(new int[]{4, 8, 12});
    }

    @Test
    @DisplayName("-4, 2 => [-4, -8]")
    void t3() {
        assertThat(new Solution().solution(-4, 2)).isEqualTo(new int[]{-4, -8});
    }

}
