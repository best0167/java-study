package me.best0167;

import java.util.Arrays;

public class XIntervalNumberCount {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 1; i <= n; i++) {
            answer[i-1] = (long) x * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(solution(x, n)));

        int x1 = 4;
        int n1 = 3;
        System.out.println(Arrays.toString(solution(x1, n1)));

        int x2 = -4;
        int n2 = 2;
        System.out.println(Arrays.toString(solution(x2, n2)));
    }
}
