package com.ki.practice.p86051;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// numbers	            result
// [1,2,3,4,6,7,8,0]	14
// [5,8,4,0,6,7,9]	    6
public class Tests {
    @Test
    @DisplayName("[1,2,3,4,6,7,8,0] => 14")
    void t1() {
        assertThat(new Solution().solution(new int[]{1,2,3,4,6,7,8,0})).isEqualTo(14);
    }

    @Test
    @DisplayName("[5,8,4,0,6,7,9] => 6")
    void t2() {
        assertThat(new Solution().solution(new int[]{5,8,4,0,6,7,9})).isEqualTo(6);
    }

}
