package com.ki.practice.p12934;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

    }
}

// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
// n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

class Solution {
    public long solution(long n) {

//        출처: https://developer-talk.tistory.com/764 [DevStory:티스토리]
//        int num = 25;
//        double result = sqrt(num);
//        System.out.println("25의 제곱근: " + result);

        long answer = 0;

        double result = sqrt(n);
//        System.out.println("제곱근 : " + result);

        if(result % 1 == 0.0)
        {
//            System.out.println("제곱근이 양의 정수이다.");
            answer = (int) result + 1;

            return answer * answer;
        }
        else
        {
            return -1;
        }

    }
}