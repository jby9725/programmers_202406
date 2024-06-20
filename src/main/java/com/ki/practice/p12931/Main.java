package com.ki.practice.p12931;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    }
}

// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

class Solution {
    public int solution(int n) {
        int answer = 0;

        int temp = 0;
        int temp2 = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            temp2 = n / 10;
            temp = n % 10;
            n = temp2;
//            System.out.println(temp);
//            System.out.println(temp2);
            answer += temp;
//            System.out.println("=============");
            if(temp2 == 0)
                break;
        }

        return answer;
    }
}

//         int temp = 0;
//        int temp2 = 0;
//        int num = n;
//
//
//        do {
//            temp = num % 10;
//            temp2 = num / 10;
//
//            System.out.println(temp); // 3
//            System.out.println(temp2); // 12
//            System.out.println("===========");
//
//            answer += temp;
//
//            num = temp2;
//            temp2 = temp;
//
//        } while (temp2 != 0);