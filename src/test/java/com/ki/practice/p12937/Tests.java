package com.ki.practice.p12937;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// num	return
// 3	"Odd"
// 4	"Even"

public class Tests {
    @Test
    @DisplayName("-3 => \"Odd\"")
    void t1() {
        assertThat(new Solution().solution(-3)).isEqualTo("Odd");
    }

    @Test
    @DisplayName("-4 => \"Even\"")
    void t2() {
        assertThat(new Solution().solution(-4)).isEqualTo("Even");
    }

}
