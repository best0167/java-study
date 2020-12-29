package me.best0167;

import java.util.ArrayList;
import java.util.List;

public class TernaryFlip {
    public static int solution(int n) {
        int answer = 0;
        int count = 0;
        int a = n;

        while (a > 0) {
            a /= 3;
            count++;
        }
        for(int i = 1; i <= count; i++) {
            answer += (n % 3) * Math.pow(3, count - i);
            n /= 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));

        int n1 = 125;
        System.out.println(solution(n1));
    }
}
