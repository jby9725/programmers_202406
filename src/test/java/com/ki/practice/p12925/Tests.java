package com.ki.practice.p12925;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 예를 들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.

public class Tests {
    @Test
    @DisplayName("\"1234\" => 1234")
    void t1() {
        assertThat(new Solution().solution("1234")).isEqualTo(1234);
    }
}
