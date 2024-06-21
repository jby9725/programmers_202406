package com.ki.practice.p12954;

public class Main {
    public static void main(String[] args) {

    }
}

// 함수 solution은 정수 x와 자연수 n을 입력 받아,
// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

// 제한 조건
// x는 -10000000 이상, 10000000 이하인 정수입니다.
// n은 1000 이하인 자연수입니다.

// 프로그래머스에서는 int로 형변환하지 않아도 정답으로 처리해주었기 때문에 여기서도 별도로 캐스팅 해주지 않았습니다.

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long step = x;

        for (int i = 0; i < n; i++) {
            answer[i] = step;
            step += x;
        }

        return answer;
    }
}