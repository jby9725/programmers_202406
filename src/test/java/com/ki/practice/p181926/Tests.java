package com.ki.practice.p181926;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3, 10 => [3, 4, 5, 6, 7, 8, 9, 10]")
    void t1() {
        assertThat(new Solution().solution(3, 10)).isEqualTo(new int[]{3, 4, 5, 6, 7, 8, 9, 10});
    }

    @Test
    @DisplayName("5, 10 => [5, 6, 7, 8, 9, 10]")
    void t2() {
        assertThat(new Solution().solution(5, 10)).isEqualTo(new int[]{5, 6, 7, 8, 9, 10});
    }
}
