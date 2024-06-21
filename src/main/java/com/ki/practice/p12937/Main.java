package com.ki.practice.p12937;

public class Main {
    public static void main(String[] args) {

    }
}

// 정수 num이 짝수일 경우 "Even"을 반환하고
// 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

class Solution {
    public String solution(int num) {
        String answer = "";

        // num이 음수인 경우도 포함해야 한다.
        if (num % 2 == 1 || num % 2 == -1){
            answer = "Odd";
        }
        else if (num % 2 == 0){
            answer = "Even";
        }

        return answer;
    }
}