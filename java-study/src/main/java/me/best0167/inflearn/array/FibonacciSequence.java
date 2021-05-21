package me.best0167.inflearn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSequence {
    public static int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        return answer;
    }
    /*public static int solution(int n) {
        int answer = 0;

        int a = 1, b = 1, c;
        System.out.println(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a+b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }

        return answer;
    }*/


    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
}
