package me.best0167;

import java.util.stream.IntStream;

public class IntegerSquareRoot {
    public static long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        if(result == (int) result) {
            answer = (long) ((long)(result+1)*(result+1));
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));

        long n1 = 3;
        System.out.println(solution(n1));
    }
}
