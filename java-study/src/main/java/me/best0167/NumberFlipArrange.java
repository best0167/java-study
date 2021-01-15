package me.best0167;

import java.util.Arrays;

public class NumberFlipArrange {
    public static int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for(int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        /* long a = n;
        int count = 0;

        while(a > 0) {
            a /= 10;
            count++;

            answer = new int[count];

            for(int i = 0; i < count; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        }*/
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
}
