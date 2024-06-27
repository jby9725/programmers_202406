package com.ki.practice.p12910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// arr	            divisor	return
// [5, 9, 7, 10]	5	    [5, 10]
// [2, 36, 1, 3]	1	    [1, 2, 3, 36]
// [3,2,6]	        10	    [-1]

public class Tests {
    @Test
    @DisplayName("[5, 9, 7, 10], 5 => [5, 10]")
    void t1() {
        assertThat(new Solution().solution(new int[]{5, 9, 7, 10}, 5)).isEqualTo(new int[]{5, 10});
    }

    @Test
    @DisplayName("[2, 36, 1, 3], 1 => [1, 2, 3, 36]")
    void t2() {
        assertThat(new Solution().solution(new int[]{2, 36, 1, 3}, 1)).isEqualTo(new int[]{1, 2, 3, 36});
    }

    @Test
    @DisplayName("[3,2,6], 10 => [-1]")
    void t3() {
        assertThat(new Solution().solution(new int[]{3, 2, 6}, 10)).isEqualTo(new int[]{-1});
    }
}
