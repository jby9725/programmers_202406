package com.ki.practice.p12947;

public class Main {
    public static void main(String[] args) {

    }
}

// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        // 1. String 으로 변환
        String numX = Integer.toString(x);
        // 2. String 길이만큼의 char 배열로 차례대로 넣기
        char[] charX = numX.toCharArray();
        // 3. char 배열 크기만큼의 int 배열 만든 다음에 char to int
        int[] intX = new int[charX.length];
        for (int i = 0; i < charX.length; i++) {
            intX[i] = charX[i] - '0';
        }
        // 4. int 배열 모두 더하기
        for (int i = 0; i < intX.length; i++) {
            sum += intX[i];
        }
        // 5. x 값을 모두 더한 값으로 나누었을 때 나머지가 0인지 확인하기. 0이면 true, 아니면 false
        int rs = x % sum;
        if (rs == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}