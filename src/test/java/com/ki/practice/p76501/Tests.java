package com.ki.practice.p76501;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// absolutes	signs	            result
// [4,7,12]	    [true,false,true]	9
// [1,2,3]	    [false,false,true]	0

public class Tests {
    @Test
    @DisplayName("[4,7,12], [true,false,true] => 9")
    void t1() {
        assertThat(new Solution().solution(new int[]{4, 7, 12} , new boolean[]{true, false, true})).isEqualTo(9);
    }

    @Test
    @DisplayName("[1,2,3], [false,false,true] => 0")
    void t2() {
        assertThat(new Solution().solution(new int[]{1,2,3} , new boolean[]{false, false, true})).isEqualTo(0);
    }
}
