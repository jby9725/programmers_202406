package com.ki.practice.p12933;

public class Main {
    public static void main(String[] args) {

    }
}

// 함수 solution은 정수 n을 매개변수로 입력받습니다.
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.

class Solution {
    public long solution(long n) {
        long answer = 0;

        String num = String.valueOf(n);
        long[] numbers = new long[num.length()];

        for (int i = 0; i < num.length(); i++) {
            numbers[i] = num.charAt(i) - '0';
        }

        for (int i = 0; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (numbers[i] > numbers[j]) {
                    long temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < num.length(); i++) {
            long temp = numbers[i] * (long) Math.pow(10, (i));
            answer += temp;
        }

        return answer;
    }
}