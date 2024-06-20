package com.ki.practice.p12932;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class Tests {
    @Test
    @DisplayName("12345 => [5,4,3,2,1]")
    void t1() {
        int[] answer = {5,4,3,2,1};
        assertThat(new Solution().solution(12345)).isEqualTo(answer);
    }

    @Test
    @DisplayName("54321 => [1,2,3,4,5]")
    void t2() {
        int[] answer = {1,2,3,4,5};
        assertThat(new Solution().solution(54321)).isEqualTo(answer);
    }
}
