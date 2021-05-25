package me.best0167.inflearn.array;

import java.util.Arrays;

public class RankExtract {
    public static int[] solution(int n, int[] array) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if(array[j] > array[i]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] array = {87, 89, 92, 100, 76};
        System.out.println(Arrays.toString(solution(n, array)));
    }
}
