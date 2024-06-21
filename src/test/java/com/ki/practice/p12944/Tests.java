package com.ki.practice.p12944;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// arr	        return
// [1,2,3,4]	2.5
// [5,5]	    5

public class Tests {
    @Test
    @DisplayName("[1,2,3,4] => 2.5")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4})).isEqualTo(2.5);
    }
    @Test
    @DisplayName("[5,5] => 5")
    void t2() {
        assertThat(new Solution().solution(new int[]{5, 5})).isEqualTo(5);
    }

}
