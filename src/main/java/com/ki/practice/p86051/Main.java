package com.ki.practice.p86051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
// 제한사항
// 1 ≤ numbers의 길이 ≤ 9
// 0 ≤ numbers의 모든 원소 ≤ 9
// numbers의 모든 원소는 서로 다릅니다.

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;

        int[] complete_numbers_list = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] number_count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < complete_numbers_list.length; j++)
                if (numbers[i] == complete_numbers_list[j])
                    number_count[j]++;

        for (int i = 0; i < number_count.length; i++)
            if (number_count[i] == 0)
                sum += i;

        System.out.println("sum :" + sum);

        answer = sum;

        return answer;
    }
}