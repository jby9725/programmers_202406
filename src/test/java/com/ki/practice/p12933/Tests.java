package com.ki.practice.p12933;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// n	    return
// 118372	873211

public class Tests {
    @Test
    @DisplayName("118372 => 873211")
    void t1() {
        assertThat(new Solution().solution(118372)).isEqualTo(873211);
    }

    @Test
    @DisplayName("123456 => 654321")
    void t2() {
        assertThat(new Solution().solution(123456)).isEqualTo(654321);
    }

}
