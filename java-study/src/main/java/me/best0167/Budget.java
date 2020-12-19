package me.best0167;

import java.util.Arrays;

public class Budget {

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;

        Arrays.sort(d);
        for (int value : d) {
            total += value;
            if (total <= budget) {
                answer++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution(d, budget));

        int[] d1 = {2, 2, 3, 3};
        int budget1 = 10;

        System.out.println(solution(d1, budget1));
    }
}
