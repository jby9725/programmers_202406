package com.ki.practice.p12932;

public class Main {
    public static void main(String[] args) {

    }
}

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int index = 0;

        String numbers = String.valueOf(n);
        answer = new int[numbers.length()];

        for ( int i = numbers.length() - 1; i >= 0; i-- ) {
            answer[index] = (numbers.charAt(i)) - '0';
            index++;
        }

        return answer;
    }
}