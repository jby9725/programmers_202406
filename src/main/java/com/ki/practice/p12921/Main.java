package com.ki.practice.p12921;

//import static java.lang.Math.*;
// 출처: https://developer-talk.tistory.com/764 [DevStory:티스토리]

public class Main {
    public static void main(String[] args) {

    }
}

// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
// 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//        (1은 소수가 아닙니다.)

// n	result
// 10	4
// 5    3

class Solution {
    public static int solution(int n) {
        int answer = 0;
        int count = 0;

//        int num = 25;
//        double result = sqrt(num);
//
//        System.out.println("25의 제곱근: " + result);
//        출처: https://developer-talk.tistory.com/764 [DevStory:티스토리]

        for (int i = 1; i <= n; i++) {
            count = 0;

            if (n == 1) {
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }

        return answer;
    }

}
