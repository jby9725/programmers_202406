package com.ki.practice.p12919;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// seoul	        return
// ["Jane", "Kim"]	"김서방은 1에 있다"

public class Tests {
    @Test
    @DisplayName("3, 5 => 12")
    void t1() {
        assertThat(new Solution().solution(new String[]{"Jane", "Kim"})).isEqualTo("김서방은 1에 있다");
    }

}
