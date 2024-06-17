package com.ki.practice.p12921;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// n	result
// 10	4
// 5    3

public class Tests {

    @Test
    @DisplayName("10 => 4")
    void t1(){
        assertThat(Solution.solution(10)).isEqualTo(4);
    }

    @Test
    @DisplayName("5 => 3")
    void t2(){
        assertThat(Solution.solution(5)).isEqualTo(3);
    }


}
