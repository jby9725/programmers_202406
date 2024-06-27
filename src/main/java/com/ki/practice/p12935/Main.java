package com.ki.practice.p12935;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// 제일 작은 수 제거하기
// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
// 예를 들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

// 제한 조건
// arr은 길이 1 이상인 배열입니다.
// 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

// 입출력 예
// arr	        return
// [4,3,2,1]	[4,3,2]
// [10]	        [-1]

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int firstNumber = arr[0];
        boolean isSameNumbers = true;
        int min = firstNumber;

        if (arr.length == 1) return new int[]{-1};

        // 예외처리_모든 배열의 값이 같은지 확인.
        for (int i = 1; i < arr.length; i++)
            if (isSameNumbers && firstNumber != arr[i])
                isSameNumbers = false;

        // 모든 배열의 값이 같은 경우. firstNumber 와 나머지 모든 배열이 같아야만 isSameNumber 가 true 다.
        if (isSameNumbers)
            return new int[]{-1};

        // 배열 안의 최소값 찾기
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        List<Integer> ans = new ArrayList<>();

        for (int i : arr)
            ans.add(i);

        // value가 1인 element 삭제
        while (ans.remove(Integer.valueOf(min))) {
        }

        answer = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);

        return answer;
    }
}